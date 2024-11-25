package com.kayhennig.vanplusplus;
import com.kayhennig.vanplusplus.component.ModDataComponentTypes;
import com.kayhennig.vanplusplus.item.DynamiteItem;
import com.kayhennig.vanplusplus.item.ModItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DYNAMITE = registerItem("dynamite", new DynamiteItem(new Item.Settings().maxCount(16).component(ModDataComponentTypes.FUSE_TIME, (byte) 1)));

    private static Item registerItem(String name, Item item) {
        Identifier itemId = Identifier.of(Vanillaplusplus.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemId, item);

        return registeredItem;
    }

    private static void addItemsToModGroup(FabricItemGroupEntries entries) {
        addDynamites(entries);
    }

    private static void addItemsToCombatGroup(FabricItemGroupEntries entries) {
        addDynamites(entries);
    }

    private static void addDynamites(FabricItemGroupEntries entries) {
        for (byte b : DynamiteItem.FUSE_TIMES) {
            ItemStack itemStack = new ItemStack(DYNAMITE);
            itemStack.set(ModDataComponentTypes.FUSE_TIME, b);
            entries.add(itemStack);
        }
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.VANPLUSPLUS).register(ModItems::addItemsToModGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatGroup);
    }
}
