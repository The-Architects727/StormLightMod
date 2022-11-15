package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.PurpleShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PurpleShardplateArmorModel extends AnimatedGeoModel<PurpleShardplateArmorItem> {

    @Override
    public Identifier getModelResource(PurpleShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(PurpleShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/purple_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(PurpleShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
