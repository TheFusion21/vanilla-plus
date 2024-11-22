package com.kayhennig.vanplusplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplusplus.ModBlockTags;
import com.kayhennig.vanplusplus.ModBlocks;

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
            .add(ModBlocks.EMERALD_SLAB)

            .add(ModBlocks.IRON_VERTICAL_SLAB)
            .add(ModBlocks.LAPIS_VERTICAL_SLAB)
            .add(ModBlocks.GOLD_VERTICAL_SLAB)
            .add(ModBlocks.DIAMOND_VERTICAL_SLAB)
            .add(ModBlocks.EMERALD_VERTICAL_SLAB)

            .add(ModBlocks.CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB)

            .add(ModBlocks.QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);

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
            .add(ModBlocks.STRIPPED_CRIMSON_STEM_SLAB)

            .add(ModBlocks.OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_PLANKS_VERTICAL_SLAB)

            .add(ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB)

            .add(ModBlocks.OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_STEM_VERTICAL_SLAB)

            .add(ModBlocks.OAK_SHELF)
            .add(ModBlocks.SPRUCE_SHELF)
            .add(ModBlocks.BIRCH_SHELF)
            .add(ModBlocks.JUNGLE_SHELF)
            .add(ModBlocks.ACACIA_SHELF)
            .add(ModBlocks.DARK_OAK_SHELF)
            .add(ModBlocks.MANGROVE_SHELF)
            .add(ModBlocks.CHERRY_SHELF)
            .add(ModBlocks.CRIMSON_SHELF)
            .add(ModBlocks.WARPED_SHELF)

            .add(ModBlocks.BAMBOO_VERTICAL_SLAB)
            .add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.IRON_SLAB)
            .add(ModBlocks.LAPIS_SLAB)
            .add(ModBlocks.GOLD_SLAB)

            .add(ModBlocks.IRON_VERTICAL_SLAB)
            .add(ModBlocks.LAPIS_VERTICAL_SLAB)
            .add(ModBlocks.GOLD_VERTICAL_SLAB)

            .add(ModBlocks.CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.DIAMOND_SLAB)
            .add(ModBlocks.EMERALD_SLAB)

            .add(ModBlocks.DIAMOND_VERTICAL_SLAB)
            .add(ModBlocks.EMERALD_VERTICAL_SLAB);

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

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(ModBlocks.IRON_SLAB)
            .add(ModBlocks.LAPIS_SLAB)
            .add(ModBlocks.GOLD_SLAB)
            .add(ModBlocks.DIAMOND_SLAB)
            .add(ModBlocks.EMERALD_SLAB);

        getOrCreateTagBuilder(ModBlockTags.VERTICAL_WOODEN_SLABS)
            .add(ModBlocks.OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_PLANKS_VERTICAL_SLAB)

            .add(ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB)

            .add(ModBlocks.OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_STEM_VERTICAL_SLAB);

        getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
            .add(ModBlocks.GLASS_SLAB)
            .add(ModBlocks.GLASS_VERTICAL_SLAB);

        getOrCreateTagBuilder(ModBlockTags.GLASS_SLABS)
            .add(ModBlocks.GLASS_SLAB)
            .add(ModBlocks.GLASS_VERTICAL_SLAB);

        getOrCreateTagBuilder(ModBlockTags.VERTICAL_SLABS)
            .add(ModBlocks.OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_STEM_VERTICAL_SLAB)

            .add(ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB)
            .add(ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB)

            .add(ModBlocks.OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_PLANKS_VERTICAL_SLAB)

            .add(ModBlocks.BAMBOO_VERTICAL_SLAB)
            .add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB)

            .add(ModBlocks.CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB)

            .add(ModBlocks.QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
    }

}
