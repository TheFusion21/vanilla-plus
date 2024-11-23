package com.kayhennig.vanplusplus.block;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import com.kayhennig.vanplusplus.entity.ModBlockEntityType;
import com.mojang.logging.LogUtils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ShelfBlockEntity extends BlockEntity implements Inventory {
    public static final int MAX_BOOKS = 4;
	private static final Logger LOGGER = LogUtils.getLogger();
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(MAX_BOOKS, ItemStack.EMPTY);
    

    public ShelfBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityType.SHELF, pos, state);
    }

    // Inventory methods
    private void updateState(int interactedSlot) {
		if (interactedSlot >= 0 && interactedSlot < MAX_BOOKS) {
			BlockState blockState = this.getCachedState();

			for (int i = 0; i < ShelfBlock.SLOT_OCCUPIED_PROPERTIES.size(); i++) {
				boolean bl = !this.getStack(i).isEmpty();
				BooleanProperty booleanProperty = (BooleanProperty)ShelfBlock.SLOT_OCCUPIED_PROPERTIES.get(i);
				blockState = blockState.with(booleanProperty, Boolean.valueOf(bl));
			}

			((World)Objects.requireNonNull(this.world)).setBlockState(this.pos, blockState, Block.NOTIFY_ALL);
			this.world.emitGameEvent(GameEvent.BLOCK_CHANGE, this.pos, GameEvent.Emitter.of(blockState));
		} else {
			LOGGER.error("Expected slot 0-3, got {}", interactedSlot);
		}
	}

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
    
    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    @Override
    public void clear() {
        inventory.clear();
    }

    @Override
    public int size() {
        return inventory.size();
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            ItemStack stack = getStack(i);
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getStack(int slot) {
        return inventory.get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack itemStack = (ItemStack)Objects.requireNonNullElse(this.inventory.get(slot), ItemStack.EMPTY);
		this.inventory.set(slot, ItemStack.EMPTY);
		if (!itemStack.isEmpty()) {
			this.updateState(slot);
            markDirty();
		}

		return itemStack;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return removeStack(slot, 1);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        if (stack.isIn(ItemTags.BOOKSHELF_BOOKS)) {
			this.inventory.set(slot, stack);
			this.updateState(slot);
		} else if (stack.isEmpty()) {
			this.removeStack(slot, 1);
		}
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    // NBT methods
    @Override
    public void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        Inventories.readNbt(nbt, this.inventory, registryLookup);
    }

    @Override
    public void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        Inventories.writeNbt(nbt, this.inventory, true, registryLookup);
        super.writeNbt(nbt, registryLookup);
    }

    @Override
	public int getMaxCountPerStack() {
		return 1;
	}

    @Override
	public boolean isValid(int slot, ItemStack stack) {
		return stack.isIn(ItemTags.BOOKSHELF_BOOKS) && this.getStack(slot).isEmpty() && stack.getCount() == this.getMaxCountPerStack();
	}

    @Override
	protected void readComponents(BlockEntity.ComponentsAccess components) {
		super.readComponents(components);
		components.getOrDefault(DataComponentTypes.CONTAINER, ContainerComponent.DEFAULT).copyTo(this.inventory);
	}

	@Override
	protected void addComponents(ComponentMap.Builder componentMapBuilder) {
		super.addComponents(componentMapBuilder);
		componentMapBuilder.add(DataComponentTypes.CONTAINER, ContainerComponent.fromStacks(this.inventory));
	}

    @Override
	public void removeFromCopiedStackNbt(NbtCompound nbt) {
		nbt.remove("Items");
	}
}
