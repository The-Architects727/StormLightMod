package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.YellowShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YellowShardplateArmorModel extends AnimatedGeoModel<YellowShardplateArmorItem> {

    @Override
    public Identifier getModelResource(YellowShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(YellowShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/yellow_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(YellowShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
