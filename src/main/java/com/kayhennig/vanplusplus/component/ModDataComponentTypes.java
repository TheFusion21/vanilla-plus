package com.kayhennig.vanplusplus.component;

import java.util.function.UnaryOperator;

import com.kayhennig.vanplusplus.Vanillaplusplus;
import com.mojang.serialization.Codec;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModDataComponentTypes {
    public static final ComponentType<Byte> FUSE_TIME = register(
        "dynamite", builder -> builder.codec(Codec.BYTE)
    );

    private static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
		return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Vanillaplusplus.MOD_ID, id), builderOperator.apply(ComponentType.builder()).build());
	}

    public static void initialize() {
        // NO-OP
    }
}
