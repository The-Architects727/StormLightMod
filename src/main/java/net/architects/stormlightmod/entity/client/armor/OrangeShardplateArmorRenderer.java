package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.OrangeShardplateArmorItem;
import net.architects.stormlightmod.item.custom.ShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OrangeShardplateArmorRenderer extends GeoArmorRenderer<OrangeShardplateArmorItem> {
    public OrangeShardplateArmorRenderer() {
        super(new OrangeShardplateArmorModel());

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
