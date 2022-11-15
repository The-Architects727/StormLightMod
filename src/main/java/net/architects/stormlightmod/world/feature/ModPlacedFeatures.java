package net.architects.stormlightmod.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacedFeatures.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> SMOKESTONE_ORE_PLACED = PlacedFeatures.register("smokestone_ore_placed",
            ModConfiguredFeatures.SMOKESTONE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> EMERALD_ORE_PLACED = PlacedFeatures.register("emerald_ore_placed",
            ModConfiguredFeatures.EMERALD_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> GARNET_ORE_PLACED = PlacedFeatures.register("garnet_ore_placed",
            ModConfiguredFeatures.GARNET_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> ZIRCON_ORE_PLACED = PlacedFeatures.register("zircon_ore_placed",
            ModConfiguredFeatures.ZIRCON_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_PLACED = PlacedFeatures.register("topaz_ore_placed",
            ModConfiguredFeatures.TOPAZ_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> HELIODOR_ORE_PLACED = PlacedFeatures.register("heliodor_ore_placed",
            ModConfiguredFeatures.HELIODOR_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> VOIDSTONE_PLACED = PlacedFeatures.register("voidstone_placed",
            ModConfiguredFeatures.VOIDSTONE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));


    public static final RegistryEntry<PlacedFeature> GLOW_ACACIA_PLACED = PlacedFeatures.register("glow_acacia_placed",
            ModConfiguredFeatures.GLOW_ACACIA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> GLOW_BIRCH_PLACED = PlacedFeatures.register("glow_birch_placed",
            ModConfiguredFeatures.GLOW_BIRCH_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> GLOW_DARK_OAK_PLACED = PlacedFeatures.register("glow_dark_oak_placed",
            ModConfiguredFeatures.GLOW_DARK_OAK_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> GLOW_JUNGLE_PLACED = PlacedFeatures.register("glow_jungle_placed",
            ModConfiguredFeatures.GLOW_JUNGLE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> GLOW_OAK_PLACED = PlacedFeatures.register("glow_oak_placed",
            ModConfiguredFeatures.GLOW_OAK_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> GLOW_SPRUCE_PLACED = PlacedFeatures.register("glow_spruce_placed",
            ModConfiguredFeatures.GLOW_SPRUCE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));



    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
