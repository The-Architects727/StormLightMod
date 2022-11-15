package net.architects.stormlightmod.util;

import net.architects.stormlightmod.entity.ModEntities;
import net.architects.stormlightmod.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.architects.stormlightmod.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFlammableBlock();
        registerAttributes();
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.GLOW_OAK_LEAVES, 30, 60);
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CREMLING, CremlingEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.CHULL, ChullEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WARFORM_FEMALEN, WarformFemalenEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WARFORM_MALEN, WarformMalenEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SKY_EEL, SkyEelEntity.setAttributes());
    }

}
