package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.architects.stormlightmod.item.custom.PurpleShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PurpleShardplateArmorRenderer extends GeoArmorRenderer<PurpleShardplateArmorItem> {
    public PurpleShardplateArmorRenderer() {
        super(new PurpleShardplateArmorModel());

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
