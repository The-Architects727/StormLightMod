package net.architects.stormlightmod.world.gen;

import net.architects.stormlightmod.entity.ModEntities;
import net.architects.stormlightmod.entity.RosharanHostileEntity;
import net.architects.stormlightmod.entity.RosharanPassiveEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.DESERT), SpawnGroup.AMBIENT,
                ModEntities.WARFORM_MALEN, 75, 2, 30);

        SpawnRestriction.register(ModEntities.WARFORM_MALEN, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RosharanHostileEntity::canSpawnIgnoreLightLevel);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.DESERT), SpawnGroup.AMBIENT,
                ModEntities.WARFORM_FEMALEN, 75, 2, 30);

        SpawnRestriction.register(ModEntities.WARFORM_FEMALEN, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RosharanHostileEntity::canSpawnIgnoreLightLevel);



        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.DESERT), SpawnGroup.AMBIENT,
                ModEntities.CREMLING, 200, 10, 30);

        SpawnRestriction.register(ModEntities.CREMLING, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RosharanPassiveEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.DESERT), SpawnGroup.AMBIENT,
                ModEntities.CHULL, 15, 1, 6);

        SpawnRestriction.register(ModEntities.CHULL, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RosharanPassiveEntity::isValidNaturalSpawn);
    }

    public static final RegistryKey<Biome> SHATTERED_PLAINS = register("shattered_plains");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }

}
