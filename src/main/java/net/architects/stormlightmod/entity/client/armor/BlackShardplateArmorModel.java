package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackShardplateArmorModel extends AnimatedGeoModel<BlackShardplateArmorItem> {

    @Override
    public Identifier getModelResource(BlackShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(BlackShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/black_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(BlackShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
