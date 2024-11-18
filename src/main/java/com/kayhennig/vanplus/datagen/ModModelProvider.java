package com.kayhennig.vanplus.datagen;

import com.kayhennig.vanplus.ModItems;
import com.kayhennig.vanplus.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
  public ModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
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

    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_OAK_LOG,
        ModBlocks.STRIPPED_OAK_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_SPRUCE_LOG,
        ModBlocks.STRIPPED_SPRUCE_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_BIRCH_LOG,
        ModBlocks.STRIPPED_BIRCH_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_JUNGLE_LOG,
        ModBlocks.STRIPPED_JUNGLE_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_ACACIA_LOG,
        ModBlocks.STRIPPED_ACACIA_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_DARK_OAK_LOG,
        ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_MANGROVE_LOG,
        ModBlocks.STRIPPED_MANGROVE_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CHERRY_LOG,
        ModBlocks.STRIPPED_CHERRY_LOG_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CRIMSON_STEM,
        ModBlocks.STRIPPED_CRIMSON_STEM_SLAB);
    generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_WARPED_STEM,
        ModBlocks.STRIPPED_WARPED_STEM_SLAB);

    generateBlockStateSlabModel(blockStateModelGenerator, Blocks.GLASS, ModBlocks.GLASS_SLAB);
  }

  private void generateBlockStateSlabModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock,
      Block slabBlock) {
    TextureMap textureMap = TextureMap.all(mainBlock);
    TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(slabBlock, "_side"),
        textureMap.getTexture(TextureKey.TOP));

    Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
    Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
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
    Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
    Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2,
        blockStateModelGenerator.modelCollector);

    blockStateModelGenerator.blockStateCollector
        .accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    // Food
    itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
  }

}
