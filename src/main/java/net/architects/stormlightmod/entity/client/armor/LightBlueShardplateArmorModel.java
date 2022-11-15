package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.LightBlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightBlueShardplateArmorModel extends AnimatedGeoModel<LightBlueShardplateArmorItem> {

    @Override
    public Identifier getModelResource(LightBlueShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(LightBlueShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/light_blue_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(LightBlueShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
