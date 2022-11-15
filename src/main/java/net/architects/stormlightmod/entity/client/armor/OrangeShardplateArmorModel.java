package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.OrangeShardplateArmorItem;
import net.architects.stormlightmod.item.custom.ShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeShardplateArmorModel extends AnimatedGeoModel<OrangeShardplateArmorItem> {

    @Override
    public Identifier getModelResource(OrangeShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(OrangeShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/orange_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(OrangeShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
