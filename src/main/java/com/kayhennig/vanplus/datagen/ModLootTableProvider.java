package com.kayhennig.vanplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplus.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
  public ModLootTableProvider(FabricDataOutput dataOutput,
      CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    // Slabs
    addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));
    addDrop(ModBlocks.LAPIS_SLAB, slabDrops(ModBlocks.LAPIS_SLAB));
    addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
    addDrop(ModBlocks.DIAMOND_SLAB, slabDrops(ModBlocks.DIAMOND_SLAB));
    addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));

    addDrop(ModBlocks.OAK_LOG_SLAB, slabDrops(ModBlocks.OAK_LOG_SLAB));
    addDrop(ModBlocks.SPRUCE_LOG_SLAB, slabDrops(ModBlocks.SPRUCE_LOG_SLAB));
    addDrop(ModBlocks.BIRCH_LOG_SLAB, slabDrops(ModBlocks.BIRCH_LOG_SLAB));
    addDrop(ModBlocks.JUNGLE_LOG_SLAB, slabDrops(ModBlocks.JUNGLE_LOG_SLAB));
    addDrop(ModBlocks.ACACIA_LOG_SLAB, slabDrops(ModBlocks.ACACIA_LOG_SLAB));
    addDrop(ModBlocks.DARK_OAK_LOG_SLAB, slabDrops(ModBlocks.DARK_OAK_LOG_SLAB));
    addDrop(ModBlocks.MANGROVE_LOG_SLAB, slabDrops(ModBlocks.MANGROVE_LOG_SLAB));
    addDrop(ModBlocks.CHERRY_LOG_SLAB, slabDrops(ModBlocks.CHERRY_LOG_SLAB));
    addDrop(ModBlocks.CRIMSON_STEM_SLAB, slabDrops(ModBlocks.CRIMSON_STEM_SLAB));
    addDrop(ModBlocks.WARPED_STEM_SLAB, slabDrops(ModBlocks.WARPED_STEM_SLAB));

    addDrop(ModBlocks.STRIPPED_OAK_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_OAK_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_BIRCH_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_BIRCH_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_ACACIA_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_ACACIA_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_CHERRY_LOG_SLAB, slabDrops(ModBlocks.STRIPPED_CHERRY_LOG_SLAB));
    addDrop(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB, slabDrops(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB));
    addDrop(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB, slabDrops(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB));

  }
}