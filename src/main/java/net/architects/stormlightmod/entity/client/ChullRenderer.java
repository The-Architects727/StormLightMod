package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.ChullEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChullRenderer extends GeoEntityRenderer<ChullEntity> {
    public ChullRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ChullModel());
    }

    @Override
    public Identifier getTextureResource(ChullEntity instance) {
        return new Identifier(StormlightMod.MOD_ID, "textures/entity/chull/chull_texture.png");
    }
}
