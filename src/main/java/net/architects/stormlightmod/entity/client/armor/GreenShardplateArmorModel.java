package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.GreenShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GreenShardplateArmorModel extends AnimatedGeoModel<GreenShardplateArmorItem> {

    @Override
    public Identifier getModelResource(GreenShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(GreenShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/green_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(GreenShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
