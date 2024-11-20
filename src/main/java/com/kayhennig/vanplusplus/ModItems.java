package com.kayhennig.vanplusplus;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class ModItems {
    // FoodComponents
    public class ModFoodComponents {
        public static final FoodComponent PEAR = new FoodComponent.Builder().snack().nutrition(1).saturationModifier(0.3F).build();
    }

    // Food
    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponents.PEAR)));

    private static Item registerItem(String name, Item item) {
        Identifier itemId = Identifier.of(Vanillaplusplus.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemId, item);

        return registeredItem;
    }

    private static void addItemToGroup(FabricItemGroupEntries entries) {
        entries.add(PEAR);
    }

    private static void addItemToLootTable(RegistryKey<LootTable> table, LootTable.Builder builder,
            LootTableSource source, RegistryWrapper.WrapperLookup lookup) {
        if (source.isBuiltin() && (Blocks.OAK_LEAVES.getLootTableKey().equals(table) ||
                Blocks.SPRUCE_LEAVES.getLootTableKey().equals(table) ||
                Blocks.BIRCH_LEAVES.getLootTableKey().equals(table) ||
                Blocks.JUNGLE_LEAVES.getLootTableKey().equals(table) ||
                Blocks.ACACIA_LEAVES.getLootTableKey().equals(table) ||
                Blocks.DARK_OAK_LEAVES.getLootTableKey().equals(table) ||
                Blocks.MANGROVE_LEAVES.getLootTableKey().equals(table) ||
                Blocks.CHERRY_LEAVES.getLootTableKey().equals(table))) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .with(ItemEntry.builder(ModItems.PEAR).weight(1));

            builder.pool(poolBuilder);
        }
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToGroup);

        LootTableEvents.MODIFY.register(ModItems::addItemToLootTable);
    }
}
