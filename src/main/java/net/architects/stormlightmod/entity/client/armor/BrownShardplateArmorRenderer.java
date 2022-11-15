package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.BrownShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BrownShardplateArmorRenderer extends GeoArmorRenderer<BrownShardplateArmorItem> {
    public BrownShardplateArmorRenderer() {
        super(new BrownShardplateArmorModel());

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
