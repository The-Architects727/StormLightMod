package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.CarapaceArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CarapaceArmorModel extends AnimatedGeoModel<CarapaceArmorItem> {

    @Override
    public Identifier getModelResource(CarapaceArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/carapace_armor.geo.json");

    }

    @Override
    public Identifier getTextureResource(CarapaceArmorItem object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/models/armor/carapace_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(CarapaceArmorItem animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/armor_animation.json");
    }
}
