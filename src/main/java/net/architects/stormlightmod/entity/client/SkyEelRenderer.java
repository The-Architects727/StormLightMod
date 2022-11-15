package net.architects.stormlightmod.entity.client;

import com.google.common.collect.Maps;
import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.SkyEelEntity;
import net.architects.stormlightmod.entity.varient.SkyEelVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SkyEelRenderer extends GeoEntityRenderer<SkyEelEntity> {
    public static final Map<SkyEelVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SkyEelVariant.class), (map) -> {
                map.put(SkyEelVariant.BLUE,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/sky_eel/blue_sky_eel_texture.png"));
                map.put(SkyEelVariant.LIGHT_BLUE,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/sky_eel/light_blue_sky_eel_texture.png"));
                map.put(SkyEelVariant.GREEN,
                        new Identifier(StormlightMod.MOD_ID, "textures/entity/sky_eel/green_sky_eel_texture.png"));
            });


    public SkyEelRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SkyEelModel());
    }

    @Override
    public Identifier getTextureResource(SkyEelEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(SkyEelEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}
