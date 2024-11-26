package com.kayhennig.vanplusplus.render.entity;

import com.kayhennig.vanplusplus.Vanillaplusplus;
import com.kayhennig.vanplusplus.entity.thrown.DynamiteEntity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(EnvType.CLIENT)
public class DynamiteEntityRenderer extends EntityRenderer<DynamiteEntity>  {
    private final ItemRenderer itemRenderer;

    public DynamiteEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
		this.itemRenderer = context.getItemRenderer();
	}

    public void render(DynamiteEntity dynamiteEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, dynamiteEntity.prevYaw, dynamiteEntity.getYaw()) + 90F));
		matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, dynamiteEntity.prevPitch, dynamiteEntity.getPitch()) + 90F));
        matrixStack.translate(0.0D, 0.2D, 0.0D);
        
        this.itemRenderer.renderItem(
            dynamiteEntity.getStack(),
            ModelTransformationMode.GROUND,
            i,
            OverlayTexture.DEFAULT_UV,
            matrixStack,
            vertexConsumerProvider,
            dynamiteEntity.getWorld(),
            dynamiteEntity.getId()
        );
        matrixStack.pop();
		super.render(dynamiteEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(DynamiteEntity entity) {
        return Identifier.of(Vanillaplusplus.MOD_ID, "textures/item/dynamite.png");
    }
    
}
