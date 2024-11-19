package com.kayhennig.vanplus;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ModBlockTags {
    public static final TagKey<Block> VERTICAL_WOODEN_SLABS = of("vertical_wooden_slabs");
    public static final TagKey<Block> GLASS_SLABS = of("glass_slabs");

    private ModBlockTags() {
	}
    private static TagKey<Block> of(String id) {
		return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Vanillaplus.MOD_ID, id));
	}
}
