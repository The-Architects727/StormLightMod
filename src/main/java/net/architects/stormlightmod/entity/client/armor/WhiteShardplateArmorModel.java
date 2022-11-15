package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.WhiteShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WhiteShardplateArmorModel extends AnimatedGeoModel<WhiteShardplateArmorItem> {

    @Override
    public Identifier getModelResource(WhiteShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(WhiteShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/white_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(WhiteShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
