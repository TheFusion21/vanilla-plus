package com.kayhennig.vanplusplus;

import com.kayhennig.vanplusplus.block.*;
import com.kayhennig.vanplusplus.item.ModItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Slabs
    public static final Block IRON_SLAB = registerBlock("iron_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    // Log Slabs

    public static final Block OAK_LOG_SLAB = registerBlock("oak_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_LOG_SLAB = registerBlock("birch_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_LOG_SLAB = registerBlock("acacia_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_LOG_SLAB = registerBlock("cherry_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_STEM_SLAB = registerBlock("warped_stem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Stripped Slabs

    public static final Block STRIPPED_OAK_LOG_SLAB = registerBlock("stripped_oak_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STRIPPED_SPRUCE_LOG_SLAB = registerBlock("stripped_spruce_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block STRIPPED_BIRCH_LOG_SLAB = registerBlock("stripped_birch_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block STRIPPED_JUNGLE_LOG_SLAB = registerBlock("stripped_jungle_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block STRIPPED_ACACIA_LOG_SLAB = registerBlock("stripped_acacia_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block STRIPPED_DARK_OAK_LOG_SLAB = registerBlock("stripped_dark_oak_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block STRIPPED_MANGROVE_LOG_SLAB = registerBlock("stripped_mangrove_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block STRIPPED_CHERRY_LOG_SLAB = registerBlock("stripped_cherry_log_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block STRIPPED_CRIMSON_STEM_SLAB = registerBlock("stripped_crimson_stem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block STRIPPED_WARPED_STEM_SLAB = registerBlock("stripped_warped_stem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Glass Slabs

    public static final Block GLASS_SLAB = registerBlock("glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));

    // Vertical Slabs

    public static final Block IRON_VERTICAL_SLAB = registerBlock("iron_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block LAPIS_VERTICAL_SLAB = registerBlock("lapis_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block GOLD_VERTICAL_SLAB = registerBlock("gold_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block DIAMOND_VERTICAL_SLAB = registerBlock("diamond_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block EMERALD_VERTICAL_SLAB = registerBlock("emerald_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    // Planks Vertical Slabs

    public static final Block OAK_PLANKS_VERTICAL_SLAB = registerBlock("oak_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_PLANKS_VERTICAL_SLAB = registerBlock("spruce_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_PLANKS_VERTICAL_SLAB = registerBlock("birch_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_PLANKS_VERTICAL_SLAB = registerBlock("jungle_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_PLANKS_VERTICAL_SLAB = registerBlock("acacia_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_PLANKS_VERTICAL_SLAB = registerBlock("dark_oak_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_PLANKS_VERTICAL_SLAB = registerBlock("mangrove_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_PLANKS_VERTICAL_SLAB = registerBlock("cherry_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_PLANKS_VERTICAL_SLAB = registerBlock("crimson_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_PLANKS_VERTICAL_SLAB = registerBlock("warped_planks_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Stripped Vertical Slabs

    public static final Block STRIPPED_OAK_LOG_VERTICAL_SLAB = registerBlock("stripped_oak_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STRIPPED_SPRUCE_LOG_VERTICAL_SLAB = registerBlock("stripped_spruce_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block STRIPPED_BIRCH_LOG_VERTICAL_SLAB = registerBlock("stripped_birch_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block STRIPPED_JUNGLE_LOG_VERTICAL_SLAB = registerBlock("stripped_jungle_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block STRIPPED_ACACIA_LOG_VERTICAL_SLAB = registerBlock("stripped_acacia_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB = registerBlock("stripped_dark_oak_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block STRIPPED_MANGROVE_LOG_VERTICAL_SLAB = registerBlock("stripped_mangrove_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block STRIPPED_CHERRY_LOG_VERTICAL_SLAB = registerBlock("stripped_cherry_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block STRIPPED_CRIMSON_STEM_VERTICAL_SLAB = registerBlock("stripped_crimson_stem_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block STRIPPED_WARPED_STEM_VERTICAL_SLAB = registerBlock("stripped_warped_stem_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Logs Vertical Slabs

    public static final Block OAK_LOG_VERTICAL_SLAB = registerBlock("oak_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_VERTICAL_SLAB = registerBlock("spruce_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_LOG_VERTICAL_SLAB = registerBlock("birch_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_LOG_VERTICAL_SLAB = registerBlock("jungle_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_LOG_VERTICAL_SLAB = registerBlock("acacia_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_LOG_VERTICAL_SLAB = registerBlock("dark_oak_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_LOG_VERTICAL_SLAB = registerBlock("mangrove_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_LOG_VERTICAL_SLAB = registerBlock("cherry_log_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_STEM_VERTICAL_SLAB = registerBlock("crimson_stem_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_STEM_VERTICAL_SLAB = registerBlock("warped_stem_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Bamboo Vertical Slabs

    public static final Block BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB)));
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlock("bamboo_mosaic_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB)));

    // Copper Vertical Slabs

    public static final Block CUT_COPPER_VERTICAL_SLAB = registerBlock("cut_copper_vertical_slab", new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB)));
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("exposed_cut_copper_vertical_slab", new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB)));
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("weathered_cut_copper_vertical_slab", new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB)));
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("oxidized_cut_copper_vertical_slab", new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB)));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_cut_copper_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_exposed_cut_copper_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_weathered_cut_copper_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_oxidized_cut_copper_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)));

    // Glass Vertical Slabs

    public static final Block GLASS_VERTICAL_SLAB = registerBlock("glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));

    // Glass Horizontal Pane

    public static final Block GLASS_HORIZONTAL_PANE = registerBlock("glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE).nonOpaque()));
    public static final Block WHITE_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("white_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block ORANGE_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("orange_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block MAGENTA_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("magenta_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("light_blue_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block YELLOW_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("yellow_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block LIME_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("lime_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block PINK_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("pink_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block GRAY_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("gray_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("light_gray_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block CYAN_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("cyan_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block PURPLE_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("purple_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block BLUE_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("blue_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block BROWN_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("brown_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block GREEN_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("green_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block RED_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("red_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block BLACK_STAINED_GLASS_HORIZONTAL_PANE = registerBlock("black_stained_glass_horizontal_pane", new HorizontalPaneBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque()));

    // Shelfs

    public static final Block OAK_SHELF = registerBlock("oak_shelf", new ShelfBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).solid().strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPRUCE_SHELF = registerBlock("spruce_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_SHELF = registerBlock("birch_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_SHELF = registerBlock("jungle_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_SHELF = registerBlock("acacia_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_SHELF = registerBlock("dark_oak_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_SHELF = registerBlock("mangrove_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_SHELF = registerBlock("cherry_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_SHELF = registerBlock("crimson_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_SHELF = registerBlock("warped_shelf", new ShelfBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

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
        entries.addAfter(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, IRON_SLAB);
        entries.addAfter(Blocks.LAPIS_BLOCK, LAPIS_SLAB);
        entries.addAfter(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, GOLD_SLAB);
        entries.addAfter(Blocks.DIAMOND_BLOCK, DIAMOND_SLAB);
        entries.addAfter(Blocks.EMERALD_BLOCK, EMERALD_SLAB);

        entries.addAfter(Blocks.OAK_LOG, OAK_LOG_SLAB);
        entries.addAfter(Blocks.SPRUCE_LOG, SPRUCE_LOG_SLAB);
        entries.addAfter(Blocks.BIRCH_LOG, BIRCH_LOG_SLAB);
        entries.addAfter(Blocks.JUNGLE_LOG, JUNGLE_LOG_SLAB);
        entries.addAfter(Blocks.ACACIA_LOG, ACACIA_LOG_SLAB);
        entries.addAfter(Blocks.DARK_OAK_LOG, DARK_OAK_LOG_SLAB);
        entries.addAfter(Blocks.MANGROVE_LOG, MANGROVE_LOG_SLAB);
        entries.addAfter(Blocks.CHERRY_LOG, CHERRY_LOG_SLAB);
        entries.addAfter(Blocks.CRIMSON_STEM, CRIMSON_STEM_SLAB);
        entries.addAfter(Blocks.WARPED_STEM, WARPED_STEM_SLAB);

        entries.addAfter(Blocks.STRIPPED_OAK_LOG, STRIPPED_OAK_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_SPRUCE_LOG, STRIPPED_SPRUCE_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_BIRCH_LOG, STRIPPED_BIRCH_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_JUNGLE_LOG, STRIPPED_JUNGLE_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_ACACIA_LOG, STRIPPED_ACACIA_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_MANGROVE_LOG, STRIPPED_MANGROVE_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_LOG_SLAB);
        entries.addAfter(Blocks.STRIPPED_CRIMSON_STEM, STRIPPED_CRIMSON_STEM_SLAB);
        entries.addAfter(Blocks.STRIPPED_WARPED_STEM, STRIPPED_WARPED_STEM_SLAB);

        entries.addAfter(IRON_SLAB, IRON_VERTICAL_SLAB);
        entries.addAfter(LAPIS_SLAB, LAPIS_VERTICAL_SLAB);
        entries.addAfter(GOLD_SLAB, GOLD_VERTICAL_SLAB);
        entries.addAfter(DIAMOND_SLAB, DIAMOND_VERTICAL_SLAB);
        entries.addAfter(EMERALD_SLAB, EMERALD_VERTICAL_SLAB);

        entries.addAfter(Blocks.OAK_SLAB, OAK_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.SPRUCE_SLAB, SPRUCE_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.BIRCH_SLAB, BIRCH_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.JUNGLE_SLAB, JUNGLE_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.ACACIA_SLAB, ACACIA_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.DARK_OAK_SLAB, DARK_OAK_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.MANGROVE_SLAB, MANGROVE_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.CHERRY_SLAB, CHERRY_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.CRIMSON_SLAB, CRIMSON_PLANKS_VERTICAL_SLAB);
        entries.addAfter(Blocks.WARPED_SLAB, WARPED_PLANKS_VERTICAL_SLAB);

        entries.addAfter(Blocks.STRIPPED_OAK_LOG, STRIPPED_OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_SPRUCE_LOG, STRIPPED_SPRUCE_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_BIRCH_LOG, STRIPPED_BIRCH_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_JUNGLE_LOG, STRIPPED_JUNGLE_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_ACACIA_LOG, STRIPPED_ACACIA_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_MANGROVE_LOG, STRIPPED_MANGROVE_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_LOG_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_CRIMSON_STEM, STRIPPED_CRIMSON_STEM_VERTICAL_SLAB);
        entries.addAfter(Blocks.STRIPPED_WARPED_STEM, STRIPPED_WARPED_STEM_VERTICAL_SLAB);

        entries.addAfter(OAK_LOG_SLAB, OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(SPRUCE_LOG_SLAB, SPRUCE_LOG_VERTICAL_SLAB);
        entries.addAfter(BIRCH_LOG_SLAB, BIRCH_LOG_VERTICAL_SLAB);
        entries.addAfter(JUNGLE_LOG_SLAB, JUNGLE_LOG_VERTICAL_SLAB);
        entries.addAfter(ACACIA_LOG_SLAB, ACACIA_LOG_VERTICAL_SLAB);
        entries.addAfter(DARK_OAK_LOG_SLAB, DARK_OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(MANGROVE_LOG_SLAB, MANGROVE_LOG_VERTICAL_SLAB);
        entries.addAfter(CHERRY_LOG_SLAB, CHERRY_LOG_VERTICAL_SLAB);
        entries.addAfter(CRIMSON_STEM_SLAB, CRIMSON_STEM_VERTICAL_SLAB);
        entries.addAfter(WARPED_STEM_SLAB, WARPED_STEM_VERTICAL_SLAB);

        entries.addAfter(Blocks.BAMBOO_SLAB, BAMBOO_VERTICAL_SLAB); 
        entries.addAfter(Blocks.BAMBOO_MOSAIC_SLAB, BAMBOO_MOSAIC_VERTICAL_SLAB);

        entries.addAfter(Blocks.CUT_COPPER_SLAB, CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.EXPOSED_CUT_COPPER_SLAB, EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WEATHERED_CUT_COPPER_SLAB, WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_CUT_COPPER_SLAB, WAXED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

    }

    private static void addBlockToColoredBlockGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.GLASS, GLASS_SLAB);
        entries.addAfter(GLASS_SLAB, GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.PINK_STAINED_GLASS_PANE, GLASS_HORIZONTAL_PANE);
        entries.addAfter(GLASS_HORIZONTAL_PANE, WHITE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(WHITE_STAINED_GLASS_HORIZONTAL_PANE, ORANGE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(ORANGE_STAINED_GLASS_HORIZONTAL_PANE, MAGENTA_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(MAGENTA_STAINED_GLASS_HORIZONTAL_PANE, LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE, YELLOW_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(YELLOW_STAINED_GLASS_HORIZONTAL_PANE, LIME_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIME_STAINED_GLASS_HORIZONTAL_PANE, PINK_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(PINK_STAINED_GLASS_HORIZONTAL_PANE, GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(GRAY_STAINED_GLASS_HORIZONTAL_PANE, LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE, CYAN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(CYAN_STAINED_GLASS_HORIZONTAL_PANE, PURPLE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(PURPLE_STAINED_GLASS_HORIZONTAL_PANE, BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(BLUE_STAINED_GLASS_HORIZONTAL_PANE, BROWN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(BROWN_STAINED_GLASS_HORIZONTAL_PANE, GREEN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(GREEN_STAINED_GLASS_HORIZONTAL_PANE, RED_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(RED_STAINED_GLASS_HORIZONTAL_PANE, BLACK_STAINED_GLASS_HORIZONTAL_PANE);
    }

    private static void addBlockToModBlockGroup(FabricItemGroupEntries entries) {
        entries.add(IRON_SLAB);
        entries.add(IRON_VERTICAL_SLAB);
        entries.add(LAPIS_SLAB);
        entries.add(LAPIS_VERTICAL_SLAB);
        entries.add(GOLD_SLAB);
        entries.add(GOLD_VERTICAL_SLAB);
        entries.add(DIAMOND_SLAB);
        entries.add(DIAMOND_VERTICAL_SLAB);
        entries.add(EMERALD_SLAB);
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

        entries.add(BAMBOO_VERTICAL_SLAB);
        entries.add(BAMBOO_MOSAIC_VERTICAL_SLAB);

        entries.add(CUT_COPPER_VERTICAL_SLAB);
        entries.add(EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(WAXED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.add(WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        
        entries.add(GLASS_SLAB);
        entries.add(GLASS_VERTICAL_SLAB);
        entries.add(GLASS_HORIZONTAL_PANE);
        entries.add(WHITE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(ORANGE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(MAGENTA_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(YELLOW_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(LIME_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(PINK_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(CYAN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(PURPLE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(BROWN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(GREEN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(RED_STAINED_GLASS_HORIZONTAL_PANE);
        entries.add(BLACK_STAINED_GLASS_HORIZONTAL_PANE);
        
        entries.addAfter(Blocks.OAK_PLANKS, OAK_SHELF);
        entries.addAfter(Blocks.SPRUCE_PLANKS, SPRUCE_SHELF);
        entries.addAfter(Blocks.BIRCH_PLANKS, BIRCH_SHELF);
        entries.addAfter(Blocks.JUNGLE_PLANKS, JUNGLE_SHELF);
        entries.addAfter(Blocks.ACACIA_PLANKS, ACACIA_SHELF);
        entries.addAfter(Blocks.DARK_OAK_PLANKS, DARK_OAK_SHELF);
        entries.addAfter(Blocks.MANGROVE_PLANKS, MANGROVE_SHELF);
        entries.addAfter(Blocks.CHERRY_PLANKS, CHERRY_SHELF);
        entries.addAfter(Blocks.CRIMSON_PLANKS, CRIMSON_SHELF);
        entries.addAfter(Blocks.WARPED_PLANKS, WARPED_SHELF);
    }

    private static void addBlockToNaturalBlockGroup(FabricItemGroupEntries entries) { 
        entries.addAfter(Blocks.OAK_LOG, OAK_LOG_SLAB);
        entries.addAfter(Blocks.SPRUCE_LOG, SPRUCE_LOG_SLAB);
        entries.addAfter(Blocks.BIRCH_LOG, BIRCH_LOG_SLAB);
        entries.addAfter(Blocks.JUNGLE_LOG, JUNGLE_LOG_SLAB);
        entries.addAfter(Blocks.ACACIA_LOG, ACACIA_LOG_SLAB);
        entries.addAfter(Blocks.DARK_OAK_LOG, DARK_OAK_LOG_SLAB);
        entries.addAfter(Blocks.MANGROVE_LOG, MANGROVE_LOG_SLAB);
        entries.addAfter(Blocks.CHERRY_LOG, CHERRY_LOG_SLAB);
        entries.addAfter(Blocks.CRIMSON_STEM, CRIMSON_STEM_SLAB);
        entries.addAfter(Blocks.WARPED_STEM, WARPED_STEM_SLAB);

        entries.addAfter(OAK_LOG_SLAB, OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(SPRUCE_LOG_SLAB, SPRUCE_LOG_VERTICAL_SLAB);
        entries.addAfter(BIRCH_LOG_SLAB, BIRCH_LOG_VERTICAL_SLAB);
        entries.addAfter(JUNGLE_LOG_SLAB, JUNGLE_LOG_VERTICAL_SLAB);
        entries.addAfter(ACACIA_LOG_SLAB, ACACIA_LOG_VERTICAL_SLAB);
        entries.addAfter(DARK_OAK_LOG_SLAB, DARK_OAK_LOG_VERTICAL_SLAB);
        entries.addAfter(MANGROVE_LOG_SLAB, MANGROVE_LOG_VERTICAL_SLAB);
        entries.addAfter(CHERRY_LOG_SLAB, CHERRY_LOG_VERTICAL_SLAB);
        entries.addAfter(CRIMSON_STEM_SLAB, CRIMSON_STEM_VERTICAL_SLAB);
        entries.addAfter(WARPED_STEM_SLAB, WARPED_STEM_VERTICAL_SLAB);
    }

    private static void addBlockToFunctionalBlockGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.OAK_PLANKS, OAK_SHELF);
        entries.addAfter(Blocks.SPRUCE_PLANKS, SPRUCE_SHELF);
        entries.addAfter(Blocks.BIRCH_PLANKS, BIRCH_SHELF);
        entries.addAfter(Blocks.JUNGLE_PLANKS, JUNGLE_SHELF);
        entries.addAfter(Blocks.ACACIA_PLANKS, ACACIA_SHELF);
        entries.addAfter(Blocks.DARK_OAK_PLANKS, DARK_OAK_SHELF);
        entries.addAfter(Blocks.MANGROVE_PLANKS, MANGROVE_SHELF);
        entries.addAfter(Blocks.CHERRY_PLANKS, CHERRY_SHELF);
        entries.addAfter(Blocks.CRIMSON_PLANKS, CRIMSON_SHELF);
        entries.addAfter(Blocks.WARPED_PLANKS, WARPED_SHELF);
    }
    
    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(ModBlocks::addBlockToBuildingBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBlockToColoredBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlockToNaturalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.VANPLUSPLUS).register(ModBlocks::addBlockToModBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addBlockToFunctionalBlockGroup);
    }
}
