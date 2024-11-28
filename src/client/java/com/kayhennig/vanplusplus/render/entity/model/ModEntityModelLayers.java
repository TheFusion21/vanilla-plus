package com.kayhennig.vanplusplus.render.entity.model;

import com.kayhennig.vanplusplus.Vanillaplusplus;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.mixin.client.rendering.EntityModelLayersAccessor;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModEntityModelLayers {
    public static final EntityModelLayer SPEAR = registerMain("spear");

    private static EntityModelLayer registerMain(String id) {
		return register(id, "main");
	}

	private static EntityModelLayer register(String id, String layer) {
		EntityModelLayer entityModelLayer = create(id, layer);
		if (!EntityModelLayersAccessor.getLayers().add(entityModelLayer)) {
			throw new IllegalStateException("Duplicate registration for " + entityModelLayer);
		} else {
			return entityModelLayer;
		}
	}

    private static EntityModelLayer create(String id, String layer) {
		return new EntityModelLayer(Identifier.of(Vanillaplusplus.MOD_ID, id), layer);
	}

    public static void initialize() {
        
    }
}
