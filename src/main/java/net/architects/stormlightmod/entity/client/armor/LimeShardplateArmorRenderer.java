package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.LimeShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LimeShardplateArmorRenderer extends GeoArmorRenderer<LimeShardplateArmorItem> {
    public LimeShardplateArmorRenderer() {
        super(new LimeShardplateArmorModel());

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
