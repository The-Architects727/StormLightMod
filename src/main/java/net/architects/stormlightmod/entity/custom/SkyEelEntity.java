package net.architects.stormlightmod.entity.custom;


import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import net.architects.stormlightmod.entity.RosharanPassiveEntity;
import net.architects.stormlightmod.entity.varient.SkyEelVariant;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.control.BodyControl;
import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.Goal.Control;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.Heightmap.Type;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class SkyEelEntity extends FlyingEntity implements IAnimatable, Monster {
    private AnimationFactory factory = new AnimationFactory(this);

    public static final float field_30475 = 7.448451F;
    public static final int field_28641 = MathHelper.ceil(24.166098F);
    private static final TrackedData<Integer> SIZE;
    Vec3d targetPosition;
    BlockPos circlingCenter;
    SkyEelEntity.PhantomMovementType movementType;

    public static DefaultAttributeContainer.Builder setAttributes() {
        return RosharanPassiveEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    public SkyEelEntity(EntityType<? extends SkyEelEntity> entityType, World world) {
        super(entityType, world);
        this.targetPosition = Vec3d.ZERO;
        this.circlingCenter = BlockPos.ORIGIN;
        this.movementType = SkyEelEntity.PhantomMovementType.CIRCLE;
        this.experiencePoints = 5;
        this.moveControl = new SkyEelEntity.PhantomMoveControl(this);
        this.lookControl = new SkyEelEntity.PhantomLookControl(this);
    }

    public boolean hasWings() {
        return (this.method_33588() + this.age) % field_28641 == 0;
    }

    protected BodyControl createBodyControl() {
        return new SkyEelEntity.PhantomBodyControl(this);
    }

    protected void initGoals() {
        this.goalSelector.add(1, new SkyEelEntity.StartAttackGoal());
        this.goalSelector.add(3, new SkyEelEntity.CircleMovementGoal());

    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(DATA_ID_TYPE_VARIANT, 0);
        this.dataTracker.startTracking(SIZE, 0);
    }

    public void setPhantomSize(int size) {
        this.dataTracker.set(SIZE, MathHelper.clamp(size, 0, 64));
    }

    private void onSizeChanged() {
        this.calculateDimensions();
    }


    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height * 0.35F;
    }

    public void onTrackedDataSet(TrackedData<?> data) {
        if (SIZE.equals(data)) {
            this.onSizeChanged();
        }

        super.onTrackedDataSet(data);
    }

    public int method_33588() {
        return this.getId() * 3;
    }

    protected boolean isDisallowedInPeaceful() {
        return true;
    }

    public void tick() {
        super.tick();
        if (this.world.isClient) {
            float f = MathHelper.cos((float)(this.method_33588() + this.age) * 7.448451F * 0.017453292F + 3.1415927F);
            float g = MathHelper.cos((float)(this.method_33588() + this.age + 1) * 7.448451F * 0.017453292F + 3.1415927F);
            if (f > 0.0F && g <= 0.0F) {
                this.world.playSound(this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_PHANTOM_FLAP, this.getSoundCategory(), 0.95F + this.random.nextFloat() * 0.05F, 0.95F + this.random.nextFloat() * 0.05F, false);
            }
        }

    }

    public void tickMovement() {

        super.tickMovement();
    }

    protected void mobTick() {
        super.mobTick();
    }

    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        SkyEelVariant variant = Util.getRandom(SkyEelVariant.values(), this.random);
            setVariant(variant);
        this.circlingCenter = this.getBlockPos().up(5);
        this.setPhantomSize(0);
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
        if (nbt.contains("AX")) {
            this.circlingCenter = new BlockPos(nbt.getInt("AX"), nbt.getInt("AY"), nbt.getInt("AZ"));
        }

        this.setPhantomSize(nbt.getInt("Size"));
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {

        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
        nbt.putInt("AX", this.circlingCenter.getX());
        nbt.putInt("AY", this.circlingCenter.getY());
        nbt.putInt("AZ", this.circlingCenter.getZ());
    }

    public boolean shouldRender(double distance) {
        return true;
    }

    public SoundCategory getSoundCategory() {
        return SoundCategory.HOSTILE;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_PHANTOM_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_PHANTOM_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_PHANTOM_DEATH;
    }

    public EntityGroup getGroup() {
        return EntityGroup.DEFAULT;
    }

    protected float getSoundVolume() {
        return 1.0F;
    }

    public EntityDimensions getDimensions(EntityPose pose) {
        int i = 1;
        EntityDimensions entityDimensions = super.getDimensions(pose);
        float f = (entityDimensions.width + 0.2F * (float)i) / entityDimensions.width;
        return entityDimensions.scaled(f);
    }

    static {
        SIZE = DataTracker.registerData(SkyEelEntity.class, TrackedDataHandlerRegistry.INTEGER);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.sky_eel.fly", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.sky_eel.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    private static enum PhantomMovementType {
        CIRCLE,
        SWOOP;

        private PhantomMovementType() {
        }
    }

    class PhantomMoveControl extends MoveControl {
        private float targetSpeed = 0.1F;

        public PhantomMoveControl(MobEntity owner) {
            super(owner);
        }

        public void tick() {
            if (SkyEelEntity.this.horizontalCollision) {
                SkyEelEntity.this.setYaw(SkyEelEntity.this.getYaw() + 180.0F);
                this.targetSpeed = 0.1F;
            }

            double d = SkyEelEntity.this.targetPosition.x - SkyEelEntity.this.getX();
            double e = SkyEelEntity.this.targetPosition.y - SkyEelEntity.this.getY();
            double f = SkyEelEntity.this.targetPosition.z - SkyEelEntity.this.getZ();
            double g = Math.sqrt(d * d + f * f);
            if (Math.abs(g) > 9.999999747378752E-6) {
                double h = 1.0 - Math.abs(e * 0.699999988079071) / g;
                d *= h;
                f *= h;
                g = Math.sqrt(d * d + f * f);
                double i = Math.sqrt(d * d + f * f + e * e);
                float j = SkyEelEntity.this.getYaw();
                float k = (float)MathHelper.atan2(f, d);
                float l = MathHelper.wrapDegrees(SkyEelEntity.this.getYaw() + 90.0F);
                float m = MathHelper.wrapDegrees(k * 57.295776F);
                SkyEelEntity.this.setYaw(MathHelper.stepUnwrappedAngleTowards(l, m, 4.0F) - 90.0F);
                SkyEelEntity.this.bodyYaw = SkyEelEntity.this.getYaw();
                if (MathHelper.angleBetween(j, SkyEelEntity.this.getYaw()) < 3.0F) {
                    this.targetSpeed = MathHelper.stepTowards(this.targetSpeed, 1.8F, 0.005F * (1.8F / this.targetSpeed));
                } else {
                    this.targetSpeed = MathHelper.stepTowards(this.targetSpeed, 0.2F, 0.025F);
                }

                float n = (float)(-(MathHelper.atan2(-e, g) * 57.2957763671875));
                SkyEelEntity.this.setPitch(n);
                float o = SkyEelEntity.this.getYaw() + 90.0F;
                double p = (double)(this.targetSpeed * MathHelper.cos(o * 0.017453292F)) * Math.abs(d / i);
                double q = (double)(this.targetSpeed * MathHelper.sin(o * 0.017453292F)) * Math.abs(f / i);
                double r = (double)(this.targetSpeed * MathHelper.sin(n * 0.017453292F)) * Math.abs(e / i);
                Vec3d vec3d = SkyEelEntity.this.getVelocity();
                SkyEelEntity.this.setVelocity(vec3d.add((new Vec3d(p, r, q)).subtract(vec3d).multiply(0.2)));
            }

        }
    }

    class PhantomLookControl extends LookControl {
        public PhantomLookControl(MobEntity entity) {
            super(entity);
        }

        public void tick() {
        }
    }

    private class PhantomBodyControl extends BodyControl {
        public PhantomBodyControl(MobEntity entity) {
            super(entity);
        }

        public void tick() {
            SkyEelEntity.this.headYaw = SkyEelEntity.this.bodyYaw;
            SkyEelEntity.this.bodyYaw = SkyEelEntity.this.getYaw();
        }
    }

    class StartAttackGoal extends Goal {
        private int cooldown;

        StartAttackGoal() {
        }

        public boolean canStart() {
            LivingEntity livingEntity = SkyEelEntity.this.getTarget();
            return livingEntity != null ? SkyEelEntity.this.isTarget(livingEntity, TargetPredicate.DEFAULT) : false;
        }

        public void start() {
            this.cooldown = this.getTickCount(10);
            SkyEelEntity.this.movementType = SkyEelEntity.PhantomMovementType.CIRCLE;
            this.startSwoop();
        }

        public void stop() {
            SkyEelEntity.this.circlingCenter = SkyEelEntity.this.world.getTopPosition(Type.MOTION_BLOCKING, SkyEelEntity.this.circlingCenter).up(10 + SkyEelEntity.this.random.nextInt(20));
        }

        public void tick() {
            if (SkyEelEntity.this.movementType == SkyEelEntity.PhantomMovementType.CIRCLE) {
                --this.cooldown;
                if (this.cooldown <= 0) {
                    SkyEelEntity.this.movementType = SkyEelEntity.PhantomMovementType.SWOOP;
                    this.startSwoop();
                    this.cooldown = this.getTickCount((8 + SkyEelEntity.this.random.nextInt(4)) * 20);
                    SkyEelEntity.this.playSound(SoundEvents.ENTITY_PHANTOM_SWOOP, 10.0F, 0.95F + SkyEelEntity.this.random.nextFloat() * 0.1F);
                }
            }

        }

        private void startSwoop() {
            SkyEelEntity.this.circlingCenter = SkyEelEntity.this.getTarget().getBlockPos().up(20 + SkyEelEntity.this.random.nextInt(20));
            if (SkyEelEntity.this.circlingCenter.getY() < SkyEelEntity.this.world.getSeaLevel()) {
                SkyEelEntity.this.circlingCenter = new BlockPos(SkyEelEntity.this.circlingCenter.getX(), SkyEelEntity.this.world.getSeaLevel() + 1, SkyEelEntity.this.circlingCenter.getZ());
            }

        }
    }

    class CircleMovementGoal extends SkyEelEntity.MovementGoal {
        private float angle;
        private float radius;
        private float yOffset;
        private float circlingDirection;

        CircleMovementGoal() {
            super();
        }

        public boolean canStart() {
            return SkyEelEntity.this.getTarget() == null || SkyEelEntity.this.movementType == SkyEelEntity.PhantomMovementType.CIRCLE;
        }

        public void start() {
            this.radius = 20.0F + SkyEelEntity.this.random.nextFloat() * 20.0F;
            this.yOffset = -10.0F + SkyEelEntity.this.random.nextFloat() * 15.0F;
            this.circlingDirection = SkyEelEntity.this.random.nextBoolean() ? 5.0F : -5.0F;
            this.adjustDirection();
        }

        public void tick() {
            if (SkyEelEntity.this.random.nextInt(this.getTickCount(350)) == 0) {
                this.yOffset = -10.0F + SkyEelEntity.this.random.nextFloat() * 15.0F;
            }

            if (SkyEelEntity.this.random.nextInt(this.getTickCount(250)) == 0) {
                ++this.radius;
                if (this.radius > 30.0F) {
                    this.radius = 20.0F;
                    this.circlingDirection = -this.circlingDirection;
                }
            }

            if (SkyEelEntity.this.random.nextInt(this.getTickCount(450)) == 0) {
                this.angle = SkyEelEntity.this.random.nextFloat() * 2.0F * 3.1415927F;
                this.adjustDirection();
            }

            if (this.isNearTarget()) {
                this.adjustDirection();
            }

            if (SkyEelEntity.this.targetPosition.y < SkyEelEntity.this.getY() && !SkyEelEntity.this.world.isAir(SkyEelEntity.this.getBlockPos().down(1))) {
                this.yOffset = Math.max(1.0F, this.yOffset);
                this.adjustDirection();
            }

            if (SkyEelEntity.this.targetPosition.y > SkyEelEntity.this.getY() && !SkyEelEntity.this.world.isAir(SkyEelEntity.this.getBlockPos().up(1))) {
                this.yOffset = Math.min(-1.0F, this.yOffset);
                this.adjustDirection();
            }

        }

        private void adjustDirection() {
            if (BlockPos.ORIGIN.equals(SkyEelEntity.this.circlingCenter)) {
                SkyEelEntity.this.circlingCenter = SkyEelEntity.this.getBlockPos();
            }

            this.angle += this.circlingDirection * 15.0F * 0.017453292F;
            SkyEelEntity.this.targetPosition = Vec3d.of(SkyEelEntity.this.circlingCenter).add((double)(this.radius * MathHelper.cos(this.angle)), (double)(-4.0F + this.yOffset), (double)(this.radius * MathHelper.sin(this.angle)));
        }
    }

    abstract class MovementGoal extends Goal {
        public MovementGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        protected boolean isNearTarget() {
            return SkyEelEntity.this.targetPosition.squaredDistanceTo(SkyEelEntity.this.getX(), SkyEelEntity.this.getY(), SkyEelEntity.this.getZ()) < 4.0;
        }
    }




    /* VARIANTS */
    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(SkyEelEntity.class, TrackedDataHandlerRegistry.INTEGER);


    public SkyEelVariant getVariant() {
        return SkyEelVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(SkyEelVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }
}
