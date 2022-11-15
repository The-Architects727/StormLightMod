package net.architects.stormlightmod.entity.client;

import com.google.common.collect.Maps;
import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.CremlingEntity;
import net.architects.stormlightmod.entity.varient.CremlingVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class CremlingRenderer extends GeoEntityRenderer<CremlingEntity> {
    public static final Map<CremlingVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CremlingVariant.class), (map) -> {
                map.put(CremlingVariant.DEFAULT,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/cremling/cremling_texture.png"));
                map.put(CremlingVariant.RED,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/cremling/red_cremling_texture.png"));
                map.put(CremlingVariant.BLUE,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/cremling/blue_cremling_texture.png"));
                map.put(CremlingVariant.YELLOW,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/cremling/yellow_cremling_texture.png"));
            });


    public CremlingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CremlingModel());
    }

    @Override
    public Identifier getTextureResource(CremlingEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(CremlingEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1f, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}
