package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.CremlingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class CremlingModel extends AnimatedGeoModel<CremlingEntity> {
    @Override
    public Identifier getModelResource(CremlingEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/cremling.geo.json");
    }

    @Override
    public Identifier getTextureResource(CremlingEntity object) {
        return CremlingRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(CremlingEntity animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/cremling.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(CremlingEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
