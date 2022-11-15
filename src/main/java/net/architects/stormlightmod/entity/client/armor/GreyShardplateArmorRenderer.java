package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.GreyShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GreyShardplateArmorRenderer extends GeoArmorRenderer<GreyShardplateArmorItem> {
    public GreyShardplateArmorRenderer() {
        super(new GreyShardplateArmorModel());

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
