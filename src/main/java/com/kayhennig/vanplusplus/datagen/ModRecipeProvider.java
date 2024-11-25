package com.kayhennig.vanplusplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplusplus.ModBlocks;
import com.kayhennig.vanplusplus.ModItems;
import com.kayhennig.vanplusplus.Vanillaplusplus;
import com.kayhennig.vanplusplus.recipe.DynamiteRecipe;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateSlab(exporter);
        generateVerticalSlab(exporter);
        generateItems(exporter);
        generateStoneCutterSlabRecipes(exporter);
    }

    private void generateSlab(RecipeExporter exporter) {
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Blocks.IRON_BLOCK, null);
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, null);
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK, null);
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, null);
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK, null);

        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_SLAB, Blocks.OAK_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, "log_slab");

        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG, "log_slab");
        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_STEM_SLAB, Blocks.STRIPPED_CRIMSON_STEM, "log_slab");

        offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_SLAB, Blocks.GLASS, null);
    }

    private void generateVerticalSlab(RecipeExporter exporter) {
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_VERTICAL_SLAB, Blocks.IRON_BLOCK, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_VERTICAL_SLAB, Blocks.LAPIS_BLOCK, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_VERTICAL_SLAB, Blocks.GOLD_BLOCK, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_VERTICAL_SLAB, Blocks.DIAMOND_BLOCK, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_VERTICAL_SLAB, Blocks.EMERALD_BLOCK, null);

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_VERTICAL_SLAB, Blocks.OAK_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_VERTICAL_SLAB, Blocks.SPRUCE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_VERTICAL_SLAB, Blocks.BIRCH_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_VERTICAL_SLAB, Blocks.JUNGLE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_VERTICAL_SLAB, Blocks.ACACIA_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB, Blocks.DARK_OAK_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_VERTICAL_SLAB, Blocks.MANGROVE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_VERTICAL_SLAB, Blocks.CHERRY_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_VERTICAL_SLAB, Blocks.CRIMSON_STEM, "log_slab");

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB, Blocks.STRIPPED_OAK_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB, Blocks.STRIPPED_SPRUCE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB, Blocks.STRIPPED_BIRCH_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB, Blocks.STRIPPED_JUNGLE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB, Blocks.STRIPPED_ACACIA_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB, Blocks.STRIPPED_MANGROVE_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB, Blocks.STRIPPED_CHERRY_LOG, "log_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB, Blocks.STRIPPED_CRIMSON_STEM, "log_slab");

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANKS_VERTICAL_SLAB, Blocks.OAK_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB, Blocks.SPRUCE_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB, Blocks.BIRCH_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB, Blocks.JUNGLE_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB, Blocks.ACACIA_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB, Blocks.DARK_OAK_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB, Blocks.MANGROVE_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB, Blocks.CHERRY_PLANKS, "planks_slab");
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB, Blocks.CRIMSON_PLANKS, "planks_slab");

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_VERTICAL_SLAB, Blocks.GLASS, null);

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_VERTICAL_SLAB, Blocks.BAMBOO, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, Blocks.BAMBOO_MOSAIC, null);

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, Blocks.SMOOTH_STONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB, Blocks.STONE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_VERTICAL_SLAB, Blocks.GRANITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, Blocks.POLISHED_GRANITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_VERTICAL_SLAB, Blocks.DIORITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, Blocks.POLISHED_DIORITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, Blocks.POLISHED_ANDESITE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_VERTICAL_SLAB, Blocks.TUFF, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, Blocks.POLISHED_TUFF, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.TUFF_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_VERTICAL_SLAB, Blocks.BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_VERTICAL_SLAB, Blocks.MUD_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_VERTICAL_SLAB, Blocks.SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, Blocks.RED_SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_RED_SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_RED_SANDSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, Blocks.PRISMARINE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, Blocks.RED_NETHER_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, Blocks.END_STONE_BRICKS, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_VERTICAL_SLAB, Blocks.PURPUR_BLOCK, null);

        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COPPER_VERTICAL_SLAB, Blocks.CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.EXPOSED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER, null);
        offerShapedVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER, null);

        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_HORIZONTAL_PANE, Blocks.GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STAINED_GLASS_HORIZONTAL_PANE, Blocks.WHITE_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STAINED_GLASS_HORIZONTAL_PANE, Blocks.ORANGE_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STAINED_GLASS_HORIZONTAL_PANE, Blocks.MAGENTA_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STAINED_GLASS_HORIZONTAL_PANE, Blocks.YELLOW_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STAINED_GLASS_HORIZONTAL_PANE, Blocks.LIME_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STAINED_GLASS_HORIZONTAL_PANE, Blocks.PINK_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_STAINED_GLASS_HORIZONTAL_PANE, Blocks.GRAY_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STAINED_GLASS_HORIZONTAL_PANE, Blocks.CYAN_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STAINED_GLASS_HORIZONTAL_PANE, Blocks.PURPLE_STAINED_GLASS, null);   
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STAINED_GLASS_HORIZONTAL_PANE, Blocks.BLUE_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STAINED_GLASS_HORIZONTAL_PANE, Blocks.BROWN_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STAINED_GLASS_HORIZONTAL_PANE, Blocks.GREEN_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STAINED_GLASS_HORIZONTAL_PANE, Blocks.RED_STAINED_GLASS, null);
        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STAINED_GLASS_HORIZONTAL_PANE, Blocks.BLACK_STAINED_GLASS, null);

        addShapedShelfRecipe(exporter, ModBlocks.OAK_SHELF, Blocks.OAK_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.SPRUCE_SHELF, Blocks.SPRUCE_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.BIRCH_SHELF, Blocks.BIRCH_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.JUNGLE_SHELF, Blocks.JUNGLE_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.ACACIA_SHELF, Blocks.ACACIA_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.DARK_OAK_SHELF, Blocks.DARK_OAK_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.MANGROVE_SHELF, Blocks.MANGROVE_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.CHERRY_SHELF, Blocks.CHERRY_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.CRIMSON_SHELF, Blocks.CRIMSON_PLANKS, Items.STICK);
        addShapedShelfRecipe(exporter, ModBlocks.WARPED_SHELF, Blocks.WARPED_PLANKS, Items.STICK);

        addShapedPressurePlateRecipe(exporter, ModBlocks.COBBLESTONE_PRESSURE_PLATE, Blocks.COBBLESTONE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, Blocks.MOSSY_COBBLESTONE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, Blocks.SMOOTH_STONE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.STONE_BRICK_PRESSURE_PLATE, Blocks.STONE_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE, Blocks.MOSSY_STONE_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE, Blocks.DEEPSLATE_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.BRICK_PRESSURE_PLATE, Blocks.BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.MUD_BRICK_PRESSURE_PLATE, Blocks.MUD_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.SANDSTONE_PRESSURE_PLATE, Blocks.SANDSTONE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, Blocks.RED_SANDSTONE);
        addShapedPressurePlateRecipe(exporter, ModBlocks.NETHER_BRICK_PRESSURE_PLATE, Blocks.NETHER_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE, Blocks.RED_NETHER_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.END_STONE_BRICK_PRESSURE_PLATE, Blocks.END_STONE_BRICKS);
        addShapedPressurePlateRecipe(exporter, ModBlocks.QUARTZ_PRESSURE_PLATE, Blocks.QUARTZ_BLOCK);
    }

    private void generateItems(RecipeExporter exporter) {
        exporter.accept(Identifier.of(Vanillaplusplus.MOD_ID, "dynamite"), new DynamiteRecipe(CraftingRecipeCategory.MISC), null);

        addShapedDaggerWoodRecipe(exporter, ModItems.WOODEN_DAGGER);
        addShapedDaggerStoneRecipe(exporter, ModItems.STONE_DAGGER);
        addShapedDaggerRecipe(exporter, ModItems.IRON_DAGGER, Items.IRON_INGOT);
        addShapedDaggerRecipe(exporter, ModItems.GOLDEN_DAGGER, Items.GOLD_INGOT);
        addShapedDaggerRecipe(exporter, ModItems.DIAMOND_DAGGER, Items.DIAMOND);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER);


        addShapedHammerWoodRecipe(exporter, ModItems.WOODEN_HAMMER);
        addShapedHammerStoneRecipe(exporter, ModItems.STONE_HAMMER);
        addShapedHammerRecipe(exporter, ModItems.IRON_HAMMER, Items.IRON_INGOT);
        addShapedHammerRecipe(exporter, ModItems.GOLDEN_HAMMER, Items.GOLD_INGOT);
        addShapedHammerRecipe(exporter, ModItems.DIAMOND_HAMMER, Items.DIAMOND);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_HAMMER, RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER);
    }

    private void generateStoneCutterSlabRecipes(RecipeExporter exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB, Blocks.STONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, Blocks.SMOOTH_STONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB, Blocks.STONE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_VERTICAL_SLAB, Blocks.GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, Blocks.GRANITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, Blocks.POLISHED_GRANITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_VERTICAL_SLAB, Blocks.DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, Blocks.DIORITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, Blocks.POLISHED_DIORITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, Blocks.POLISHED_ANDESITE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_VERTICAL_SLAB, Blocks.TUFF, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, Blocks.TUFF, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.TUFF, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, Blocks.POLISHED_TUFF, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.POLISHED_TUFF, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.TUFF_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_VERTICAL_SLAB, Blocks.BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_BRICK_VERTICAL_SLAB, Blocks.MUD_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_VERTICAL_SLAB, Blocks.SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, Blocks.SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, Blocks.RED_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, Blocks.RED_SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_RED_SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_RED_SANDSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, Blocks.PRISMARINE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, Blocks.RED_NETHER_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.BLACKSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, Blocks.END_STONE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_VERTICAL_SLAB, Blocks.PURPUR_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_VERTICAL_SLAB, Blocks.QUARTZ_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, Blocks.QUARTZ_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COPPER_VERTICAL_SLAB, Blocks.CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COPPER_VERTICAL_SLAB, Blocks.COPPER_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.EXPOSED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.COPPER_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_COPPER, 2);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_COPPER_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_EXPOSED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_WEATHERED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.WAXED_OXIDIZED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_VERTICAL_SLAB, Blocks.LAPIS_BLOCK, 2);

        // Diamond, Emerald, Gold and Iron are too hard for a stonecutter!
    }

    private void offerShapedSlabRecipe(RecipeExporter exporter, RecipeCategory category, Block slab, Block block,
            String group) {
        ShapedRecipeJsonBuilder.create(category, slab, 6)
                .pattern("###")
                .group(group)
                .input('#', block)
                .criterion(FabricRecipeProvider.hasItem(block),
                        FabricRecipeProvider.conditionsFromItem(block))
                .offerTo(exporter);
    }

    private void offerShapedVerticalSlabRecipe(RecipeExporter exporter, RecipeCategory category, Block slab,
            Block block,
            String group) {
        ShapedRecipeJsonBuilder.create(category, slab, 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .group(group)
                .input('#', block)
                .criterion(FabricRecipeProvider.hasItem(block),
                        FabricRecipeProvider.conditionsFromItem(block))
                .offerTo(exporter);
    }

    private void offerShapedHorizontalPaneRecipe(RecipeExporter exporter, RecipeCategory category, Block pane, Block block, String group) {
        ShapedRecipeJsonBuilder.create(category, pane, 16)
            .pattern("##")
            .pattern("##")
            .pattern("##")
            .group(group)
            .input('#', block)
            .criterion(FabricRecipeProvider.hasItem(block),
                    FabricRecipeProvider.conditionsFromItem(block))
            .offerTo(exporter);
    }

    private void addShapedShelfRecipe(RecipeExporter exporter, Block shelf, Block planks, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, shelf, 1)
            .pattern("###")
            .pattern("S S")
            .group("shelf")
            .input('#', planks)
            .input('S', stick)
            .criterion(FabricRecipeProvider.hasItem(planks),
                    FabricRecipeProvider.conditionsFromItem(planks))
            .offerTo(exporter);
    }

    private void addShapedPressurePlateRecipe(RecipeExporter exporter, Block pressurePlate, Block block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, pressurePlate, 1)
            .pattern("##")
            .group("pressure_plate")
            .input('#', block)
            .criterion(FabricRecipeProvider.hasItem(block),
                    FabricRecipeProvider.conditionsFromItem(block))
            .offerTo(exporter);
    }

    private void addShapedDaggerWoodRecipe(RecipeExporter exporter, Item dagger) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, dagger, 1)
            .pattern("O")
            .pattern("S")
            .group("dagger")
            .input('O', Ingredient.fromTag(ItemTags.PLANKS))
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }

    private void addShapedDaggerStoneRecipe(RecipeExporter exporter, Item dagger) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, dagger, 1)
            .pattern("O")
            .pattern("S")
            .group("dagger")
            .input('O', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }   

    private void addShapedDaggerRecipe(RecipeExporter exporter, Item dagger, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, dagger, 1)
            .pattern("O")
            .pattern("S")
            .group("dagger")
            .input('O', material)
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }

    private void addShapedHammerWoodRecipe(RecipeExporter exporter, Item hammer) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hammer, 1)
            .pattern("OOO")
            .pattern(" S ")
            .group("hammer")
            .input('O', Ingredient.fromTag(ItemTags.PLANKS))
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }

    private void addShapedHammerStoneRecipe(RecipeExporter exporter, Item hammer) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hammer, 1)
            .pattern("OOO")
            .pattern(" S ")
            .group("hammer")
            .input('O', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }

    private void addShapedHammerRecipe(RecipeExporter exporter, Item hammer, Item material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hammer, 1)
            .pattern("OOO")
            .pattern(" S ")
            .group("hammer")
            .input('O', material)
            .input('S', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                    FabricRecipeProvider.conditionsFromItem(Items.STICK))
            .offerTo(exporter);
    }
}
