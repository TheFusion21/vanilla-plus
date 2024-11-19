package com.kayhennig.vanplusplus;

import com.kayhennig.vanplusplus.block.VerticalSlabBlock;
import com.kayhennig.vanplusplus.item.ModItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Slabs
    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    // Log Slabs

    public static final Block OAK_LOG_SLAB = registerBlock("oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_LOG_SLAB = registerBlock("birch_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_LOG_SLAB = registerBlock("acacia_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_LOG_SLAB = registerBlock("cherry_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_STEM_SLAB = registerBlock("warped_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Stripped Slabs

    public static final Block STRIPPED_OAK_LOG_SLAB = registerBlock("stripped_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STRIPPED_SPRUCE_LOG_SLAB = registerBlock("stripped_spruce_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block STRIPPED_BIRCH_LOG_SLAB = registerBlock("stripped_birch_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block STRIPPED_JUNGLE_LOG_SLAB = registerBlock("stripped_jungle_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block STRIPPED_ACACIA_LOG_SLAB = registerBlock("stripped_acacia_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block STRIPPED_DARK_OAK_LOG_SLAB = registerBlock("stripped_dark_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block STRIPPED_MANGROVE_LOG_SLAB = registerBlock("stripped_mangrove_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block STRIPPED_CHERRY_LOG_SLAB = registerBlock("stripped_cherry_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block STRIPPED_CRIMSON_STEM_SLAB = registerBlock("stripped_crimson_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block STRIPPED_WARPED_STEM_SLAB = registerBlock("stripped_warped_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));

    // Vertical Slabs

    public static final Block IRON_VERTICAL_SLAB = registerBlock("iron_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block LAPIS_VERTICAL_SLAB = registerBlock("lapis_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block GOLD_VERTICAL_SLAB = registerBlock("gold_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block DIAMOND_VERTICAL_SLAB = registerBlock("diamond_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block EMERALD_VERTICAL_SLAB = registerBlock("emerald_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    // Planks Vertical Slabs

    public static final Block OAK_PLANKS_VERTICAL_SLAB = registerBlock("oak_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_PLANKS_VERTICAL_SLAB = registerBlock("spruce_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_PLANKS_VERTICAL_SLAB = registerBlock("birch_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_PLANKS_VERTICAL_SLAB = registerBlock("jungle_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_PLANKS_VERTICAL_SLAB = registerBlock("acacia_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_PLANKS_VERTICAL_SLAB = registerBlock("dark_oak_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_PLANKS_VERTICAL_SLAB = registerBlock("mangrove_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_PLANKS_VERTICAL_SLAB = registerBlock("cherry_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_PLANKS_VERTICAL_SLAB = registerBlock("crimson_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_PLANKS_VERTICAL_SLAB = registerBlock("warped_planks_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Stripped Vertical Slabs

    public static final Block STRIPPED_OAK_LOG_VERTICAL_SLAB = registerBlock("stripped_oak_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STRIPPED_SPRUCE_LOG_VERTICAL_SLAB = registerBlock("stripped_spruce_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block STRIPPED_BIRCH_LOG_VERTICAL_SLAB = registerBlock("stripped_birch_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block STRIPPED_JUNGLE_LOG_VERTICAL_SLAB = registerBlock("stripped_jungle_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block STRIPPED_ACACIA_LOG_VERTICAL_SLAB = registerBlock("stripped_acacia_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB = registerBlock("stripped_dark_oak_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block STRIPPED_MANGROVE_LOG_VERTICAL_SLAB = registerBlock("stripped_mangrove_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block STRIPPED_CHERRY_LOG_VERTICAL_SLAB = registerBlock("stripped_cherry_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block STRIPPED_CRIMSON_STEM_VERTICAL_SLAB = registerBlock("stripped_crimson_stem_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block STRIPPED_WARPED_STEM_VERTICAL_SLAB = registerBlock("stripped_warped_stem_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Logs Vertical Slabs

    public static final Block OAK_LOG_VERTICAL_SLAB = registerBlock("oak_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_VERTICAL_SLAB = registerBlock("spruce_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_LOG_VERTICAL_SLAB = registerBlock("birch_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_LOG_VERTICAL_SLAB = registerBlock("jungle_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_LOG_VERTICAL_SLAB = registerBlock("acacia_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_LOG_VERTICAL_SLAB = registerBlock("dark_oak_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_LOG_VERTICAL_SLAB = registerBlock("mangrove_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_LOG_VERTICAL_SLAB = registerBlock("cherry_log_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_STEM_VERTICAL_SLAB = registerBlock("crimson_stem_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_STEM_VERTICAL_SLAB = registerBlock("warped_stem_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Registry
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Vanillaplusplus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Vanillaplusplus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static void addBlockToBuildingBlockGroup(FabricItemGroupEntries entries) {
        entries.add(IRON_SLAB);
        entries.add(LAPIS_SLAB);
        entries.add(GOLD_SLAB);
        entries.add(DIAMOND_SLAB);
        entries.add(EMERALD_SLAB);

        entries.add(OAK_LOG_SLAB);
        entries.add(SPRUCE_LOG_SLAB);
        entries.add(BIRCH_LOG_SLAB);
        entries.add(JUNGLE_LOG_SLAB);
        entries.add(ACACIA_LOG_SLAB);
        entries.add(DARK_OAK_LOG_SLAB);
        entries.add(MANGROVE_LOG_SLAB);
        entries.add(CHERRY_LOG_SLAB);
        entries.add(CRIMSON_STEM_SLAB);
        entries.add(WARPED_STEM_SLAB);

        entries.add(STRIPPED_OAK_LOG_SLAB);
        entries.add(STRIPPED_SPRUCE_LOG_SLAB);
        entries.add(STRIPPED_BIRCH_LOG_SLAB);
        entries.add(STRIPPED_JUNGLE_LOG_SLAB);
        entries.add(STRIPPED_ACACIA_LOG_SLAB);
        entries.add(STRIPPED_DARK_OAK_LOG_SLAB);
        entries.add(STRIPPED_MANGROVE_LOG_SLAB);
        entries.add(STRIPPED_CHERRY_LOG_SLAB);
        entries.add(STRIPPED_CRIMSON_STEM_SLAB);
        entries.add(STRIPPED_WARPED_STEM_SLAB);

        entries.add(IRON_VERTICAL_SLAB);
        entries.add(LAPIS_VERTICAL_SLAB);
        entries.add(GOLD_VERTICAL_SLAB);
        entries.add(DIAMOND_VERTICAL_SLAB);
        entries.add(EMERALD_VERTICAL_SLAB);

        entries.add(OAK_PLANKS_VERTICAL_SLAB);
        entries.add(SPRUCE_PLANKS_VERTICAL_SLAB);
        entries.add(BIRCH_PLANKS_VERTICAL_SLAB);
        entries.add(JUNGLE_PLANKS_VERTICAL_SLAB);
        entries.add(ACACIA_PLANKS_VERTICAL_SLAB);
        entries.add(DARK_OAK_PLANKS_VERTICAL_SLAB);
        entries.add(MANGROVE_PLANKS_VERTICAL_SLAB);
        entries.add(CHERRY_PLANKS_VERTICAL_SLAB);
        entries.add(CRIMSON_PLANKS_VERTICAL_SLAB);
        entries.add(WARPED_PLANKS_VERTICAL_SLAB);

        entries.add(STRIPPED_OAK_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_SPRUCE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_BIRCH_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_JUNGLE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_ACACIA_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_MANGROVE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_CHERRY_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_CRIMSON_STEM_VERTICAL_SLAB);
        entries.add(STRIPPED_WARPED_STEM_VERTICAL_SLAB);

        entries.add(OAK_LOG_VERTICAL_SLAB);
        entries.add(SPRUCE_LOG_VERTICAL_SLAB);
        entries.add(BIRCH_LOG_VERTICAL_SLAB);
        entries.add(JUNGLE_LOG_VERTICAL_SLAB);
        entries.add(ACACIA_LOG_VERTICAL_SLAB);
        entries.add(DARK_OAK_LOG_VERTICAL_SLAB);
        entries.add(MANGROVE_LOG_VERTICAL_SLAB);
        entries.add(CHERRY_LOG_VERTICAL_SLAB);
        entries.add(CRIMSON_STEM_VERTICAL_SLAB);
        entries.add(WARPED_STEM_VERTICAL_SLAB);

    }

    private static void addBlockToColoredBlockGroup(FabricItemGroupEntries entries) {
        entries.add(GLASS_SLAB);
    }

    private static void addBlockToModBlockGroup(FabricItemGroupEntries entries) {
        entries.add(IRON_SLAB);
        entries.add(LAPIS_SLAB);
        entries.add(GOLD_SLAB);
        entries.add(DIAMOND_SLAB);
        entries.add(EMERALD_SLAB);

        entries.add(OAK_LOG_SLAB);
        entries.add(SPRUCE_LOG_SLAB);
        entries.add(BIRCH_LOG_SLAB);
        entries.add(JUNGLE_LOG_SLAB);
        entries.add(ACACIA_LOG_SLAB);
        entries.add(DARK_OAK_LOG_SLAB);
        entries.add(MANGROVE_LOG_SLAB);
        entries.add(CHERRY_LOG_SLAB);
        entries.add(CRIMSON_STEM_SLAB);
        entries.add(WARPED_STEM_SLAB);

        entries.add(STRIPPED_OAK_LOG_SLAB);
        entries.add(STRIPPED_SPRUCE_LOG_SLAB);
        entries.add(STRIPPED_BIRCH_LOG_SLAB);
        entries.add(STRIPPED_JUNGLE_LOG_SLAB);
        entries.add(STRIPPED_ACACIA_LOG_SLAB);
        entries.add(STRIPPED_DARK_OAK_LOG_SLAB);
        entries.add(STRIPPED_MANGROVE_LOG_SLAB);
        entries.add(STRIPPED_CHERRY_LOG_SLAB);
        entries.add(STRIPPED_CRIMSON_STEM_SLAB);
        entries.add(STRIPPED_WARPED_STEM_SLAB);

        entries.add(IRON_VERTICAL_SLAB);
        entries.add(LAPIS_VERTICAL_SLAB);
        entries.add(GOLD_VERTICAL_SLAB);
        entries.add(DIAMOND_VERTICAL_SLAB);
        entries.add(EMERALD_VERTICAL_SLAB);

        entries.add(OAK_PLANKS_VERTICAL_SLAB);
        entries.add(SPRUCE_PLANKS_VERTICAL_SLAB);
        entries.add(BIRCH_PLANKS_VERTICAL_SLAB);
        entries.add(JUNGLE_PLANKS_VERTICAL_SLAB);
        entries.add(ACACIA_PLANKS_VERTICAL_SLAB);
        entries.add(DARK_OAK_PLANKS_VERTICAL_SLAB);
        entries.add(MANGROVE_PLANKS_VERTICAL_SLAB);
        entries.add(CHERRY_PLANKS_VERTICAL_SLAB);
        entries.add(CRIMSON_PLANKS_VERTICAL_SLAB);
        entries.add(WARPED_PLANKS_VERTICAL_SLAB);

        entries.add(STRIPPED_OAK_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_SPRUCE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_BIRCH_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_JUNGLE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_ACACIA_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_MANGROVE_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_CHERRY_LOG_VERTICAL_SLAB);
        entries.add(STRIPPED_CRIMSON_STEM_VERTICAL_SLAB);
        entries.add(STRIPPED_WARPED_STEM_VERTICAL_SLAB);

        entries.add(OAK_LOG_VERTICAL_SLAB);
        entries.add(SPRUCE_LOG_VERTICAL_SLAB);
        entries.add(BIRCH_LOG_VERTICAL_SLAB);
        entries.add(JUNGLE_LOG_VERTICAL_SLAB);
        entries.add(ACACIA_LOG_VERTICAL_SLAB);
        entries.add(DARK_OAK_LOG_VERTICAL_SLAB);
        entries.add(MANGROVE_LOG_VERTICAL_SLAB);
        entries.add(CHERRY_LOG_VERTICAL_SLAB);
        entries.add(CRIMSON_STEM_VERTICAL_SLAB);
        entries.add(WARPED_STEM_VERTICAL_SLAB);

        entries.add(GLASS_SLAB);
    }

    private static void addBlockToNaturalBlockGroup(FabricItemGroupEntries entries) { 
        entries.add(OAK_LOG_SLAB);
        entries.add(SPRUCE_LOG_SLAB);
        entries.add(BIRCH_LOG_SLAB);
        entries.add(JUNGLE_LOG_SLAB);
        entries.add(ACACIA_LOG_SLAB);
        entries.add(DARK_OAK_LOG_SLAB);
        entries.add(MANGROVE_LOG_SLAB);
        entries.add(CHERRY_LOG_SLAB);
        entries.add(CRIMSON_STEM_SLAB);
        entries.add(WARPED_STEM_SLAB);

        entries.add(OAK_LOG_VERTICAL_SLAB);
        entries.add(SPRUCE_LOG_VERTICAL_SLAB);
        entries.add(BIRCH_LOG_VERTICAL_SLAB);
        entries.add(JUNGLE_LOG_VERTICAL_SLAB);
        entries.add(ACACIA_LOG_VERTICAL_SLAB);
        entries.add(DARK_OAK_LOG_VERTICAL_SLAB);
        entries.add(MANGROVE_LOG_VERTICAL_SLAB);
        entries.add(CHERRY_LOG_VERTICAL_SLAB);
        entries.add(CRIMSON_STEM_VERTICAL_SLAB);
        entries.add(WARPED_STEM_VERTICAL_SLAB);
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(ModBlocks::addBlockToBuildingBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBlockToColoredBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlockToNaturalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.VANPLUS).register(ModBlocks::addBlockToModBlockGroup);
    }
}
