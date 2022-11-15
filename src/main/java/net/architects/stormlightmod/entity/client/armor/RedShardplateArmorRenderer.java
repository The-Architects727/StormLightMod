package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import net.architects.stormlightmod.item.custom.RedShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RedShardplateArmorRenderer extends GeoArmorRenderer<RedShardplateArmorItem> {
    public RedShardplateArmorRenderer() {
        super(new RedShardplateArmorModel());

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
