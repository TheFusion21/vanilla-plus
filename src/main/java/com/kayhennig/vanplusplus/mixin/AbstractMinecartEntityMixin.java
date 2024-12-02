package com.kayhennig.vanplusplus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import com.kayhennig.vanplusplus.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;

@Mixin(AbstractMinecartEntity.class)
public class AbstractMinecartEntityMixin {
    @Redirect(method = "moveOnRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"), require = 1)
    private boolean injectedPoweredRailCheck(BlockState state, Block POWERED_RAIL) {
        return state.isOf(POWERED_RAIL) ||
                state.isOf(ModBlocks.COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.OXIDIZED_COPPER_RAIL) ||
                state.isOf(ModBlocks.WEATHERED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.EXPOSED_COPPER_POWERED_RAIL) ||

                state.isOf(ModBlocks.WAXED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.WAXED_OXIDIZED_COPPER_RAIL) ||
                state.isOf(ModBlocks.WAXED_WEATHERED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.WAXED_EXPOSED_COPPER_POWERED_RAIL);

    }

    /*@Inject(method = "moveOnRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/vehicle/AbstractMinecartEntity;getVelocity()Lnet/minecraft/util/math/Vec3d;", shift = At.Shift.AFTER, ordinal = 9), cancellable = true, require = 1)
    private void injectedCopperRailCallback(BlockPos pos, BlockState state, CallbackInfo ci) {
        if (state.isOf(ModBlocks.COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.OXIDIZED_COPPER_RAIL) ||
                state.isOf(ModBlocks.WEATHERED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.EXPOSED_COPPER_POWERED_RAIL) ||

                state.isOf(ModBlocks.WAXED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.WAXED_OXIDIZED_COPPER_RAIL) ||
                state.isOf(ModBlocks.WAXED_WEATHERED_COPPER_POWERED_RAIL) ||
                state.isOf(ModBlocks.WAXED_EXPOSED_COPPER_POWERED_RAIL)) {
            ((CopperRailBlock) state.getBlock()).affectMinecart((AbstractMinecartEntity) (Object) this, state);
            ci.cancel();
        }
    }*/
}