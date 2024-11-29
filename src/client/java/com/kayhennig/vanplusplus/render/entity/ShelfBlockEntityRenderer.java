package com.kayhennig.vanplusplus.render.entity;

import com.kayhennig.vanplusplus.block.entity.ShelfBlockEntity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;

@Environment(EnvType.CLIENT)
public class ShelfBlockEntityRenderer implements BlockEntityRenderer<ShelfBlockEntity> {
    public ShelfBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {

    }
    @Override
    public void render(ShelfBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        // get occupied slots
        Direction direction = entity.getCachedState().get(HorizontalFacingBlock.FACING);
        
        for (int i = 0; i < entity.size(); i++) {
            // get stack
            var stack = entity.getStack(i);
            if (stack.isEmpty()) {
                continue;
            }
            matrices.push();

            double offset = Math.sin((entity.getWorld().getTime() + tickDelta + i * 20) / 8.0) / 16.0 + 0.075;

            switch (direction) {
                case NORTH:
                    matrices.translate(1-((float)i) / 4.0f - 0.125f, 0.725+offset, 0.75);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
                    break;
                case SOUTH:
                    matrices.translate(((float)i) / 4.0f + 0.125f, 0.725+offset, 0.25);
                    matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90));
                    break;
                case EAST:
                    matrices.translate(0.25, 0.725+offset, 1-((float)i) / 4.0f - 0.125f);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
                    break;
                case WEST:
                    matrices.translate(0.75, 0.725+offset, ((float)i) / 4.0f + 0.125f);
                    break;
                default:
                    break;
            }
            
            // render stack
            int lightAbove = WorldRenderer.getLightmapCoordinates(entity.getWorld(), entity.getPos().up());
            MinecraftClient.getInstance().getItemRenderer().renderItem(stack, ModelTransformationMode.GROUND, lightAbove, OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 0);
            matrices.pop();
        }

        matrices.pop();
    }
}
