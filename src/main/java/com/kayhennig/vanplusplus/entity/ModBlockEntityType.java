package com.kayhennig.vanplusplus.entity;

import com.kayhennig.vanplusplus.ModBlocks;
import com.kayhennig.vanplusplus.Vanillaplusplus;
import com.kayhennig.vanplusplus.block.ShelfBlockEntity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntityType {
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

    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Vanillaplusplus.MOD_ID, path), blockEntityType);
    }

    public static void initialize() {
    
    }
}
