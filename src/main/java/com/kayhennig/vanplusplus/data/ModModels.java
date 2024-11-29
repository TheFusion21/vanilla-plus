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

    public static final Model HORIZONTAL_PANE = block("horizontal_pane", TextureKey.PANE, TextureKey.EDGE);

    public static final Model SHELF_NORTH = block("shelf_north", TextureKey.ALL);
    public static final Model SHELF_SOUTH = block("shelf_south", "_south", TextureKey.ALL);
    public static final Model SHELF_EAST = block("shelf_east", "_east", TextureKey.ALL);
    public static final Model SHELF_WEST = block("shelf_west", "_west", TextureKey.ALL);

    public static final Model SPEAR = item("spear", TextureKey.LAYER0);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
	}

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
	}

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model item(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Vanillaplusplus.MOD_ID, "item/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
