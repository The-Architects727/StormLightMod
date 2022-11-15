package net.architects.stormlightmod.world.feature;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_SMOKESTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SMOKESTONE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SMOKESTONE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_EMERALD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EMERALD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_EMERALD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_GARNET_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GARNET_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_GARNET_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_ZIRCON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZIRCON_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ZIRCON_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_TOPAZ_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_HELIODOR_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.HELIODOR_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_HELIODOR_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_VOIDSTONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.VOIDSTONE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE =
            ConfiguredFeatures.register("sapphire_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 1));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SMOKESTONE_ORE =
            ConfiguredFeatures.register("smokestone_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SMOKESTONE_ORES, 2));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RUBY_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> EMERALD_ORE =
            ConfiguredFeatures.register("emerald_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_EMERALD_ORES, 1));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GARNET_ORE =
            ConfiguredFeatures.register("garnet_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_GARNET_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ZIRCON_ORE =
            ConfiguredFeatures.register("zircon_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ZIRCON_ORES, 2));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE =
            ConfiguredFeatures.register("topaz_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TOPAZ_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HELIODOR_ORE =
            ConfiguredFeatures.register("heliodor_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_HELIODOR_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTONE =
            ConfiguredFeatures.register("voidstone", Feature.ORE, new OreFeatureConfig(OVERWORLD_VOIDSTONE, 1));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_ACACIA_TREE =
            ConfiguredFeatures.register("glow_acacia_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.ACACIA_LOG),
                    new ForkingTrunkPlacer(5, 2, 2),
                    BlockStateProvider.of(ModBlocks.GLOW_ACACIA_LEAVES),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> GLOW_ACACIA_CHECKED =
            PlacedFeatures.register("glow_acacia_checked", GLOW_ACACIA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_ACACIA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_ACACIA_SPAWN =
            ConfiguredFeatures.register("glow_acacia_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_ACACIA_CHECKED, 0.5f)),
                            GLOW_ACACIA_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_BIRCH_TREE =
            ConfiguredFeatures.register("glow_birch_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(5, 2, 0),
                    BlockStateProvider.of(ModBlocks.GLOW_BIRCH_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final RegistryEntry<PlacedFeature> GLOW_BIRCH_CHECKED =
            PlacedFeatures.register("glow_birch_checked", GLOW_BIRCH_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_BIRCH_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_BIRCH_SPAWN =
            ConfiguredFeatures.register("glow_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_BIRCH_CHECKED, 0.5f)),
                            GLOW_BIRCH_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_DARK_OAK_TREE =
            ConfiguredFeatures.register("glow_dark_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.DARK_OAK_LOG),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    BlockStateProvider.of(ModBlocks.GLOW_DARK_OAK_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> GLOW_DARK_OAK_CHECKED =
            PlacedFeatures.register("glow_dark_oak_checked", GLOW_DARK_OAK_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_DARK_OAK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_DARK_OAK_SPAWN =
            ConfiguredFeatures.register("glow_dark_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_DARK_OAK_CHECKED, 0.5f)),
                            GLOW_DARK_OAK_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_JUNGLE_TREE =
            ConfiguredFeatures.register("glow_jungle_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.JUNGLE_LOG),
                    new StraightTrunkPlacer(4, 8, 0),
                    BlockStateProvider.of(ModBlocks.GLOW_JUNGLE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> GLOW_JUNGLE_CHECKED =
            PlacedFeatures.register("glow_jungle_checked", GLOW_JUNGLE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_JUNGLE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_JUNGLE_SPAWN =
            ConfiguredFeatures.register("glow_jungle_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_JUNGLE_CHECKED, 0.5f)),
                            GLOW_JUNGLE_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_OAK_TREE =
            ConfiguredFeatures.register("glow_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.OAK_LOG),
                    new StraightTrunkPlacer(4, 2, 0),
                    BlockStateProvider.of(ModBlocks.GLOW_OAK_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final RegistryEntry<PlacedFeature> GLOW_OAK_CHECKED =
            PlacedFeatures.register("glow_oak_checked", GLOW_OAK_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_OAK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_OAK_SPAWN =
            ConfiguredFeatures.register("glow_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_OAK_CHECKED, 0.5f)),
                            GLOW_OAK_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOW_SPRUCE_TREE =
            ConfiguredFeatures.register("glow_spruce_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(5, 2, 1),
                    BlockStateProvider.of(ModBlocks.GLOW_SPRUCE_LEAVES),
                    new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
                    new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> GLOW_SPRUCE_CHECKED =
            PlacedFeatures.register("glow_spruce_checked", GLOW_SPRUCE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.GLOW_SPRUCE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GLOW_SPRUCE_SPAWN =
            ConfiguredFeatures.register("glow_spruce_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GLOW_SPRUCE_CHECKED, 0.5f)),
                            GLOW_SPRUCE_CHECKED));



    public static void registerConfiguredFeatures() {
        StormlightMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + StormlightMod.MOD_ID);
    }
}
