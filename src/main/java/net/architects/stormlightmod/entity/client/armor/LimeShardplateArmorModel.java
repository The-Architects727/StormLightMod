package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.LimeShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LimeShardplateArmorModel extends AnimatedGeoModel<LimeShardplateArmorItem> {

    @Override
    public Identifier getModelResource(LimeShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(LimeShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/lime_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(LimeShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
