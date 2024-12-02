package com.kayhennig.vanplusplus.mixin;

import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.google.common.collect.ImmutableBiMap;
import com.kayhennig.vanplusplus.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.HoneycombItem;

@Mixin(HoneycombItem.class)
public class HoneycombItemMixin {
	@Dynamic("method_34723: Synthetic lambda body for Suppliers.memoize in initialization of UNWAXED_TO_WAXED_BLOCKS")
	@Inject(method = "method_34723", at = @At("RETURN"), cancellable = true)
	private static void createUnwaxedToWaxedMap(CallbackInfoReturnable<ImmutableBiMap<Block, Block>> cir) {
        //cir.setReturnValue(HashBiMap.create(cir.getReturnValue()));
        cir.setReturnValue(ImmutableBiMap.<Block, Block>builder()
				.put(Blocks.COPPER_BLOCK, Blocks.WAXED_COPPER_BLOCK)
				.put(Blocks.EXPOSED_COPPER, Blocks.WAXED_EXPOSED_COPPER)
				.put(Blocks.WEATHERED_COPPER, Blocks.WAXED_WEATHERED_COPPER)
				.put(Blocks.OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_COPPER)
				.put(Blocks.CUT_COPPER, Blocks.WAXED_CUT_COPPER)
				.put(Blocks.EXPOSED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER)
				.put(Blocks.WEATHERED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER)
				.put(Blocks.OXIDIZED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER)
				.put(Blocks.CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_SLAB)
				.put(Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)
				.put(Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)
				.put(Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)
				.put(Blocks.CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER_STAIRS)
				.put(Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS)
				.put(Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS)
				.put(Blocks.OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS)
				.put(Blocks.CHISELED_COPPER, Blocks.WAXED_CHISELED_COPPER)
				.put(Blocks.EXPOSED_CHISELED_COPPER, Blocks.WAXED_EXPOSED_CHISELED_COPPER)
				.put(Blocks.WEATHERED_CHISELED_COPPER, Blocks.WAXED_WEATHERED_CHISELED_COPPER)
				.put(Blocks.OXIDIZED_CHISELED_COPPER, Blocks.WAXED_OXIDIZED_CHISELED_COPPER)
				.put(Blocks.COPPER_DOOR, Blocks.WAXED_COPPER_DOOR)
				.put(Blocks.EXPOSED_COPPER_DOOR, Blocks.WAXED_EXPOSED_COPPER_DOOR)
				.put(Blocks.WEATHERED_COPPER_DOOR, Blocks.WAXED_WEATHERED_COPPER_DOOR)
				.put(Blocks.OXIDIZED_COPPER_DOOR, Blocks.WAXED_OXIDIZED_COPPER_DOOR)
				.put(Blocks.COPPER_TRAPDOOR, Blocks.WAXED_COPPER_TRAPDOOR)
				.put(Blocks.EXPOSED_COPPER_TRAPDOOR, Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR)
				.put(Blocks.WEATHERED_COPPER_TRAPDOOR, Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR)
				.put(Blocks.OXIDIZED_COPPER_TRAPDOOR, Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR)
				.put(Blocks.COPPER_GRATE, Blocks.WAXED_COPPER_GRATE)
				.put(Blocks.EXPOSED_COPPER_GRATE, Blocks.WAXED_EXPOSED_COPPER_GRATE)
				.put(Blocks.WEATHERED_COPPER_GRATE, Blocks.WAXED_WEATHERED_COPPER_GRATE)
				.put(Blocks.OXIDIZED_COPPER_GRATE, Blocks.WAXED_OXIDIZED_COPPER_GRATE)
				.put(Blocks.COPPER_BULB, Blocks.WAXED_COPPER_BULB)
				.put(Blocks.EXPOSED_COPPER_BULB, Blocks.WAXED_EXPOSED_COPPER_BULB)
				.put(Blocks.WEATHERED_COPPER_BULB, Blocks.WAXED_WEATHERED_COPPER_BULB)
				.put(Blocks.OXIDIZED_COPPER_BULB, Blocks.WAXED_OXIDIZED_COPPER_BULB)
                .put(ModBlocks.CUT_COPPER_VERTICAL_SLAB, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
                .put(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
                .put(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
                .put(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
                .put(ModBlocks.COPPER_RAIL, ModBlocks.WAXED_COPPER_RAIL)
                .put(ModBlocks.EXPOSED_COPPER_RAIL, ModBlocks.WAXED_EXPOSED_COPPER_RAIL)
                .put(ModBlocks.WEATHERED_COPPER_RAIL, ModBlocks.WAXED_WEATHERED_COPPER_RAIL)
                .put(ModBlocks.OXIDIZED_COPPER_RAIL, ModBlocks.WAXED_OXIDIZED_COPPER_RAIL)
                .put(ModBlocks.COPPER_POWERED_RAIL, ModBlocks.WAXED_COPPER_POWERED_RAIL)
                .put(ModBlocks.EXPOSED_COPPER_POWERED_RAIL, ModBlocks.WAXED_EXPOSED_COPPER_POWERED_RAIL)
                .put(ModBlocks.WEATHERED_COPPER_POWERED_RAIL, ModBlocks.WAXED_WEATHERED_COPPER_POWERED_RAIL)
                .put(ModBlocks.OXIDIZED_COPPER_POWERED_RAIL, ModBlocks.WAXED_OXIDIZED_COPPER_POWERED_RAIL)
                .put(ModBlocks.COPPER_ACTIVATOR_RAIL, ModBlocks.WAXED_COPPER_ACTIVATOR_RAIL)
                .put(ModBlocks.EXPOSED_COPPER_ACTIVATOR_RAIL, ModBlocks.WAXED_EXPOSED_COPPER_ACTIVATOR_RAIL)
                .put(ModBlocks.WEATHERED_COPPER_ACTIVATOR_RAIL, ModBlocks.WAXED_WEATHERED_COPPER_ACTIVATOR_RAIL)
                .put(ModBlocks.OXIDIZED_COPPER_ACTIVATOR_RAIL, ModBlocks.WAXED_OXIDIZED_COPPER_ACTIVATOR_RAIL)
                .put(ModBlocks.COPPER_DETECTOR_RAIL, ModBlocks.WAXED_COPPER_DETECTOR_RAIL)
                .put(ModBlocks.EXPOSED_COPPER_DETECTOR_RAIL, ModBlocks.WAXED_EXPOSED_COPPER_DETECTOR_RAIL)
                .put(ModBlocks.WEATHERED_COPPER_DETECTOR_RAIL, ModBlocks.WAXED_WEATHERED_COPPER_DETECTOR_RAIL)
                .put(ModBlocks.OXIDIZED_COPPER_DETECTOR_RAIL, ModBlocks.WAXED_OXIDIZED_COPPER_DETECTOR_RAIL)
                .build());
	}
}
