package com.kayhennig.vanplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplus.ModBlocks;

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
      .add(ModBlocks.IRON_SLAB)
      .add(ModBlocks.LAPIS_SLAB)
      .add(ModBlocks.GOLD_SLAB)
      .add(ModBlocks.DIAMOND_SLAB)
      .add(ModBlocks.EMERALD_SLAB);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
      .add(ModBlocks.OAK_LOG_SLAB)
      .add(ModBlocks.SPRUCE_LOG_SLAB)
      .add(ModBlocks.BIRCH_LOG_SLAB)
      .add(ModBlocks.JUNGLE_LOG_SLAB)
      .add(ModBlocks.ACACIA_LOG_SLAB)
      .add(ModBlocks.DARK_OAK_LOG_SLAB)
      .add(ModBlocks.MANGROVE_LOG_SLAB)
      .add(ModBlocks.CHERRY_LOG_SLAB)
      .add(ModBlocks.CRIMSON_STEM_SLAB)
      .add(ModBlocks.WARPED_STEM_SLAB)

      .add(ModBlocks.STRIPPED_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB)
      .add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB)
      .add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);

    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
      .add(ModBlocks.IRON_SLAB)
      .add(ModBlocks.LAPIS_SLAB)
      .add(ModBlocks.GOLD_SLAB);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
      .add(ModBlocks.DIAMOND_SLAB)
      .add(ModBlocks.EMERALD_SLAB);

    getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
      .add(ModBlocks.OAK_LOG_SLAB)
      .add(ModBlocks.SPRUCE_LOG_SLAB)
      .add(ModBlocks.BIRCH_LOG_SLAB)
      .add(ModBlocks.JUNGLE_LOG_SLAB)
      .add(ModBlocks.ACACIA_LOG_SLAB)
      .add(ModBlocks.DARK_OAK_LOG_SLAB)
      .add(ModBlocks.MANGROVE_LOG_SLAB)
      .add(ModBlocks.CHERRY_LOG_SLAB)
      .add(ModBlocks.CRIMSON_STEM_SLAB)
      .add(ModBlocks.WARPED_STEM_SLAB)

      .add(ModBlocks.STRIPPED_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB)
      .add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB)
      .add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);

    getOrCreateTagBuilder(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
      .add(ModBlocks.OAK_LOG_SLAB)
      .add(ModBlocks.SPRUCE_LOG_SLAB)
      .add(ModBlocks.BIRCH_LOG_SLAB)
      .add(ModBlocks.JUNGLE_LOG_SLAB)
      .add(ModBlocks.ACACIA_LOG_SLAB)
      .add(ModBlocks.DARK_OAK_LOG_SLAB)
      .add(ModBlocks.MANGROVE_LOG_SLAB)
      .add(ModBlocks.CHERRY_LOG_SLAB)
      .add(ModBlocks.CRIMSON_STEM_SLAB)
      .add(ModBlocks.WARPED_STEM_SLAB)

      .add(ModBlocks.STRIPPED_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB)
      .add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB)
      .add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);

    getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
      .add(ModBlocks.OAK_LOG_SLAB)
      .add(ModBlocks.SPRUCE_LOG_SLAB)
      .add(ModBlocks.BIRCH_LOG_SLAB)
      .add(ModBlocks.JUNGLE_LOG_SLAB)
      .add(ModBlocks.ACACIA_LOG_SLAB)
      .add(ModBlocks.DARK_OAK_LOG_SLAB)
      .add(ModBlocks.MANGROVE_LOG_SLAB)
      .add(ModBlocks.CHERRY_LOG_SLAB)
      .add(ModBlocks.CRIMSON_STEM_SLAB)
      .add(ModBlocks.WARPED_STEM_SLAB)

      .add(ModBlocks.STRIPPED_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB)
      .add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB)
      .add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB)
      .add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB)
      .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);

    getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
      .add(ModBlocks.GLASS_SLAB);

  }

}
