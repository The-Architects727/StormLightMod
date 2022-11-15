package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.CyanShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CyanShardplateArmorRenderer extends GeoArmorRenderer<CyanShardplateArmorItem> {
    public CyanShardplateArmorRenderer() {
        super(new CyanShardplateArmorModel());

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
