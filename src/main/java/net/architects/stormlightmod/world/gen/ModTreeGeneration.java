package net.architects.stormlightmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.architects.stormlightmod.world.feature.ModPlacedFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {

    public static final RegistryKey<Biome> BRAIZE = register("braize");
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_ACACIA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_BIRCH_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_DARK_OAK_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_JUNGLE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_OAK_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModTreeGeneration.BRAIZE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GLOW_SPRUCE_PLACED.getKey().get());
    }
    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
}