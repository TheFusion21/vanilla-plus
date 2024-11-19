package com.kayhennig.vanplusplus.data;

import java.util.Optional;

import com.kayhennig.vanplusplus.Vanillaplusplus;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

public class ModModels {
    public static final Model NORTH_SLAB = block("vertical_slab_north", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model SOUTH_SLAB = block("vertical_slab_south", "_south", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model EAST_SLAB = block("vertical_slab_east", "_east", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model WEST_SLAB = block("vertical_slab_west", "_west", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model DOUBLE_NORTH_SLAB = block("vertical_slab_double_north", "_double_north", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model DOUBLE_EAST_SLAB = block("vertical_slab_double_east", "_double_east", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
	}

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
	}
}
