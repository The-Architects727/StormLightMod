package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.WarformFemalenEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class WarformFemalenModel extends AnimatedGeoModel<WarformFemalenEntity> {
    @Override
    public Identifier getModelResource(WarformFemalenEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/warform_femalen.geo.json");
    }

    @Override
    public Identifier getTextureResource(WarformFemalenEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/entity/warform_femalen/warform_texture.png");
    }

    @Override
    public Identifier getAnimationResource(WarformFemalenEntity animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/warform.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(WarformFemalenEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
