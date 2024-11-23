package com.kayhennig.vanplusplus.block;

import org.jetbrains.annotations.Nullable;

import com.kayhennig.vanplusplus.block.enums.VerticalSlabType;
import com.kayhennig.vanplusplus.state.property.ModProperties;
import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class VerticalSlabBlock extends HorizontalFacingBlock implements Waterloggable {
	public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
	public static final EnumProperty<VerticalSlabType> TYPE = ModProperties.VERTICAL_SLAB_TYPE;
	public static final MapCodec<VerticalSlabBlock> CODEC = Block.createCodec(VerticalSlabBlock::new);

	public VerticalSlabBlock(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState()
				.with(TYPE, VerticalSlabType.SOUTH)
				.with(WATERLOGGED, false));
	}

	@Override
	protected MapCodec<? extends VerticalSlabBlock> getCodec() {
		return CODEC;
	}

	@Override
	protected boolean hasSidedTransparency(BlockState state) {
		return state.get(TYPE) != VerticalSlabType.DOUBLE_EAST && state.get(TYPE) != VerticalSlabType.DOUBLE_NORTH;
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(TYPE, WATERLOGGED);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		VerticalSlabType dir = state.get(TYPE);
		return switch (dir) {
			case NORTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
			case SOUTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
			case EAST -> VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
			case WEST -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
			default -> VoxelShapes.fullCube();
		};
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockPos blockPos = ctx.getBlockPos();
		BlockState blockState = ctx.getWorld().getBlockState(blockPos);
		Direction direction = ctx.getSide();
		if (blockState.isOf(this)) {
			if (direction == Direction.NORTH || direction == Direction.SOUTH) {
				return blockState.with(TYPE, VerticalSlabType.DOUBLE_NORTH).with(WATERLOGGED, Boolean.valueOf(false));
			} else {
				return blockState.with(TYPE, VerticalSlabType.DOUBLE_EAST).with(WATERLOGGED, Boolean.valueOf(false));
			}
		}
		else {
			FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
			Vec3d hitPos = ctx.getHitPos();
			Direction lookingDirection = ctx.getHorizontalPlayerFacing();
			double xDiff = hitPos.x - blockPos.getX();
			double zDiff = hitPos.z - blockPos.getZ();

			if (lookingDirection == Direction.NORTH || lookingDirection == Direction.SOUTH) {
				if (zDiff < 0.5) {
					return this.getDefaultState().with(TYPE, VerticalSlabType.NORTH).with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
				} else {
					return this.getDefaultState().with(TYPE, VerticalSlabType.SOUTH).with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
				}
			} else {
				if (xDiff < 0.5) {
					return this.getDefaultState().with(TYPE, VerticalSlabType.WEST).with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
				} else {
					return this.getDefaultState().with(TYPE, VerticalSlabType.EAST).with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
				}
			}
		}
    }

	@Override
	protected boolean canReplace(BlockState state, ItemPlacementContext context) {
		ItemStack itemStack = context.getStack();
		VerticalSlabType slabType = state.get(TYPE);
		if (slabType == VerticalSlabType.DOUBLE_EAST || slabType == VerticalSlabType.DOUBLE_NORTH || !itemStack.isOf(this.asItem())) {
			return false;
		} else if (context.canReplaceExisting()) {
			BlockPos blockPos = context.getBlockPos();
			Vec3d hitPos = context.getHitPos();
			Direction lookingDirection = context.getHorizontalPlayerFacing();
			double xDiff = hitPos.x - blockPos.getX();
			double zDiff = hitPos.z - blockPos.getZ();
			
			if (lookingDirection == Direction.NORTH || lookingDirection == Direction.SOUTH) {
				if (slabType == VerticalSlabType.NORTH) {
					return zDiff >= 0.5;
				} else {
					return zDiff <= 0.5;
				}
			} else {
				if (slabType == VerticalSlabType.WEST) {
					return xDiff >= 0.5;
				} else {
					return xDiff <= 0.5;
				}
			}
		} else {
			return true;
		}
	}

	@Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
 
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

}