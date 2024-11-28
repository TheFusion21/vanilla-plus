package com.kayhennig.vanplusplus;
import com.kayhennig.vanplusplus.component.ModDataComponentTypes;
import com.kayhennig.vanplusplus.item.DaggerItem;
import com.kayhennig.vanplusplus.item.DynamiteItem;
import com.kayhennig.vanplusplus.item.HammerItem;
import com.kayhennig.vanplusplus.item.ModItemGroups;
import com.kayhennig.vanplusplus.item.SpearItem;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DYNAMITE = registerItem("dynamite", new DynamiteItem(new Item.Settings().maxCount(16).component(ModDataComponentTypes.FUSE_TIME, (byte) 1)));

    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger", new DaggerItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.WOOD, 2, -1.8F))));
    public static final Item STONE_DAGGER = registerItem("stone_dagger", new DaggerItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.STONE, 2, -1.8F))));
    public static final Item IRON_DAGGER = registerItem("iron_dagger", new DaggerItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.IRON, 2, -1.8F))));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger", new DaggerItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.GOLD, 2, -1.8F))));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger", new DaggerItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -1.8F))));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger", new DaggerItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(DaggerItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -1.8F))));

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer", new HammerItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.WOOD, 5, -2.8F))));
    public static final Item STONE_HAMMER = registerItem("stone_hammer", new HammerItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.STONE, 5, -2.9F))));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.IRON, 5, -3.0F))));
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer", new HammerItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -3.0F))));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -3.0F))));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer", new HammerItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -3.0F))));

    public static final Item WOODEN_SPEAR = registerItem("wooden_spear", new SpearItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.WOOD, 6, -2.4F))));
    public static final Item STONE_SPEAR = registerItem("stone_spear", new SpearItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.STONE, 6, -2.4F))));
    public static final Item IRON_SPEAR = registerItem("iron_spear", new SpearItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.IRON, 6, -2.4F))));
    public static final Item GOLDEN_SPEAR = registerItem("golden_spear", new SpearItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.GOLD, 6, -2.4F))));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear", new SpearItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.DIAMOND, 6, -2.4F))));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear", new SpearItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -2.4F))));

    private static Item registerItem(String name, Item item) {
        Identifier itemId = Identifier.of(Vanillaplusplus.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemId, item);

        return registeredItem;
    }

    private static void addItemsToModGroup(FabricItemGroupEntries entries) {
        addDynamites(entries);
        entries.add(WOODEN_DAGGER);
        entries.add(STONE_DAGGER);
        entries.add(IRON_DAGGER);
        entries.add(GOLDEN_DAGGER);
        entries.add(DIAMOND_DAGGER);
        entries.add(NETHERITE_DAGGER);

        entries.add(WOODEN_HAMMER);
        entries.add(STONE_HAMMER);
        entries.add(IRON_HAMMER);
        entries.add(GOLDEN_HAMMER);
        entries.add(DIAMOND_HAMMER);
        entries.add(NETHERITE_HAMMER);
        
    }

    private static void addItemsToCombatGroup(FabricItemGroupEntries entries) {
        addDynamites(entries);

        entries.addAfter(Items.NETHERITE_SWORD, WOODEN_DAGGER);
        entries.addAfter(WOODEN_DAGGER, STONE_DAGGER);
        entries.addAfter(STONE_DAGGER, IRON_DAGGER);
        entries.addAfter(IRON_DAGGER, GOLDEN_DAGGER);
        entries.addAfter(GOLDEN_DAGGER, DIAMOND_DAGGER);
        entries.addAfter(DIAMOND_DAGGER, NETHERITE_DAGGER);

        entries.addAfter(NETHERITE_DAGGER, WOODEN_HAMMER);
        entries.addAfter(WOODEN_HAMMER, STONE_HAMMER);
        entries.addAfter(STONE_HAMMER, IRON_HAMMER);
        entries.addAfter(IRON_HAMMER, GOLDEN_HAMMER);
        entries.addAfter(GOLDEN_HAMMER, DIAMOND_HAMMER);
        entries.addAfter(DIAMOND_HAMMER, NETHERITE_HAMMER);

        entries.addAfter(NETHERITE_HAMMER, WOODEN_SPEAR);
        entries.addAfter(WOODEN_SPEAR, STONE_SPEAR);
        entries.addAfter(STONE_SPEAR, IRON_SPEAR);
        entries.addAfter(IRON_SPEAR, GOLDEN_SPEAR);
        entries.addAfter(GOLDEN_SPEAR, DIAMOND_SPEAR);
        entries.addAfter(DIAMOND_SPEAR, NETHERITE_SPEAR);
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
