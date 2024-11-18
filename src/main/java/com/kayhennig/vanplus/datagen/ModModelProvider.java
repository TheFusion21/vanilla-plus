package com.kayhennig.vanplus.datagen;

import com.kayhennig.vanplus.ModItems;
import com.kayhennig.vanplus.Modblocks;

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
      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.IRON_BLOCK, Modblocks.IRON_SLAB);
      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.LAPIS_BLOCK, Modblocks.LAPIS_SLAB);
      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.GOLD_BLOCK, Modblocks.GOLD_SLAB);
      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.DIAMOND_BLOCK, Modblocks.DIAMOND_SLAB);
      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.EMERALD_BLOCK, Modblocks.EMERALD_SLAB);

      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.OAK_LOG, Modblocks.OAK_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.SPRUCE_LOG, Modblocks.SPRUCE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.BIRCH_LOG, Modblocks.BIRCH_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.JUNGLE_LOG, Modblocks.JUNGLE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.ACACIA_LOG, Modblocks.ACACIA_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.DARK_OAK_LOG, Modblocks.DARK_OAK_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.MANGROVE_LOG, Modblocks.MANGROVE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.CHERRY_LOG, Modblocks.CHERRY_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.CRIMSON_STEM, Modblocks.CRIMSON_STEM_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.WARPED_STEM, Modblocks.WARPED_STEM_SLAB);

      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_OAK_LOG, Modblocks.STRIPPED_OAK_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_SPRUCE_LOG, Modblocks.STRIPPED_SPRUCE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_BIRCH_LOG, Modblocks.STRIPPED_BIRCH_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_JUNGLE_LOG, Modblocks.STRIPPED_JUNGLE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_ACACIA_LOG, Modblocks.STRIPPED_ACACIA_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_DARK_OAK_LOG, Modblocks.STRIPPED_DARK_OAK_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_MANGROVE_LOG, Modblocks.STRIPPED_MANGROVE_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CHERRY_LOG, Modblocks.STRIPPED_CHERRY_LOG_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_CRIMSON_STEM, Modblocks.STRIPPED_CRIMSON_STEM_SLAB);
      generateBlockStateSlabFromLogModel(blockStateModelGenerator, Blocks.STRIPPED_WARPED_STEM, Modblocks.STRIPPED_WARPED_STEM_SLAB);

      generateBlockStateSlabModel(blockStateModelGenerator, Blocks.GLASS, Modblocks.GLASS_SLAB);
    }

    private void generateBlockStateSlabModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock, Block slabBlock) {
      TextureMap textureMap = TextureMap.all(mainBlock);
      TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(slabBlock, "_side"), textureMap.getTexture(TextureKey.TOP));
      
      Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
      Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
      Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2, blockStateModelGenerator.modelCollector);

      blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }

    private void generateBlockStateSlabFromLogModel(BlockStateModelGenerator blockStateModelGenerator, Block mainBlock, Block slabBlock) {
      TextureMap textureMap = new TextureMap().put(TextureKey.SIDE, TextureMap.getId(mainBlock)).put(TextureKey.END, TextureMap.getSubId(mainBlock, "_top"));
      TextureMap textureMap2 = TextureMap.sideEnd(textureMap.getTexture(TextureKey.SIDE), textureMap.getTexture(TextureKey.END));

      Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
      Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
      Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap2, blockStateModelGenerator.modelCollector);

      blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
      // Food
      itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
    }
  
}
