package com.kayhennig.vanplusplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplusplus.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateSlab(exporter);
        generateVerticalSlab(exporter);
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

        offerShapedHorizontalPaneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_HORIZONTAL_PANE, Blocks.GLASS, null);
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
}
