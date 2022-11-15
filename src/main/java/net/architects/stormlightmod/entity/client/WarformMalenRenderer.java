package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.WarformFemalenEntity;
import net.architects.stormlightmod.entity.custom.WarformMalenEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WarformMalenRenderer extends GeoEntityRenderer<WarformMalenEntity> {
    public WarformMalenRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WarformMalenModel());
    }

    @Override
    public Identifier getTextureResource(WarformMalenEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/entity/warform_malen/warform_texture.png");
    }
}
