package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.BlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.BrownShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrownShardplateArmorModel extends AnimatedGeoModel<BrownShardplateArmorItem> {

    @Override
    public Identifier getModelResource(BrownShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(BrownShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/brown_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(BrownShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
