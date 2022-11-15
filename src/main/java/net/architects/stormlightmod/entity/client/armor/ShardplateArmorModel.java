package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.ShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShardplateArmorModel extends AnimatedGeoModel<ShardplateArmorItem> {

    @Override
    public Identifier getModelResource(ShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(ShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(ShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}