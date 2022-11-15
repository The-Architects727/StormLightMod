package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackShardplateArmorRenderer extends GeoArmorRenderer<BlackShardplateArmorItem> {
    public BlackShardplateArmorRenderer() {
        super(new BlackShardplateArmorModel());

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
