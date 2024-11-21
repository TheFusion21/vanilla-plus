package com.kayhennig.vanplusplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplusplus.ModBlocks;
import com.kayhennig.vanplusplus.block.VerticalSlabBlock;
import com.kayhennig.vanplusplus.block.enums.VerticalSlabType;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput,
            CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        generateSlabs();
        generateVerticalSlabs();
    }

    private void generateSlabs() {
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

    private void generateVerticalSlabs() {
        addDrop(ModBlocks.IRON_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.IRON_VERTICAL_SLAB));
        addDrop(ModBlocks.LAPIS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.LAPIS_VERTICAL_SLAB));
        addDrop(ModBlocks.GOLD_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.GOLD_VERTICAL_SLAB));
        addDrop(ModBlocks.DIAMOND_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.DIAMOND_VERTICAL_SLAB));
        addDrop(ModBlocks.EMERALD_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.EMERALD_VERTICAL_SLAB));

        addDrop(ModBlocks.OAK_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.OAK_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.SPRUCE_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.BIRCH_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.JUNGLE_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.ACACIA_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.DARK_OAK_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.MANGROVE_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.CHERRY_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.CRIMSON_PLANKS_VERTICAL_SLAB));
        addDrop(ModBlocks.WARPED_PLANKS_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.WARPED_PLANKS_VERTICAL_SLAB));

        addDrop(ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_OAK_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_SPRUCE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_BIRCH_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_JUNGLE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_ACACIA_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_MANGROVE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_CHERRY_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_CRIMSON_STEM_VERTICAL_SLAB));
        addDrop(ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.STRIPPED_WARPED_STEM_VERTICAL_SLAB));

        addDrop(ModBlocks.OAK_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.OAK_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.SPRUCE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.SPRUCE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.BIRCH_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.BIRCH_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.JUNGLE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.JUNGLE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.ACACIA_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.ACACIA_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.DARK_OAK_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.MANGROVE_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.MANGROVE_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.CHERRY_LOG_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.CHERRY_LOG_VERTICAL_SLAB));
        addDrop(ModBlocks.CRIMSON_STEM_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.CRIMSON_STEM_VERTICAL_SLAB));
        addDrop(ModBlocks.WARPED_STEM_VERTICAL_SLAB, verticalSlabDrops(ModBlocks.WARPED_STEM_VERTICAL_SLAB));

        addDrop(ModBlocks.OAK_SHELF, drops(ModBlocks.OAK_SHELF));
        addDrop(ModBlocks.SPRUCE_SHELF, drops(ModBlocks.SPRUCE_SHELF));
        addDrop(ModBlocks.BIRCH_SHELF, drops(ModBlocks.BIRCH_SHELF));
        addDrop(ModBlocks.JUNGLE_SHELF, drops(ModBlocks.JUNGLE_SHELF));
        addDrop(ModBlocks.ACACIA_SHELF, drops(ModBlocks.ACACIA_SHELF));
        addDrop(ModBlocks.DARK_OAK_SHELF, drops(ModBlocks.DARK_OAK_SHELF));
        addDrop(ModBlocks.MANGROVE_SHELF, drops(ModBlocks.MANGROVE_SHELF));
        addDrop(ModBlocks.CHERRY_SHELF, drops(ModBlocks.CHERRY_SHELF));
        addDrop(ModBlocks.CRIMSON_SHELF, drops(ModBlocks.CRIMSON_SHELF));
        addDrop(ModBlocks.WARPED_SHELF, drops(ModBlocks.WARPED_SHELF));
    }

    public LootTable.Builder verticalSlabDrops(Block drop) {
        return LootTable.builder().pool(
            LootPool.builder().rolls(
                ConstantLootNumberProvider.create(1.0F)).with((LootPoolEntry.Builder<?>) this.applyExplosionDecay(drop, ItemEntry.builder(drop).apply(
                    SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                        .conditionally(BlockStatePropertyLootCondition.builder(drop).properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE_EAST)))
                        .conditionally(BlockStatePropertyLootCondition.builder(drop).properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE_NORTH)))
                ))));
    }
}