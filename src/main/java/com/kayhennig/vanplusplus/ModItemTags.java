package com.kayhennig.vanplusplus;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ModItemTags {
    public static final TagKey<Item> HAMMERS = of("hammers");
    private ModItemTags() {
	}

    private static TagKey<Item> of(String id) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(Vanillaplusplus.MOD_ID, id));
	}
}
