package com.kayhennig.vanplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplus.Modblocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
  public ModBlockTagProvider(FabricDataOutput output,
      CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void configure(WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
      .add(Modblocks.IRON_SLAB)
      .add(Modblocks.LAPIS_SLAB)
      .add(Modblocks.GOLD_SLAB)
      .add(Modblocks.DIAMOND_SLAB)
      .add(Modblocks.EMERALD_SLAB);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
      .add(Modblocks.OAK_LOG_SLAB)
      .add(Modblocks.SPRUCE_LOG_SLAB)
      .add(Modblocks.BIRCH_LOG_SLAB)
      .add(Modblocks.JUNGLE_LOG_SLAB)
      .add(Modblocks.ACACIA_LOG_SLAB)
      .add(Modblocks.DARK_OAK_LOG_SLAB)
      .add(Modblocks.MANGROVE_LOG_SLAB)
      .add(Modblocks.CHERRY_LOG_SLAB);

    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
      .add(Modblocks.IRON_SLAB)
      .add(Modblocks.LAPIS_SLAB)
      .add(Modblocks.GOLD_SLAB);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
      .add(Modblocks.DIAMOND_SLAB)
      .add(Modblocks.EMERALD_SLAB);

    getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
      .add(Modblocks.OAK_LOG_SLAB)
      .add(Modblocks.SPRUCE_LOG_SLAB)
      .add(Modblocks.BIRCH_LOG_SLAB)
      .add(Modblocks.JUNGLE_LOG_SLAB)
      .add(Modblocks.ACACIA_LOG_SLAB)
      .add(Modblocks.DARK_OAK_LOG_SLAB)
      .add(Modblocks.MANGROVE_LOG_SLAB)
      .add(Modblocks.CHERRY_LOG_SLAB);

    getOrCreateTagBuilder(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
    .add(Modblocks.OAK_LOG_SLAB)
    .add(Modblocks.SPRUCE_LOG_SLAB)
    .add(Modblocks.BIRCH_LOG_SLAB)
    .add(Modblocks.JUNGLE_LOG_SLAB)
    .add(Modblocks.ACACIA_LOG_SLAB)
    .add(Modblocks.DARK_OAK_LOG_SLAB)
    .add(Modblocks.MANGROVE_LOG_SLAB)
    .add(Modblocks.CHERRY_LOG_SLAB);

  }

}
