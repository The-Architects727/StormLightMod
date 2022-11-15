package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.CarapaceArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CarapaceArmorRenderer extends GeoArmorRenderer<CarapaceArmorItem> {
    public CarapaceArmorRenderer() {
        super(new CarapaceArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
