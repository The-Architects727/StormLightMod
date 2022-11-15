package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.LightBlueShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueShardplateArmorModel extends AnimatedGeoModel<BlueShardplateArmorItem> {

    @Override
    public Identifier getModelResource(BlueShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(BlueShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/blue_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(BlueShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
