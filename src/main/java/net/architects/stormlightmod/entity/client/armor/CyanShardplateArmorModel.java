package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.CyanShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CyanShardplateArmorModel extends AnimatedGeoModel<CyanShardplateArmorItem> {

    @Override
    public Identifier getModelResource(CyanShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(CyanShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/cyan_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(CyanShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
