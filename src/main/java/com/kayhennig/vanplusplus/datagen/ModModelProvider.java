package com.kayhennig.vanplusplus.datagen;

import com.kayhennig.vanplusplus.ModBlocks;
import com.kayhennig.vanplusplus.ModItems;
import com.kayhennig.vanplusplus.block.enums.VerticalSlabType;
import com.kayhennig.vanplusplus.data.ModModels;
import com.kayhennig.vanplusplus.state.property.ModProperties;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateSupplier;
import net.minecraft.data.client.BlockStateVariant;
import net.minecraft.data.client.BlockStateVariantMap;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.VariantSettings;
import net.minecraft.data.client.VariantsBlockStateSupplier;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateBlockStateSlabModels(blockStateModelGenerator);
        generateBlockStateVerticalSlabModels(blockStateModelGenerator);
        generateHorizontalGlassPanes(blockStateModelGenerator);
        generateBlockStateShelfModels(blockStateModelGenerator);
    }

    private void generateBlockStateSlabModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB);
        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB);
        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB);
        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB);
        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB);

        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.OAK_LOG, ModBlocks.OAK_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.BIRCH_LOG, ModBlocks.BIRCH_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.ACACIA_LOG, ModBlocks.ACACIA_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.CHERRY_LOG, ModBlocks.CHERRY_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_STEM_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.WARPED_STEM, ModBlocks.WARPED_STEM_SLAB);

        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_OAK_LOG, ModBlocks.STRIPPED_OAK_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_SPRUCE_LOG, ModBlocks.STRIPPED_SPRUCE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_BIRCH_LOG, ModBlocks.STRIPPED_BIRCH_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_JUNGLE_LOG, ModBlocks.STRIPPED_JUNGLE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_ACACIA_LOG, ModBlocks.STRIPPED_ACACIA_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_MANGROVE_LOG, ModBlocks.STRIPPED_MANGROVE_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CRIMSON_STEM, ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);
        generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_WARPED_STEM, ModBlocks.STRIPPED_WARPED_STEM_SLAB);

        generateBlockStateSlabModel(blockStateModelGenerator, Blocks.GLASS, ModBlocks.GLASS_SLAB);
    }

    private void generateBlockStateVerticalSlabModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, ModBlocks.IRON_VERTICAL_SLAB);
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, ModBlocks.GOLD_VERTICAL_SLAB);
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_VERTICAL_SLAB);
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.OAK_LOG, ModBlocks.OAK_LOG_SLAB, ModBlocks.OAK_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_LOG_SLAB, ModBlocks.SPRUCE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.BIRCH_LOG, ModBlocks.BIRCH_LOG_SLAB, ModBlocks.BIRCH_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_LOG_SLAB, ModBlocks.JUNGLE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.ACACIA_LOG, ModBlocks.ACACIA_LOG_SLAB, ModBlocks.ACACIA_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_LOG_SLAB, ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_LOG_SLAB, ModBlocks.MANGROVE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.CHERRY_LOG, ModBlocks.CHERRY_LOG_SLAB, ModBlocks.CHERRY_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_STEM_SLAB, ModBlocks.CRIMSON_STEM_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.WARPED_STEM, ModBlocks.WARPED_STEM_SLAB, ModBlocks.WARPED_STEM_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_OAK_LOG, ModBlocks.STRIPPED_OAK_LOG_SLAB, ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_SPRUCE_LOG, ModBlocks.STRIPPED_SPRUCE_LOG_SLAB, ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_BIRCH_LOG, ModBlocks.STRIPPED_BIRCH_LOG_SLAB, ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_JUNGLE_LOG, ModBlocks.STRIPPED_JUNGLE_LOG_SLAB, ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_ACACIA_LOG, ModBlocks.STRIPPED_ACACIA_LOG_SLAB, ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB, ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_MANGROVE_LOG, ModBlocks.STRIPPED_MANGROVE_LOG_SLAB, ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG_SLAB, ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CRIMSON_STEM, ModBlocks.STRIPPED_CRIMSON_STEM_SLAB, ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_WARPED_STEM, ModBlocks.STRIPPED_WARPED_STEM_SLAB, ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.OAK_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_SLAB, ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS,Blocks.MANGROVE_SLAB, ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_SLAB, ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.WARPED_PLANKS_VERTICAL_SLAB);

        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.GLASS, ModBlocks.GLASS_SLAB, ModBlocks.GLASS_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB, ModBlocks.BAMBOO_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC_SLAB, ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.CUT_COPPER, Blocks.CUT_COPPER_SLAB, ModBlocks.CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.CUT_COPPER, Blocks.CUT_COPPER_SLAB, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        generateBlockStateVerticalSlabFromQuartzModel(blockStateModelGenerator);
        generateBlockStateVerticalSlabFromSmoothQuartzModel(blockStateModelGenerator);

        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.STONE, Blocks.STONE_SLAB, ModBlocks.STONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB, ModBlocks.COBBLESTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_SLAB, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabModel(blockStateModelGenerator, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB, ModBlocks.STONE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_SLAB, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.GRANITE, Blocks.GRANITE_SLAB, ModBlocks.GRANITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.DIORITE, Blocks.DIORITE_SLAB, ModBlocks.DIORITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.ANDESITE, Blocks.ANDESITE_SLAB, ModBlocks.ANDESITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE_SLAB, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE_SLAB, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.DEEPSLATE_TILES, Blocks.DEEPSLATE_TILE_SLAB, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.TUFF, Blocks.TUFF_SLAB, ModBlocks.TUFF_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_TUFF, Blocks.POLISHED_TUFF_SLAB, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.TUFF_BRICKS, Blocks.TUFF_BRICK_SLAB, ModBlocks.TUFF_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.BRICKS, Blocks.BRICK_SLAB, ModBlocks.BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.MUD_BRICKS, Blocks.MUD_BRICK_SLAB, ModBlocks.MUD_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromSandstoneModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB, ModBlocks.SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromSmoothSandstoneModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromCutSandstoneModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromSandstoneModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromSmoothSandstoneModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromCutSandstoneModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.PRISMARINE, Blocks.PRISMARINE_SLAB, ModBlocks.PRISMARINE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_SLAB, ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromLogModel(blockStateModelGenerator, Blocks.BLACKSTONE, Blocks.BLACKSTONE_SLAB, ModBlocks.BLACKSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
        generateBlockStateVerticalSlabFromPlankModel(blockStateModelGenerator, Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, ModBlocks.PURPUR_VERTICAL_SLAB);
    }

    private void generateHorizontalGlassPanes(BlockStateModelGenerator blockStateModelGenerator) {
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.GLASS, Blocks.GLASS_PANE, ModBlocks.GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.WHITE_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS_PANE, ModBlocks.WHITE_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.ORANGE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS_PANE, ModBlocks.ORANGE_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.MAGENTA_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS_PANE, ModBlocks.MAGENTA_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, ModBlocks.LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.YELLOW_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS_PANE, ModBlocks.YELLOW_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.LIME_STAINED_GLASS, Blocks.LIME_STAINED_GLASS_PANE, ModBlocks.LIME_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.PINK_STAINED_GLASS, Blocks.PINK_STAINED_GLASS_PANE, ModBlocks.PINK_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.GRAY_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS_PANE, ModBlocks.GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, ModBlocks.LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.CYAN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS_PANE, ModBlocks.CYAN_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.PURPLE_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS_PANE, ModBlocks.PURPLE_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.BLUE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS_PANE, ModBlocks.BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.BROWN_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS_PANE, ModBlocks.BROWN_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.GREEN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS_PANE, ModBlocks.GREEN_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.RED_STAINED_GLASS, Blocks.RED_STAINED_GLASS_PANE, ModBlocks.RED_STAINED_GLASS_HORIZONTAL_PANE);
        generateBlockStateHorizontalGlassPaneModel(blockStateModelGenerator, Blocks.BLACK_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS_PANE, ModBlocks.BLACK_STAINED_GLASS_HORIZONTAL_PANE);
    }

    private void generateBlockStateShelfModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateShelfModel(blockStateModelGenerator, ModBlocks.OAK_SHELF, Blocks.OAK_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.SPRUCE_SHELF, Blocks.SPRUCE_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.BIRCH_SHELF, Blocks.BIRCH_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.JUNGLE_SHELF, Blocks.JUNGLE_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.ACACIA_SHELF, Blocks.ACACIA_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.DARK_OAK_SHELF, Blocks.DARK_OAK_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.MANGROVE_SHELF, Blocks.MANGROVE_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.CHERRY_SHELF, Blocks.CHERRY_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.CRIMSON_SHELF, Blocks.CRIMSON_PLANKS);
        generateShelfModel(blockStateModelGenerator, ModBlocks.WARPED_SHELF, Blocks.WARPED_PLANKS);
    }

    private void generateShelfModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Block plank) {
        TextureMap textureMap = TextureMap.all(plank);

        Identifier identifier = ModModels.SHELF_NORTH.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.SHELF_EAST.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SHELF_SOUTH.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.SHELF_WEST.upload(block, textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(block)
                .coordinate(
                    BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                        .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier4))
                        .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier2))
                        .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier3))
                        .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
                )
        );
    }

    private void generateBlockStateHorizontalGlassPaneModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Block paneBlock, Block horizontalPaneBlock) {
        TextureMap textureMap = TextureMap.paneAndTopForEdge(block, paneBlock);

        Identifier identifier = ModModels.HORIZONTAL_PANE.upload(horizontalPaneBlock, textureMap,
                blockStateModelGenerator.modelCollector);

        // no states needed, only one model
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(horizontalPaneBlock, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)));
    }

    private void generateBlockStateSlabModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock,
            Block slabBlock) {
        TextureMap textureMap = TextureMap.all(mainBlock);
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(slabBlock, "_side"),
                textureMap.getTexture(TextureKey.TOP));

        Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2,
                blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }

    private void generateBlockStateSlabFromLogModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock,
            Block slabBlock) {
        TextureMap textureMap = new TextureMap().put(TextureKey.SIDE, TextureMap.getId(mainBlock)).put(TextureKey.END,
                TextureMap.getSubId(mainBlock, "_top"));
        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.SIDE),
                textureMap.getTexture(TextureKey.END));

        Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2,
                blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }

    private void generateBlockStateVerticalSlabModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock,
            Block slabBlock,
            Block verticalSlabBlock) {
        TextureMap textureMap = TextureMap.all(mainBlock);
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(slabBlock, "_side"),
                textureMap.getTexture(TextureKey.TOP));

        Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromPlankModel(BlockStateModelGenerator blockStateModelGenerator,
            Block mainBlock,
            Block slabBlock, Block verticalSlabBlock) {

        TextureMap textureMap = TextureMap.all(mainBlock);
        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.TOP),
                textureMap.getTexture(TextureKey.TOP));

        Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromLogModel(BlockStateModelGenerator blockStateModelGenerator,
            Block mainBlock,
            Block slabBlock, Block verticalSlabBlock) {
        TextureMap textureMap = new TextureMap().put(TextureKey.SIDE, TextureMap.getId(mainBlock)).put(TextureKey.END,
                TextureMap.getSubId(mainBlock, "_top"));
        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.SIDE),
                textureMap.getTexture(TextureKey.END));

        Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromQuartzModel(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.SIDE, TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_side")).put(TextureKey.END,
                TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_top"));
            
        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.SIDE),
                textureMap.getTexture(TextureKey.TOP));

        Identifier identifier = ModModels.NORTH_SLAB.upload(ModBlocks.QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(ModBlocks.QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(ModBlocks.QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(ModBlocks.QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(ModBlocks.QUARTZ_VERTICAL_SLAB,
                "_double_east", textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(ModBlocks.QUARTZ_VERTICAL_SLAB,
                "_double_north", textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.QUARTZ_VERTICAL_SLAB,
                identifier, identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromSmoothQuartzModel(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.SIDE, TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_bottom")).put(TextureKey.END,
        TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_bottom"));

        TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.TOP),
                textureMap.getTexture(TextureKey.TOP));

        Identifier identifier = ModModels.NORTH_SLAB.upload(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
                "_double_east", textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
                "_double_north", textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
                identifier, identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private BlockStateSupplier createVerticalSlabBlockState(Block slabBlock, Identifier north, Identifier east,
            Identifier south, Identifier west, Identifier fullEast, Identifier fullNorth) {
        return VariantsBlockStateSupplier.create(slabBlock)
                .coordinate(
                        BlockStateVariantMap.create(ModProperties.VERTICAL_SLAB_TYPE)
                                .register(VerticalSlabType.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, north))
                                .register(VerticalSlabType.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, east))
                                .register(VerticalSlabType.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, south))
                                .register(VerticalSlabType.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, west))
                                .register(VerticalSlabType.DOUBLE_EAST, BlockStateVariant.create().put(VariantSettings.MODEL, fullEast))
                                .register(VerticalSlabType.DOUBLE_NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, fullNorth)));
    }

    private void generateBlockStateVerticalSlabFromSandstoneModel(BlockStateModelGenerator blockStateModelGenerator,
            Block mainBlock, Block slabBlock, Block verticalSlabBlock) {
        TextureMap textureMap2 = new TextureMap().put(TextureKey.SIDE, TextureMap.getId(mainBlock)).put(TextureKey.TOP,
                TextureMap.getSubId(mainBlock, "_top")).put(TextureKey.BOTTOM, TextureMap.getSubId(mainBlock, "_bottom"));

        Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2, 
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromSmoothSandstoneModel(BlockStateModelGenerator blockStateModelGenerator,
            Block mainBlock, Block slabBlock, Block verticalSlabBlock) {
        TextureMap textureMap2 = new TextureMap().put(TextureKey.SIDE, TextureMap.getSubId(mainBlock, "_top"))
                .put(TextureKey.TOP, TextureMap.getSubId(mainBlock, "_top")).put(TextureKey.BOTTOM, TextureMap.getSubId(mainBlock, "_top"));
        
        Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2, 
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }

    private void generateBlockStateVerticalSlabFromCutSandstoneModel(BlockStateModelGenerator blockStateModelGenerator,
            Block mainBlock, Block cutBlock, Block verticalSlabBlock) {
        TextureMap textureMap2 = new TextureMap().put(TextureKey.SIDE, TextureMap.getId(cutBlock))
                .put(TextureKey.TOP, TextureMap.getSubId(mainBlock, "_top")).put(TextureKey.BOTTOM, TextureMap.getSubId(mainBlock, "_top"));

                Identifier identifier = ModModels.NORTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.EAST_SLAB.upload(verticalSlabBlock, textureMap2, 
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.SOUTH_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WEST_SLAB.upload(verticalSlabBlock, textureMap2,
                blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOUBLE_EAST_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_east",
                textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOUBLE_NORTH_SLAB.uploadWithoutVariant(verticalSlabBlock, "_double_north",
                textureMap2, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(verticalSlabBlock, identifier,
                identifier2, identifier3, identifier4, identifier5, identifier6));
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.CHERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPES, Models.GENERATED);

        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.WHITE_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.WHITE_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.ORANGE_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.ORANGE_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.MAGENTA_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.MAGENTA_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.LIGHT_BLUE_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.YELLOW_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.YELLOW_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.LIME_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.LIME_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.PINK_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.PINK_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.GRAY_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.GRAY_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.LIGHT_GRAY_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.CYAN_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.CYAN_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.PURPLE_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.PURPLE_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.BLUE_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.BLUE_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.BROWN_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.BROWN_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.GREEN_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.GREEN_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.RED_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.RED_STAINED_GLASS), itemModelGenerator.writer);
        Models.GENERATED.upload(ModelIds.getItemModelId(ModBlocks.BLACK_STAINED_GLASS_HORIZONTAL_PANE.asItem()), TextureMap.layer0(Blocks.BLACK_STAINED_GLASS), itemModelGenerator.writer);
    }

}
