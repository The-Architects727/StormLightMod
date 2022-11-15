package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.GreyShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GreyShardplateArmorModel extends AnimatedGeoModel<GreyShardplateArmorItem> {

    @Override
    public Identifier getModelResource(GreyShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(GreyShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/grey_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(GreyShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
