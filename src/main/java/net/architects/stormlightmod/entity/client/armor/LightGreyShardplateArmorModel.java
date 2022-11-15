package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.GreyShardplateArmorItem;
import net.architects.stormlightmod.item.custom.LightGreyShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightGreyShardplateArmorModel extends AnimatedGeoModel<LightGreyShardplateArmorItem> {

    @Override
    public Identifier getModelResource(LightGreyShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(LightGreyShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/light_grey_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(LightGreyShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
