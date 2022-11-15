package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.WarformFemalenEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WarformFemalenRenderer extends GeoEntityRenderer<WarformFemalenEntity> {
    public WarformFemalenRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WarformFemalenModel());
    }

    @Override
    public Identifier getTextureResource(WarformFemalenEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/entity/warform_femalen/warform_texture.png");
    }
}
