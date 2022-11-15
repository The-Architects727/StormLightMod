package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.architects.stormlightmod.item.custom.OrangeShardplateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagentaShardplateArmorModel extends AnimatedGeoModel<MagentaShardplateArmorItem> {

    @Override
    public Identifier getModelResource(MagentaShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/shardplate_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(MagentaShardplateArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/magenta_shardplate_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MagentaShardplateArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
