package com.kayhennig.vanplusplus;

import com.kayhennig.vanplusplus.item.ModItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // FoodComponents
    public class ModFoodComponents {
        public static final FoodComponent CHERRIES = new FoodComponent.Builder().snack().nutrition(1).saturationModifier(0.5F).build();
        public static final FoodComponent GRAPES = new FoodComponent.Builder().snack().nutrition(1).saturationModifier(0.5F).build();
    }
    
    public static final Item CHERRIES = registerItem("cherries", new Item(new Item.Settings().food(ModFoodComponents.CHERRIES)));
    public static final Item GRAPES = registerItem("grapes", new Item(new Item.Settings().food(ModFoodComponents.GRAPES)));

    private static Item registerItem(String name, Item item) {
        Identifier itemId = Identifier.of(Vanillaplusplus.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemId, item);

        return registeredItem;
    }

    public static void addItemToGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Items.PUMPKIN_PIE, CHERRIES);
        entries.addAfter(CHERRIES, GRAPES);
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToGroup);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.VANPLUSPLUS).register(ModItems::addItemToGroup);
    }
}
