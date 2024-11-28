package com.kayhennig.vanplusplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.kayhennig.vanplusplus.ModItemTags;
import com.kayhennig.vanplusplus.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.ItemTags;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
            .add(ModItems.WOODEN_DAGGER)
            .add(ModItems.STONE_DAGGER)
            .add(ModItems.IRON_DAGGER)
            .add(ModItems.GOLDEN_DAGGER)
            .add(ModItems.DIAMOND_DAGGER)
            .add(ModItems.NETHERITE_DAGGER);

        getOrCreateTagBuilder(ModItemTags.HAMMERS)
            .add(ModItems.WOODEN_HAMMER)
            .add(ModItems.STONE_HAMMER)
            .add(ModItems.IRON_HAMMER)
            .add(ModItems.GOLDEN_HAMMER)
            .add(ModItems.DIAMOND_HAMMER)
            .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ModItemTags.SPEARS)
            .add(ModItems.WOODEN_SPEAR)
            .add(ModItems.STONE_SPEAR)
            .add(ModItems.IRON_SPEAR)
            .add(ModItems.GOLDEN_SPEAR)
            .add(ModItems.DIAMOND_SPEAR)
            .add(ModItems.NETHERITE_SPEAR);
    }
    
}
