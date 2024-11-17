package com.kayhennig.vanplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplus.Modblocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
      // Stonecutting
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.IRON_SLAB, Blocks.IRON_BLOCK, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.GOLD_SLAB, Blocks.GOLD_BLOCK, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK, 2);

      //offerShapedSlabRecipeFromItem(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.IRON_SLAB, Items.IRON_INGOT);
      //offerShapedSlabRecipeFromItem(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.LAPIS_SLAB, Items.LAPIS_LAZULI);
      //offerShapedSlabRecipeFromItem(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.GOLD_SLAB, Items.GOLD_INGOT);
      //offerShapedSlabRecipeFromItem(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.DIAMOND_SLAB, Items.DIAMOND);
      //offerShapedSlabRecipeFromItem(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.EMERALD_SLAB, Items.EMERALD);

      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.OAK_LOG_SLAB, Blocks.OAK_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, 2);

      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG, 2);
      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG, 2);

      offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.GLASS_SLAB, Blocks.GLASS, 2);

      // Shaped
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.IRON_SLAB, Blocks.IRON_BLOCK, null);
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, null);
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.GOLD_SLAB, Blocks.GOLD_BLOCK, null);
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, null);
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK, null);

      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.OAK_LOG_SLAB, Blocks.OAK_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, "log_slab");

      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG, "log_slab");
      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.STRIPPED_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG, "log_slab");

      offerShapedSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Modblocks.GLASS_SLAB, Blocks.GLASS, null);
    }

    private void offerShapedSlabRecipe(RecipeExporter exporter, RecipeCategory category, Block slab, Block block, String group) {
      ShapedRecipeJsonBuilder.create(category, slab, 6)
          .pattern("###")
          .group(group)
          .input('#', block)
          .criterion(FabricRecipeProvider.hasItem(block), FabricRecipeProvider.conditionsFromItem(block))
          .offerTo(exporter);
    }

    private void offerShapedSlabRecipeFromItem(RecipeExporter exporter, RecipeCategory category, Block slab, Item item) {
      ShapedRecipeJsonBuilder.create(category, slab)
          .pattern("###")
          .input('#', item)
          .criterion(FabricRecipeProvider.hasItem(item), FabricRecipeProvider.conditionsFromItem(item))
          .offerTo(exporter);
    }

}
