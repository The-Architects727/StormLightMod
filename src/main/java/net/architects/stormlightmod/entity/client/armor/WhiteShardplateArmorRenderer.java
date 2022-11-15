package net.architects.stormlightmod.entity.client.armor;

import net.architects.stormlightmod.item.custom.BlackShardplateArmorItem;
import net.architects.stormlightmod.item.custom.WhiteShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WhiteShardplateArmorRenderer extends GeoArmorRenderer<WhiteShardplateArmorItem> {
    public WhiteShardplateArmorRenderer() {
        super(new WhiteShardplateArmorModel());

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
