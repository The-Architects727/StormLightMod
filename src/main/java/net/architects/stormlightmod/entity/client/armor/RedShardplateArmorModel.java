package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.RedShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedShardplateArmorModel extends AnimatedGeoModel<RedShardplateArmorItem> {

    @Override
    public Identifier getModelResource(RedShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(RedShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/red_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RedShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
