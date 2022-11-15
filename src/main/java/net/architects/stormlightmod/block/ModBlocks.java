package net.architects.stormlightmod.block;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.block.custom.Glowing_Leaves;
import net.architects.stormlightmod.block.custom.ModSaplingBlock;
import net.architects.stormlightmod.block.custom.voidlight_infuser_block;
import net.architects.stormlightmod.item.ModItemGroup;
import net.architects.stormlightmod.world.feature.tree.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block EMERALD_ORE = registerBlock("emerald_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block SMOKESTONE_ORE = registerBlock("smokestone_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GARNET_ORE = registerBlock("garnet_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block ZIRCON_ORE = registerBlock("zircon_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block HELIODOR_ORE = registerBlock("heliodor_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_EMERALD_ORE = registerBlock("deepslate_emerald_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_SMOKESTONE_ORE = registerBlock("deepslate_smokestone_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_GARNET_ORE = registerBlock("deepslate_garnet_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block DEEPSLATE_HELIODOR_ORE = registerBlock("deepslate_heliodor_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block UNCUT_EMERALD_BLOCK = registerBlock("uncut_emerald_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block VOIDLIGHT_INFUSER_BLOCK = registerBlock("voidlight_infuser_block",
            new voidlight_infuser_block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().nonOpaque()), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block VOIDSTONE = registerBlock("voidstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block GLOW_ACACIA_LEAVES = registerBlock("glow_acacia_leaves",
            new Glowing_Leaves(Blocks.ACACIA_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_BIRCH_LEAVES = registerBlock("glow_birch_leaves",
            new Glowing_Leaves(Blocks.BIRCH_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_DARK_OAK_LEAVES = registerBlock("glow_dark_oak_leaves",
            new Glowing_Leaves(Blocks.DARK_OAK_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_JUNGLE_LEAVES = registerBlock("glow_jungle_leaves",
            new Glowing_Leaves(Blocks.JUNGLE_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_OAK_LEAVES = registerBlock("glow_oak_leaves",
            new Glowing_Leaves(Blocks.OAK_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_SPRUCE_LEAVES = registerBlock("glow_spruce_leaves",
            new Glowing_Leaves(Blocks.SPRUCE_LEAVES, 15), ModItemGroup.STORMLIGHT_BLOCKS);

    public static final Block GLOW_ACACIA_SAPLING = registerBlock("glow_acacia_sapling",
            new ModSaplingBlock(new GlowAcaciaSaplingGenerator(),Blocks.ACACIA_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_BIRCH_SAPLING = registerBlock("glow_birch_sapling",
            new ModSaplingBlock(new GlowBirchSaplingGenerator(),Blocks.BIRCH_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_DARK_OAK_SAPLING = registerBlock("glow_dark_oak_sapling",
            new ModSaplingBlock(new GlowDarkOakSaplingGenerator(),Blocks.DARK_OAK_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_JUNGLE_SAPLING = registerBlock("glow_jungle_sapling",
            new ModSaplingBlock(new GlowJungleSaplingGenerator(),Blocks.JUNGLE_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_OAK_SAPLING = registerBlock("glow_oak_sapling",
            new ModSaplingBlock(new GlowOakSaplingGenerator(),Blocks.OAK_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);
    public static final Block GLOW_SPRUCE_SAPLING = registerBlock("glow_spruce_sapling",
            new ModSaplingBlock(new GlowSpruceSaplingGenerator(),Blocks.SPRUCE_SAPLING , 10), ModItemGroup.STORMLIGHT_BLOCKS);




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(StormlightMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return  Registry.register(Registry.ITEM, new Identifier(StormlightMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        StormlightMod.LOGGER.debug("Registering ModBlocks for " + StormlightMod.MOD_ID);
    }
}
