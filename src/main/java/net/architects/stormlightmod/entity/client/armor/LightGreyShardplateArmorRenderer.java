package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.GreyShardplateArmorItem;
import net.architects.stormlightmod.item.custom.LightGreyShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LightGreyShardplateArmorRenderer extends GeoArmorRenderer<LightGreyShardplateArmorItem> {
    public LightGreyShardplateArmorRenderer() {
        super(new LightGreyShardplateArmorModel());

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
