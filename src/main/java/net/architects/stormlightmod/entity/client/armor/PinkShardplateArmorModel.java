package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.PinkShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PinkShardplateArmorModel extends AnimatedGeoModel<PinkShardplateArmorItem> {

    @Override
    public Identifier getModelResource(PinkShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(PinkShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/pink_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(PinkShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
