package com.kayhennig.vanplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplus.Modblocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
  public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
      super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    addDrop(Modblocks.IRON_SLAB, slabDrops(Modblocks.IRON_SLAB));
    addDrop(Modblocks.LAPIS_SLAB, slabDrops(Modblocks.LAPIS_SLAB));
    addDrop(Modblocks.GOLD_SLAB, slabDrops(Modblocks.GOLD_SLAB));
    addDrop(Modblocks.DIAMOND_SLAB, slabDrops(Modblocks.DIAMOND_SLAB));
    addDrop(Modblocks.EMERALD_SLAB, slabDrops(Modblocks.EMERALD_SLAB));

    addDrop(Modblocks.OAK_LOG_SLAB, slabDrops(Modblocks.OAK_LOG_SLAB));
    addDrop(Modblocks.SPRUCE_LOG_SLAB, slabDrops(Modblocks.SPRUCE_LOG_SLAB));
    addDrop(Modblocks.BIRCH_LOG_SLAB, slabDrops(Modblocks.BIRCH_LOG_SLAB));
    addDrop(Modblocks.JUNGLE_LOG_SLAB, slabDrops(Modblocks.JUNGLE_LOG_SLAB));
    addDrop(Modblocks.ACACIA_LOG_SLAB, slabDrops(Modblocks.ACACIA_LOG_SLAB));
    addDrop(Modblocks.DARK_OAK_LOG_SLAB, slabDrops(Modblocks.DARK_OAK_LOG_SLAB));
    addDrop(Modblocks.MANGROVE_LOG_SLAB, slabDrops(Modblocks.MANGROVE_LOG_SLAB));
    addDrop(Modblocks.CHERRY_LOG_SLAB, slabDrops(Modblocks.CHERRY_LOG_SLAB));
  }
}