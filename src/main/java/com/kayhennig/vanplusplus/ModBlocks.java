package com.kayhennig.vanplusplus;

import com.kayhennig.vanplusplus.block.*;
import com.kayhennig.vanplusplus.item.ModItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.Oxidizable.OxidationLevel;
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
    public static final Block TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).nonOpaque()));

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
    
    // Other Vertical Slabs

    public static final Block QUARTZ_VERTICAL_SLAB = registerBlock("quartz_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB)));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerBlock("smooth_quartz_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB)));

    public static final Block STONE_VERTICAL_SLAB = registerBlock("stone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock("cobblestone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB)));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlock("mossy_cobblestone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB)));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerBlock("smooth_stone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB)));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerBlock("stone_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerBlock("mossy_stone_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB)));
    public static final Block GRANITE_VERTICAL_SLAB = registerBlock("granite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerBlock("polished_granite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB)));
    public static final Block DIORITE_VERTICAL_SLAB = registerBlock("diorite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerBlock("polished_diorite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB)));
    public static final Block ANDESITE_VERTICAL_SLAB = registerBlock("andesite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB)));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerBlock("polished_andesite_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlock("cobbled_deepslate_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlock("polished_deepslate_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerBlock("deepslate_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerBlock("deepslate_tile_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB)));
    public static final Block TUFF_VERTICAL_SLAB = registerBlock("tuff_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_SLAB)));
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = registerBlock("polished_tuff_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB)));
    public static final Block TUFF_BRICK_VERTICAL_SLAB = registerBlock("tuff_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB)));
    public static final Block BRICK_VERTICAL_SLAB = registerBlock("brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Block MUD_BRICK_VERTICAL_SLAB = registerBlock("mud_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB)));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerBlock("sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB)));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerBlock("red_sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB)));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_red_sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_red_sandstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB)));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerBlock("prismarine_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB)));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerBlock("prismarine_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB)));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerBlock("dark_prismarine_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB)));
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerBlock("nether_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB)));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("red_nether_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerBlock("blackstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB)));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("polished_blackstone_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB)));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerBlock("polished_blackstone_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerBlock("end_stone_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block PURPUR_VERTICAL_SLAB = registerBlock("purpur_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB)));

    // Glass Vertical Slabs

    public static final Block GLASS_VERTICAL_SLAB = registerBlock("glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque()));
    public static final Block TINTED_GLASS_VERTICAL_SLAB = registerBlock("tinted_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).nonOpaque()));
    public static final Block WHITE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("white_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()));
    public static final Block ORANGE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("orange_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).nonOpaque()));
    public static final Block MAGENTA_STAINED_GLASS_VERTICAL_SLAB = registerBlock("magenta_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("light_blue_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block YELLOW_STAINED_GLASS_VERTICAL_SLAB = registerBlock("yellow_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).nonOpaque()));
    public static final Block LIME_STAINED_GLASS_VERTICAL_SLAB = registerBlock("lime_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).nonOpaque()));
    public static final Block PINK_STAINED_GLASS_VERTICAL_SLAB = registerBlock("pink_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).nonOpaque()));
    public static final Block GRAY_STAINED_GLASS_VERTICAL_SLAB = registerBlock("gray_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB = registerBlock("light_gray_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).nonOpaque()));
    public static final Block CYAN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("cyan_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).nonOpaque()));
    public static final Block PURPLE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("purple_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).nonOpaque()));
    public static final Block BLUE_STAINED_GLASS_VERTICAL_SLAB = registerBlock("blue_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).nonOpaque()));
    public static final Block BROWN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("brown_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).nonOpaque()));
    public static final Block GREEN_STAINED_GLASS_VERTICAL_SLAB = registerBlock("green_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).nonOpaque()));
    public static final Block RED_STAINED_GLASS_VERTICAL_SLAB = registerBlock("red_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).nonOpaque()));
    public static final Block BLACK_STAINED_GLASS_VERTICAL_SLAB = registerBlock("black_stained_glass_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).nonOpaque()));

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

    // Pressure Plates

    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block STONE_BRICK_PRESSURE_PLATE = registerBlock("stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block MOSSY_STONE_BRICK_PRESSURE_PLATE = registerBlock("mossy_stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("deepslate_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block BRICK_PRESSURE_PLATE = registerBlock("brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block MUD_BRICK_PRESSURE_PLATE = registerBlock("mud_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block NETHER_BRICK_PRESSURE_PLATE = registerBlock("nether_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block RED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("red_nether_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));

    // Copper Rails

    public static final Block COPPER_RAIL = registerBlock("copper_rail", new OxidizableCopperRailBlock(OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_RAIL = registerBlock("exposed_copper_rail", new OxidizableCopperRailBlock(OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_RAIL = registerBlock("weathered_copper_rail", new OxidizableCopperRailBlock(OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_RAIL = registerBlock("oxidized_copper_rail", new OxidizableCopperRailBlock(OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    
    // Copper Powered Rails

    public static final Block COPPER_POWERED_RAIL = registerBlock("copper_powered_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_POWERED_RAIL = registerBlock("exposed_copper_powered_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_POWERED_RAIL = registerBlock("weathered_copper_powered_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_POWERED_RAIL = registerBlock("oxidized_copper_powered_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));

    // Copper Activator Rails

    public static final Block COPPER_ACTIVATOR_RAIL = registerBlock("copper_activator_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_ACTIVATOR_RAIL = registerBlock("exposed_copper_activator_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_ACTIVATOR_RAIL = registerBlock("weathered_copper_activator_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_ACTIVATOR_RAIL = registerBlock("oxidized_copper_activator_rail", new OxidizableCopperPoweredRailBlock(OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    
    // Copper Detector Rails

    public static final Block COPPER_DETECTOR_RAIL = registerBlock("copper_detector_rail", new OxidizableCopperDetectorRailBlock(OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_DETECTOR_RAIL = registerBlock("exposed_copper_detector_rail", new OxidizableCopperDetectorRailBlock(OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_DETECTOR_RAIL = registerBlock("weathered_copper_detector_rail", new OxidizableCopperDetectorRailBlock(OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_DETECTOR_RAIL = registerBlock("oxidized_copper_detector_rail", new OxidizableCopperDetectorRailBlock(OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));

    // Waxed Copper Rails

    public static final Block WAXED_COPPER_RAIL = registerBlock("waxed_copper_rail", new RailBlock(AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_RAIL = registerBlock("waxed_exposed_copper_rail", new RailBlock(AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_RAIL = registerBlock("waxed_weathered_copper_rail", new RailBlock(AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_RAIL = registerBlock("waxed_oxidized_copper_rail", new RailBlock(AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));

    // Waxed Copper Powered Rails

    public static final Block WAXED_COPPER_POWERED_RAIL = registerBlock("waxed_copper_powered_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_POWERED_RAIL = registerBlock("waxed_exposed_copper_powered_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_POWERED_RAIL = registerBlock("waxed_weathered_copper_powered_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_POWERED_RAIL = registerBlock("waxed_oxidized_copper_powered_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL).sounds(BlockSoundGroup.COPPER)));

    // Waxed Copper Activator Rails

    public static final Block WAXED_COPPER_ACTIVATOR_RAIL = registerBlock("waxed_copper_activator_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_ACTIVATOR_RAIL = registerBlock("waxed_exposed_copper_activator_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_ACTIVATOR_RAIL = registerBlock("waxed_weathered_copper_activator_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_ACTIVATOR_RAIL = registerBlock("waxed_oxidized_copper_activator_rail", new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.ACTIVATOR_RAIL).sounds(BlockSoundGroup.COPPER)));

    // Waxed Copper Detector Rails

    public static final Block WAXED_COPPER_DETECTOR_RAIL = registerBlock("waxed_copper_detector_rail", new DetectorRailBlock(AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_DETECTOR_RAIL = registerBlock("waxed_exposed_copper_detector_rail", new DetectorRailBlock(AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_DETECTOR_RAIL = registerBlock("waxed_weathered_copper_detector_rail", new DetectorRailBlock(AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_DETECTOR_RAIL = registerBlock("waxed_oxidized_copper_detector_rail", new DetectorRailBlock(AbstractBlock.Settings.copy(Blocks.DETECTOR_RAIL).sounds(BlockSoundGroup.COPPER)));

    

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
        entries.addAfter(Blocks.IRON_BLOCK, IRON_SLAB);
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

        entries.addAfter(Blocks.STONE_SLAB, STONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.COBBLESTONE_SLAB, COBBLESTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.MOSSY_COBBLESTONE_SLAB, MOSSY_COBBLESTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.SMOOTH_STONE_SLAB, SMOOTH_STONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.STONE_BRICK_SLAB, STONE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.MOSSY_STONE_BRICK_SLAB, MOSSY_STONE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.GRANITE_SLAB, GRANITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_GRANITE_SLAB, POLISHED_GRANITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.DIORITE_SLAB, DIORITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_DIORITE_SLAB, POLISHED_DIORITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.ANDESITE_SLAB, ANDESITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB, POLISHED_ANDESITE_VERTICAL_SLAB);
        entries.addAfter(Blocks.COBBLED_DEEPSLATE_SLAB, COBBLED_DEEPSLATE_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_DEEPSLATE_SLAB, POLISHED_DEEPSLATE_VERTICAL_SLAB);
        entries.addAfter(Blocks.DEEPSLATE_BRICK_SLAB, DEEPSLATE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.DEEPSLATE_TILE_SLAB, DEEPSLATE_TILE_VERTICAL_SLAB);
        entries.addAfter(Blocks.TUFF_SLAB, TUFF_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_TUFF_SLAB, POLISHED_TUFF_VERTICAL_SLAB);
        entries.addAfter(Blocks.TUFF_BRICK_SLAB, TUFF_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.BRICK_SLAB, BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.MUD_BRICK_SLAB, MUD_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.SANDSTONE_SLAB, SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.SMOOTH_SANDSTONE_SLAB, SMOOTH_SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.CUT_SANDSTONE_SLAB, CUT_SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.RED_SANDSTONE_SLAB, RED_SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.CUT_RED_SANDSTONE_SLAB, CUT_RED_SANDSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.PRISMARINE_SLAB, PRISMARINE_VERTICAL_SLAB);
        entries.addAfter(Blocks.PRISMARINE_BRICK_SLAB, PRISMARINE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.DARK_PRISMARINE_SLAB, DARK_PRISMARINE_VERTICAL_SLAB);
        entries.addAfter(Blocks.NETHER_BRICK_SLAB, NETHER_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.RED_NETHER_BRICK_SLAB, RED_NETHER_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.BLACKSTONE_SLAB, BLACKSTONE_VERTICAL_SLAB);
        entries.addAfter(Blocks.POLISHED_BLACKSTONE_SLAB, POLISHED_BLACKSTONE_VERTICAL_SLAB);   
        entries.addAfter(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.END_STONE_BRICK_SLAB, END_STONE_BRICK_VERTICAL_SLAB);
        entries.addAfter(Blocks.PURPUR_SLAB, PURPUR_VERTICAL_SLAB);


        entries.addAfter(Blocks.CUT_COPPER_SLAB, CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.EXPOSED_CUT_COPPER_SLAB, EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WEATHERED_CUT_COPPER_SLAB, WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_CUT_COPPER_SLAB, WAXED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        entries.addAfter(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        entries.addAfter(Blocks.QUARTZ_SLAB, QUARTZ_VERTICAL_SLAB);
        entries.addAfter(Blocks.SMOOTH_QUARTZ_SLAB, SMOOTH_QUARTZ_VERTICAL_SLAB);

        entries.addAfter(ModBlocks.COBBLESTONE_VERTICAL_SLAB, COBBLESTONE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, MOSSY_COBBLESTONE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, SMOOTH_STONE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.STONE_BRICK_VERTICAL_SLAB, STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, MOSSY_STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, POLISHED_DEEPSLATE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, DEEPSLATE_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.BRICK_VERTICAL_SLAB, BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.MUD_BRICK_VERTICAL_SLAB, MUD_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.SANDSTONE_VERTICAL_SLAB, SANDSTONE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, RED_SANDSTONE_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, NETHER_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, RED_NETHER_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, END_STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.QUARTZ_VERTICAL_SLAB, QUARTZ_PRESSURE_PLATE);
    }

    private static void addBlockToColoredBlockGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.GLASS, GLASS_SLAB);
        entries.addAfter(GLASS_SLAB, GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.TINTED_GLASS, TINTED_GLASS_SLAB);
        entries.addAfter(TINTED_GLASS_SLAB, TINTED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.WHITE_STAINED_GLASS, WHITE_STAINED_GLASS_SLAB);
        entries.addAfter(WHITE_STAINED_GLASS_SLAB, WHITE_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.LIGHT_GRAY_STAINED_GLASS, LIGHT_GRAY_STAINED_GLASS_SLAB);
        entries.addAfter(LIGHT_GRAY_STAINED_GLASS_SLAB, LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.GRAY_STAINED_GLASS, GRAY_STAINED_GLASS_SLAB);
        entries.addAfter(GRAY_STAINED_GLASS_SLAB, GRAY_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.BLACK_STAINED_GLASS, BLACK_STAINED_GLASS_SLAB);
        entries.addAfter(BLACK_STAINED_GLASS_SLAB, BLACK_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.BROWN_STAINED_GLASS, BROWN_STAINED_GLASS_SLAB);
        entries.addAfter(BROWN_STAINED_GLASS_SLAB, BROWN_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.RED_STAINED_GLASS, RED_STAINED_GLASS_SLAB);
        entries.addAfter(RED_STAINED_GLASS_SLAB, RED_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.ORANGE_STAINED_GLASS, ORANGE_STAINED_GLASS_SLAB);
        entries.addAfter(ORANGE_STAINED_GLASS_SLAB, ORANGE_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.YELLOW_STAINED_GLASS, YELLOW_STAINED_GLASS_SLAB);
        entries.addAfter(YELLOW_STAINED_GLASS_SLAB, YELLOW_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.LIME_STAINED_GLASS, LIME_STAINED_GLASS_SLAB);
        entries.addAfter(LIME_STAINED_GLASS_SLAB, LIME_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.GREEN_STAINED_GLASS, GREEN_STAINED_GLASS_SLAB);
        entries.addAfter(GREEN_STAINED_GLASS_SLAB, GREEN_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.CYAN_STAINED_GLASS, CYAN_STAINED_GLASS_SLAB);
        entries.addAfter(CYAN_STAINED_GLASS_SLAB, CYAN_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.LIGHT_BLUE_STAINED_GLASS, LIGHT_BLUE_STAINED_GLASS_SLAB);
        entries.addAfter(LIGHT_BLUE_STAINED_GLASS_SLAB, LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.BLUE_STAINED_GLASS, BLUE_STAINED_GLASS_SLAB);
        entries.addAfter(BLUE_STAINED_GLASS_SLAB, BLUE_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.PURPLE_STAINED_GLASS, PURPLE_STAINED_GLASS_SLAB);
        entries.addAfter(PURPLE_STAINED_GLASS_SLAB, PURPLE_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.MAGENTA_STAINED_GLASS, MAGENTA_STAINED_GLASS_SLAB);
        entries.addAfter(MAGENTA_STAINED_GLASS_SLAB, MAGENTA_STAINED_GLASS_VERTICAL_SLAB);
        entries.addAfter(Blocks.PINK_STAINED_GLASS, PINK_STAINED_GLASS_SLAB);
        entries.addAfter(PINK_STAINED_GLASS_SLAB, PINK_STAINED_GLASS_VERTICAL_SLAB);

        entries.addAfter(Blocks.PINK_STAINED_GLASS_PANE, GLASS_HORIZONTAL_PANE);
        entries.addAfter(GLASS_HORIZONTAL_PANE, WHITE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(WHITE_STAINED_GLASS_HORIZONTAL_PANE, LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIGHT_GRAY_STAINED_GLASS_HORIZONTAL_PANE, GRAY_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(GRAY_STAINED_GLASS_HORIZONTAL_PANE, BLACK_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(BLACK_STAINED_GLASS_HORIZONTAL_PANE, BROWN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(BROWN_STAINED_GLASS_HORIZONTAL_PANE, RED_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(RED_STAINED_GLASS_HORIZONTAL_PANE, ORANGE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(ORANGE_STAINED_GLASS_HORIZONTAL_PANE, YELLOW_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(YELLOW_STAINED_GLASS_HORIZONTAL_PANE, LIME_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIME_STAINED_GLASS_HORIZONTAL_PANE, GREEN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(GREEN_STAINED_GLASS_HORIZONTAL_PANE, CYAN_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(CYAN_STAINED_GLASS_HORIZONTAL_PANE, LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(LIGHT_BLUE_STAINED_GLASS_HORIZONTAL_PANE, BLUE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(BLUE_STAINED_GLASS_HORIZONTAL_PANE, PURPLE_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(PURPLE_STAINED_GLASS_HORIZONTAL_PANE, MAGENTA_STAINED_GLASS_HORIZONTAL_PANE);
        entries.addAfter(MAGENTA_STAINED_GLASS_HORIZONTAL_PANE, PINK_STAINED_GLASS_HORIZONTAL_PANE);
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

        entries.add(QUARTZ_VERTICAL_SLAB);
        entries.add(SMOOTH_QUARTZ_VERTICAL_SLAB);

        entries.add(STONE_VERTICAL_SLAB);
        entries.add(COBBLESTONE_VERTICAL_SLAB);
        entries.add(MOSSY_COBBLESTONE_VERTICAL_SLAB);
        entries.add(SMOOTH_STONE_VERTICAL_SLAB);
        entries.add(STONE_BRICK_VERTICAL_SLAB);
        entries.add(MOSSY_STONE_BRICK_VERTICAL_SLAB);
        entries.add(GRANITE_VERTICAL_SLAB);
        entries.add(POLISHED_GRANITE_VERTICAL_SLAB);
        entries.add(DIORITE_VERTICAL_SLAB);
        entries.add(POLISHED_DIORITE_VERTICAL_SLAB);
        entries.add(ANDESITE_VERTICAL_SLAB);
        entries.add(POLISHED_ANDESITE_VERTICAL_SLAB);
        entries.add(COBBLED_DEEPSLATE_VERTICAL_SLAB);
        entries.add(POLISHED_DEEPSLATE_VERTICAL_SLAB);
        entries.add(DEEPSLATE_BRICK_VERTICAL_SLAB);
        entries.add(DEEPSLATE_TILE_VERTICAL_SLAB);
        entries.add(TUFF_VERTICAL_SLAB);
        entries.add(POLISHED_TUFF_VERTICAL_SLAB);
        entries.add(TUFF_BRICK_VERTICAL_SLAB);
        entries.add(BRICK_VERTICAL_SLAB);
        entries.add(MUD_BRICK_VERTICAL_SLAB);
        entries.add(SANDSTONE_VERTICAL_SLAB);
        entries.add(SMOOTH_SANDSTONE_VERTICAL_SLAB);
        entries.add(CUT_SANDSTONE_VERTICAL_SLAB);
        entries.add(RED_SANDSTONE_VERTICAL_SLAB);
        entries.add(SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        entries.add(CUT_RED_SANDSTONE_VERTICAL_SLAB);
        entries.add(PRISMARINE_VERTICAL_SLAB);
        entries.add(PRISMARINE_BRICK_VERTICAL_SLAB);
        entries.add(DARK_PRISMARINE_VERTICAL_SLAB);
        entries.add(NETHER_BRICK_VERTICAL_SLAB);
        entries.add(RED_NETHER_BRICK_VERTICAL_SLAB);
        entries.add(BLACKSTONE_VERTICAL_SLAB);
        entries.add(POLISHED_BLACKSTONE_VERTICAL_SLAB);
        entries.add(POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        entries.add(END_STONE_BRICK_VERTICAL_SLAB);
        entries.add(PURPUR_VERTICAL_SLAB);
        
        entries.add(GLASS_SLAB);
        entries.add(GLASS_VERTICAL_SLAB);
        entries.add(TINTED_GLASS_SLAB);
        entries.add(TINTED_GLASS_VERTICAL_SLAB);
        entries.add(WHITE_STAINED_GLASS_SLAB);
        entries.add(WHITE_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(LIGHT_GRAY_STAINED_GLASS_SLAB);
        entries.add(LIGHT_GRAY_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(GRAY_STAINED_GLASS_SLAB);
        entries.add(GRAY_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(BLACK_STAINED_GLASS_SLAB);
        entries.add(BLACK_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(BROWN_STAINED_GLASS_SLAB);
        entries.add(BROWN_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(RED_STAINED_GLASS_SLAB);
        entries.add(RED_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(ORANGE_STAINED_GLASS_SLAB);
        entries.add(ORANGE_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(YELLOW_STAINED_GLASS_SLAB);
        entries.add(YELLOW_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(LIME_STAINED_GLASS_SLAB);
        entries.add(LIME_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(GREEN_STAINED_GLASS_SLAB);
        entries.add(GREEN_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(CYAN_STAINED_GLASS_SLAB);
        entries.add(CYAN_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(LIGHT_BLUE_STAINED_GLASS_SLAB);
        entries.add(LIGHT_BLUE_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(BLUE_STAINED_GLASS_SLAB);
        entries.add(BLUE_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(PURPLE_STAINED_GLASS_SLAB);
        entries.add(PURPLE_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(MAGENTA_STAINED_GLASS_SLAB);
        entries.add(MAGENTA_STAINED_GLASS_VERTICAL_SLAB);
        entries.add(PINK_STAINED_GLASS_SLAB);
        entries.add(PINK_STAINED_GLASS_VERTICAL_SLAB);
        
        entries.add(OAK_SHELF);
        entries.add(SPRUCE_SHELF);
        entries.add(BIRCH_SHELF);
        entries.add(JUNGLE_SHELF);
        entries.add(ACACIA_SHELF);
        entries.add(DARK_OAK_SHELF);
        entries.add(MANGROVE_SHELF);
        entries.add(CHERRY_SHELF);
        entries.add(CRIMSON_SHELF);
        entries.add(WARPED_SHELF);

        entries.add(COBBLESTONE_PRESSURE_PLATE);
        entries.add(MOSSY_COBBLESTONE_PRESSURE_PLATE);
        entries.add(SMOOTH_STONE_PRESSURE_PLATE);
        entries.add(STONE_BRICK_PRESSURE_PLATE);
        entries.add(MOSSY_STONE_BRICK_PRESSURE_PLATE);
        entries.add(POLISHED_DEEPSLATE_PRESSURE_PLATE);
        entries.add(DEEPSLATE_BRICK_PRESSURE_PLATE);
        entries.add(BRICK_PRESSURE_PLATE);
        entries.add(MUD_BRICK_PRESSURE_PLATE);
        entries.add(SANDSTONE_PRESSURE_PLATE);
        entries.add(RED_SANDSTONE_PRESSURE_PLATE);
        entries.add(NETHER_BRICK_PRESSURE_PLATE);
        entries.add(RED_NETHER_BRICK_PRESSURE_PLATE);
        entries.add(END_STONE_BRICK_PRESSURE_PLATE);
        entries.add(QUARTZ_PRESSURE_PLATE);
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

    private static void addBlockToRedstoneBlockGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, COBBLESTONE_PRESSURE_PLATE);
        entries.addAfter(COBBLESTONE_PRESSURE_PLATE, MOSSY_COBBLESTONE_PRESSURE_PLATE);
        entries.addAfter(MOSSY_COBBLESTONE_PRESSURE_PLATE, SMOOTH_STONE_PRESSURE_PLATE);
        entries.addAfter(SMOOTH_STONE_PRESSURE_PLATE, STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(STONE_BRICK_PRESSURE_PLATE, MOSSY_STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(MOSSY_STONE_BRICK_PRESSURE_PLATE, POLISHED_DEEPSLATE_PRESSURE_PLATE);
        entries.addAfter(POLISHED_DEEPSLATE_PRESSURE_PLATE, DEEPSLATE_BRICK_PRESSURE_PLATE);
        entries.addAfter(DEEPSLATE_BRICK_PRESSURE_PLATE, BRICK_PRESSURE_PLATE);
        entries.addAfter(BRICK_PRESSURE_PLATE, MUD_BRICK_PRESSURE_PLATE);
        entries.addAfter(MUD_BRICK_PRESSURE_PLATE, SANDSTONE_PRESSURE_PLATE);
        entries.addAfter(SANDSTONE_PRESSURE_PLATE, RED_SANDSTONE_PRESSURE_PLATE);
        entries.addAfter(RED_SANDSTONE_PRESSURE_PLATE, NETHER_BRICK_PRESSURE_PLATE);
        entries.addAfter(NETHER_BRICK_PRESSURE_PLATE, RED_NETHER_BRICK_PRESSURE_PLATE);
        entries.addAfter(RED_NETHER_BRICK_PRESSURE_PLATE, END_STONE_BRICK_PRESSURE_PLATE);
        entries.addAfter(END_STONE_BRICK_PRESSURE_PLATE, QUARTZ_PRESSURE_PLATE);

        entries.addAfter(Blocks.ACTIVATOR_RAIL, COPPER_RAIL);
        entries.addAfter(COPPER_RAIL, COPPER_POWERED_RAIL);
        entries.addAfter(COPPER_POWERED_RAIL, COPPER_DETECTOR_RAIL);
        entries.addAfter(COPPER_DETECTOR_RAIL, COPPER_ACTIVATOR_RAIL);

        entries.addAfter(COPPER_ACTIVATOR_RAIL, EXPOSED_COPPER_RAIL);
        entries.addAfter(EXPOSED_COPPER_RAIL, EXPOSED_COPPER_POWERED_RAIL);
        entries.addAfter(EXPOSED_COPPER_POWERED_RAIL, EXPOSED_COPPER_DETECTOR_RAIL);
        entries.addAfter(EXPOSED_COPPER_DETECTOR_RAIL, EXPOSED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(EXPOSED_COPPER_ACTIVATOR_RAIL, WEATHERED_COPPER_RAIL);
        entries.addAfter(WEATHERED_COPPER_RAIL, WEATHERED_COPPER_POWERED_RAIL);
        entries.addAfter(WEATHERED_COPPER_POWERED_RAIL, WEATHERED_COPPER_DETECTOR_RAIL);
        entries.addAfter(WEATHERED_COPPER_DETECTOR_RAIL, WEATHERED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(WEATHERED_COPPER_ACTIVATOR_RAIL, OXIDIZED_COPPER_RAIL);
        entries.addAfter(OXIDIZED_COPPER_RAIL, OXIDIZED_COPPER_POWERED_RAIL);
        entries.addAfter(OXIDIZED_COPPER_POWERED_RAIL, OXIDIZED_COPPER_DETECTOR_RAIL);
        entries.addAfter(OXIDIZED_COPPER_DETECTOR_RAIL, OXIDIZED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(OXIDIZED_COPPER_ACTIVATOR_RAIL, WAXED_COPPER_RAIL);
        entries.addAfter(WAXED_COPPER_RAIL, WAXED_COPPER_POWERED_RAIL);
        entries.addAfter(WAXED_COPPER_POWERED_RAIL, WAXED_COPPER_DETECTOR_RAIL);
        entries.addAfter(WAXED_COPPER_DETECTOR_RAIL, WAXED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(WAXED_COPPER_ACTIVATOR_RAIL, WAXED_EXPOSED_COPPER_RAIL);
        entries.addAfter(WAXED_EXPOSED_COPPER_RAIL, WAXED_EXPOSED_COPPER_POWERED_RAIL);
        entries.addAfter(WAXED_EXPOSED_COPPER_POWERED_RAIL, WAXED_EXPOSED_COPPER_DETECTOR_RAIL);
        entries.addAfter(WAXED_EXPOSED_COPPER_DETECTOR_RAIL, WAXED_EXPOSED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(WAXED_EXPOSED_COPPER_ACTIVATOR_RAIL, WAXED_WEATHERED_COPPER_RAIL);
        entries.addAfter(WAXED_WEATHERED_COPPER_RAIL, WAXED_WEATHERED_COPPER_POWERED_RAIL);
        entries.addAfter(WAXED_WEATHERED_COPPER_POWERED_RAIL, WAXED_WEATHERED_COPPER_DETECTOR_RAIL);
        entries.addAfter(WAXED_WEATHERED_COPPER_DETECTOR_RAIL, WAXED_WEATHERED_COPPER_ACTIVATOR_RAIL);

        entries.addAfter(WAXED_WEATHERED_COPPER_ACTIVATOR_RAIL, WAXED_OXIDIZED_COPPER_RAIL);
        entries.addAfter(WAXED_OXIDIZED_COPPER_RAIL, WAXED_OXIDIZED_COPPER_POWERED_RAIL);
        entries.addAfter(WAXED_OXIDIZED_COPPER_POWERED_RAIL, WAXED_OXIDIZED_COPPER_DETECTOR_RAIL);
        entries.addAfter(WAXED_OXIDIZED_COPPER_DETECTOR_RAIL, WAXED_OXIDIZED_COPPER_ACTIVATOR_RAIL);
    }
    
    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(ModBlocks::addBlockToBuildingBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBlockToColoredBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlockToNaturalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.VANPLUSPLUS).register(ModBlocks::addBlockToModBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addBlockToFunctionalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModBlocks::addBlockToRedstoneBlockGroup);
    }
}
