package com.kayhennig.vanplusplus.block;

import java.util.List;
import java.util.OptionalInt;

import org.jetbrains.annotations.Nullable;

import com.kayhennig.vanplusplus.block.entity.ShelfBlockEntity;
import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class ShelfBlock extends BlockWithEntity {
    public static final MapCodec<ShelfBlock> CODEC = createCodec(ShelfBlock::new);
    public static final List<BooleanProperty> SLOT_OCCUPIED_PROPERTIES = List.of(
		Properties.SLOT_0_OCCUPIED,
		Properties.SLOT_1_OCCUPIED,
		Properties.SLOT_2_OCCUPIED,
		Properties.SLOT_3_OCCUPIED
	);
    
    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    public ShelfBlock(Settings settings) {
        super(settings);

        BlockState blockState = this.stateManager.getDefaultState().with(HorizontalFacingBlock.FACING, Direction.NORTH);

		for (BooleanProperty booleanProperty : SLOT_OCCUPIED_PROPERTIES) {
			blockState = blockState.with(booleanProperty, Boolean.valueOf(false));
		}

		this.setDefaultState(blockState);
    }

    @Nullable
    @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
        // use opposite of block facing as default facing
        for (Direction direction : ctx.getPlacementDirections()) {
            if (direction.getAxis().isHorizontal()) {
                BlockState blockState = this.getDefaultState().with(HorizontalFacingBlock.FACING, direction.getOpposite());
                if (blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
                    return blockState;
                }
            }
        }

        return null;
	}

    @Override
	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(HorizontalFacingBlock.FACING).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getOpposite() == state.get(HorizontalFacingBlock.FACING) && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }

    @Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return state.with(HorizontalFacingBlock.FACING, rotation.rotate(state.get(HorizontalFacingBlock.FACING)));
	}

    @Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        return switch (state.get(HorizontalFacingBlock.FACING)) {
            case NORTH -> VoxelShapes.cuboid(0.0f, 0.125f, 0.5f, 1.0f, 1.0f, 1.0f);
            case SOUTH -> VoxelShapes.cuboid(0.0f, 0.125f, 0.0f, 1.0f, 1.0f, 0.5f);
            case EAST -> VoxelShapes.cuboid(0.0f, 0.125f, 0.0f, 0.5f, 1.0f, 1.0f);
            case WEST -> VoxelShapes.cuboid(0.5f, 0.125f, 0.0f, 1.0f, 1.0f, 1.0f);
            default -> VoxelShapes.fullCube();
        };
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ShelfBlockEntity(pos, state);
    }

    @Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(HorizontalFacingBlock.FACING);
		SLOT_OCCUPIED_PROPERTIES.forEach(property -> builder.add(property));
	}

    @Override
	protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
		if (!state.isOf(newState.getBlock())) {
			boolean bl;
			label32: {
				if (world.getBlockEntity(pos) instanceof ShelfBlockEntity shelfBlockEntity && !shelfBlockEntity.isEmpty()) {
					for (int i = 0; i < shelfBlockEntity.size(); i++) {
						ItemStack itemStack = shelfBlockEntity.getStack(i);
						if (!itemStack.isEmpty()) {
							ItemScatterer.spawn(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemStack);
						}
					}

					shelfBlockEntity.clear();
					bl = true;
					break label32;
				}

				bl = false;
			}

			super.onStateReplaced(state, world, pos, newState, moved);
			if (bl) {
				world.updateComparators(pos, this);
			}
		}
	}

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

	@Override
	protected BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(HorizontalFacingBlock.FACING)));
	}
    
    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!(world.getBlockEntity(pos) instanceof ShelfBlockEntity shelfBlockEntity)) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
        OptionalInt optionalInt = this.getSlotForHitPos(hit, state);
        if (!stack.isIn(ItemTags.BOOKSHELF_BOOKS)) {
            if (optionalInt.isEmpty()) {
                return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            } else {
                tryRemoveBook(world, pos, player, shelfBlockEntity, optionalInt.getAsInt());
                return ItemActionResult.SUCCESS;
            }
        } else {
            if (optionalInt.isEmpty()) {
                return ItemActionResult.SKIP_DEFAULT_BLOCK_INTERACTION;
            } else if ((Boolean)state.get(SLOT_OCCUPIED_PROPERTIES.get(optionalInt.getAsInt()))) {
                tryRemoveBook(world, pos, player, shelfBlockEntity, optionalInt.getAsInt());    
                return ItemActionResult.SUCCESS;
            } else {
                tryAddBook(world, pos, player, shelfBlockEntity, stack, optionalInt.getAsInt());
                return ItemActionResult.SUCCESS;
            }
        }
    }

    private OptionalInt getSlotForHitPos(BlockHitResult hit, BlockState state) {
        Direction blockDirection = state.get(HorizontalFacingBlock.FACING);
        Direction hitDirection = hit.getSide();

        if (blockDirection != hitDirection) {
            return OptionalInt.empty();
        } else {
            // get axis perpendicular to block direction
            Direction.Axis axis = blockDirection.rotateYClockwise().getAxis();
            // get the hit position on the perpendicular axis
            double hitPos = hit.getPos().getComponentAlongAxis(axis);
            // get the block position on the perpendicular axis
            double blockPos = hit.getBlockPos().getComponentAlongAxis(axis);
            hitPos -= blockPos;
            // we need to do 1 - hitPos when the block is facing north or east
            if (blockDirection == Direction.NORTH || blockDirection == Direction.EAST) {
                hitPos = 1 - hitPos;
            }
            // get the slot index based on the hit position
            int slot = (int) Math.floor(hitPos * 4);
            return slot >= 0 && slot < 4 ? OptionalInt.of(slot) : OptionalInt.empty();
        }
	}

    private static void tryAddBook(World world, BlockPos pos, PlayerEntity player, ShelfBlockEntity blockEntity, ItemStack stack, int slot) {
        SoundEvent soundEvent = stack.isOf(Items.ENCHANTED_BOOK)
            ? SoundEvents.BLOCK_CHISELED_BOOKSHELF_INSERT_ENCHANTED
            : SoundEvents.BLOCK_CHISELED_BOOKSHELF_INSERT;
        blockEntity.setStack(slot, stack.splitUnlessCreative(1, player));
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 1.0F, 1.0F);
        blockEntity.markDirty();
    }

    private static void tryRemoveBook(World world, BlockPos pos, PlayerEntity player, ShelfBlockEntity blockEntity, int slot) {
        ItemStack itemStack = blockEntity.removeStack(slot, 1);
        SoundEvent soundEvent = itemStack.isOf(Items.ENCHANTED_BOOK)
            ? SoundEvents.BLOCK_CHISELED_BOOKSHELF_PICKUP_ENCHANTED
            : SoundEvents.BLOCK_CHISELED_BOOKSHELF_PICKUP;
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 1.0F, 1.0F);
        if (!player.getInventory().insertStack(itemStack)) {
            player.dropItem(itemStack, false);
        }

        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        blockEntity.markDirty();
	}
}
