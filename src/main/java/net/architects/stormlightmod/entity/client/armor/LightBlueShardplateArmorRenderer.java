package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.LightBlueShardplateArmorItem;
import net.architects.stormlightmod.item.custom.MagentaShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LightBlueShardplateArmorRenderer extends GeoArmorRenderer<LightBlueShardplateArmorItem> {
    public LightBlueShardplateArmorRenderer() {
        super(new LightBlueShardplateArmorModel());

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
