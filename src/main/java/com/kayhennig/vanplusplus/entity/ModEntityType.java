package com.kayhennig.vanplusplus.entity;

import com.kayhennig.vanplusplus.ModBlocks;
import com.kayhennig.vanplusplus.Vanillaplusplus;
import com.kayhennig.vanplusplus.block.ShelfBlockEntity;
import com.kayhennig.vanplusplus.thrown.DynamiteEntity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityType {
    public static final BlockEntityType<ShelfBlockEntity> SHELF = register("shelf",
        BlockEntityType.Builder.create(ShelfBlockEntity::new, 
            ModBlocks.OAK_SHELF,
            ModBlocks.SPRUCE_SHELF,
            ModBlocks.BIRCH_SHELF,
            ModBlocks.JUNGLE_SHELF, 
            ModBlocks.ACACIA_SHELF,
            ModBlocks.DARK_OAK_SHELF,
            ModBlocks.MANGROVE_SHELF,
            ModBlocks.CHERRY_SHELF,
            ModBlocks.CRIMSON_SHELF,
            ModBlocks.WARPED_SHELF
        ).build());

    public static final EntityType<DynamiteEntity> DYNAMITE = register("dynamite", 
        EntityType.Builder.<DynamiteEntity>create(DynamiteEntity::new, SpawnGroup.MISC)
            .dimensions(0.3f, 0.4f)
            .maxTrackingRange(4)
            .trackingTickInterval(10)
            .build());

    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Vanillaplusplus.MOD_ID, path), blockEntityType);
    }

    public static <T extends EntityType<?>> T register(String path, T entityType) {
        return Registry.register(Registries.ENTITY_TYPE, Identifier.of(Vanillaplusplus.MOD_ID, path), entityType);
    }

    public static void initialize() {
    
    }
}
