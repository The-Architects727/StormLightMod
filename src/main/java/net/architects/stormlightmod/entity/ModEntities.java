package net.architects.stormlightmod.entity;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<CremlingEntity> CREMLING = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StormlightMod.MOD_ID, "cremling"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, CremlingEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,0.3f)).build());

    public static final EntityType<ChullEntity> CHULL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StormlightMod.MOD_ID, "chull"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, ChullEntity::new)
                    .dimensions(EntityDimensions.fixed(3f,3.3f)).build());

    public static final EntityType<WarformFemalenEntity> WARFORM_FEMALEN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StormlightMod.MOD_ID, "warform_femalen"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, WarformFemalenEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2f)).build());

    public static final EntityType<WarformMalenEntity> WARFORM_MALEN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StormlightMod.MOD_ID, "warform_malen"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, WarformMalenEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2f)).build());

    public static final EntityType<SkyEelEntity> SKY_EEL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StormlightMod.MOD_ID, "sky_eel"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, SkyEelEntity::new)
                    .dimensions(EntityDimensions.fixed(.25f,.25f)).build());
}
