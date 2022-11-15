package net.architects.stormlightmod.entity.client;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.ChullEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ChullModel extends AnimatedGeoModel<ChullEntity> {
    @Override
    public Identifier getModelResource(ChullEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "geo/chull.geo.json");
    }

    @Override
    public Identifier getTextureResource(ChullEntity object) {
        return new Identifier(StormlightMod.MOD_ID, "textures/entity/chull/chull_texture.png");
    }

    @Override
    public Identifier getAnimationResource(ChullEntity animatable) {
        return new Identifier(StormlightMod.MOD_ID, "animations/chull.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(ChullEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
