package com.kayhennig.vanplusplus.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.google.common.collect.ImmutableMap;
import com.kayhennig.vanplusplus.render.entity.model.ModEntityModelLayers;
import com.kayhennig.vanplusplus.render.entity.model.SpearEntityModel;

import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModels;

@Mixin(EntityModels.class)
abstract class EntityModelsMixin {
	@Inject(method = "getModels", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/ImmutableMap$Builder;build()Lcom/google/common/collect/ImmutableMap;", remap = false), locals = LocalCapture.CAPTURE_FAILEXCEPTION)
	private static void registerExtraModelData(CallbackInfoReturnable<Map<EntityModelLayer, TexturedModelData>> info, ImmutableMap.Builder<EntityModelLayer, TexturedModelData> builder) {
		builder.put(ModEntityModelLayers.SPEAR, SpearEntityModel.getTexturedModelData());
	}
}

