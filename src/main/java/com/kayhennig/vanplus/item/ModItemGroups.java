package com.kayhennig.vanplus.item;

import com.kayhennig.vanplus.ModBlocks;
import com.kayhennig.vanplus.Vanillaplus;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> VANPLUS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Vanillaplus.MOD_ID, "vanplus"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModBlocks.DIAMOND_SLAB))
		.displayName(Text.translatable("itemGroup." + Vanillaplus.MOD_ID + ".vanplus"))
		.build();

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, VANPLUS, CUSTOM_ITEM_GROUP);
    }
}
