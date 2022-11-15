package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.architects.stormlightmod.item.custom.YellowShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class YellowShardplateArmorRenderer extends GeoArmorRenderer<YellowShardplateArmorItem> {
    public YellowShardplateArmorRenderer() {
        super(new YellowShardplateArmorModel());

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
