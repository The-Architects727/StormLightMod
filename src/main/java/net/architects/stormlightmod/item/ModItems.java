package net.architects.stormlightmod.item;

import net.architects.stormlightmod.entity.ModEntities;
import net.architects.stormlightmod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.architects.stormlightmod.StormlightMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item UNCUT_SAPPHIRE = registerItem("uncut_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_EMERALD = registerItem("uncut_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_SMOKESTONE = registerItem("uncut_smokestone",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_RUBY = registerItem("uncut_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_GARNET = registerItem("uncut_garnet",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_ZIRCON = registerItem("uncut_zircon",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_TOPAZ = registerItem("uncut_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item UNCUT_HELIODOR = registerItem("uncut_heliodor",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));

    public static final Item CUT_SAPPHIRE = registerItem("cut_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_SMOKESTONE = registerItem("cut_smokestone",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_RUBY = registerItem("cut_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_GARNET = registerItem("cut_garnet",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_DIAMOND = registerItem("cut_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_EMERALD = registerItem("cut_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_ZIRCON = registerItem("cut_zircon",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_AMETHYST = registerItem("cut_amethyst",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_TOPAZ = registerItem("cut_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));
    public static final Item CUT_HELIODOR = registerItem("cut_heliodor",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)));

    public static final Item SAPPHIRE_SPHERE = registerItem("sapphire_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item SMOKESTONE_SPHERE = registerItem("smokestone_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item RUBY_SPHERE = registerItem("ruby_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item GARNET_SPHERE = registerItem("garnet_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item DIAMOND_SPHERE = registerItem("diamond_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item EMERALD_SPHERE = registerItem("emerald_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item ZIRCON_SPHERE = registerItem("zircon_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item AMETHYST_SPHERE = registerItem("amethyst_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item TOPAZ_SPHERE = registerItem("topaz_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item HELIODOR_SPHERE = registerItem("heliodor_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item INFUSED_SAPPHIRE_SPHERE = registerItem("infused_sapphire_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_SMOKESTONE_SPHERE = registerItem("infused_smokestone_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_RUBY_SPHERE = registerItem("infused_ruby_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_GARNET_SPHERE = registerItem("infused_garnet_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_DIAMOND_SPHERE = registerItem("infused_diamond_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_EMERALD_SPHERE = registerItem("infused_emerald_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_ZIRCON_SPHERE = registerItem("infused_zircon_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_AMETHYST_SPHERE = registerItem("infused_amethyst_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_TOPAZ_SPHERE = registerItem("infused_topaz_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item INFUSED_HELIODOR_SPHERE = registerItem("infused_heliodor_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item VOID_INFUSED_SAPPHIRE_SPHERE = registerItem("void_infused_sapphire_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_SMOKESTONE_SPHERE = registerItem("void_infused_smokestone_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_RUBY_SPHERE = registerItem("void_infused_ruby_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_GARNET_SPHERE = registerItem("void_infused_garnet_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_DIAMOND_SPHERE = registerItem("void_infused_diamond_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_EMERALD_SPHERE = registerItem("void_infused_emerald_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_ZIRCON_SPHERE = registerItem("void_infused_zircon_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_AMETHYST_SPHERE = registerItem("void_infused_amethyst_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_TOPAZ_SPHERE = registerItem("void_infused_topaz_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));
    public static final Item VOID_INFUSED_HELIODOR_SPHERE = registerItem("void_infused_heliodor_sphere",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item CARAPACE_SWORD = registerItem("carapace_sword",
            new ModSwordItem(ModToolMaterials.CARAPACE, 3, -2, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_SHOVEL = registerItem("carapace_shovel",
            new ModShovelItem(ModToolMaterials.CARAPACE, 1, -3.0f, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_PICKAXE = registerItem("carapace_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CARAPACE, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_AXE = registerItem("carapace_axe",
            new ModAxeItem(ModToolMaterials.CARAPACE, 6, -3.1f, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_HOE = registerItem("carapace_hoe",
            new ModHoeItem(ModToolMaterials.CARAPACE, -2, -1.0f, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));

    public static final Item RAW_CREMLING_MEAT = registerItem("raw_cremling_meat",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(2f).build())));
    public static final Item COOKED_CREMLING_MEAT = registerItem("cooked_cremling_meat",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(10f).build())));
    public static final Item GUIDE_ROD = registerItem("guide_rod",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(1)));


    public static final Item OATHBRINGER = registerItem("oathbringer",
            new ModShardbladeItem(ModToolMaterials.SHARD, 5, 1f, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));

    //SHARDPLATE SETS
    //UNORNAMENTED
    public static final Item SHARDPLATE_HELM = registerItem("shardplate_helm",
            new ShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item SHARDPLATE_CHESTPLATE = registerItem("shardplate_chestplate",
            new ShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item SHARDPLATE_LEGGINGS = registerItem("shardplate_leggings",
            new ShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item SHARDPLATE_BOOTS = registerItem("shardplate_boots",
            new ShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //ORANGE
    public static final Item ORANGE_SHARDPLATE_HELM = registerItem("orange_shardplate_helm",
            new OrangeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item ORANGE_SHARDPLATE_CHESTPLATE = registerItem("orange_shardplate_chestplate",
            new OrangeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item ORANGE_SHARDPLATE_LEGGINGS = registerItem("orange_shardplate_leggings",
            new OrangeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item ORANGE_SHARDPLATE_BOOTS = registerItem("orange_shardplate_boots",
            new OrangeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //MAGENTA
    public static final Item MAGENTA_SHARDPLATE_HELM = registerItem("magenta_shardplate_helm",
            new MagentaShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item MAGENTA_SHARDPLATE_CHESTPLATE = registerItem("magenta_shardplate_chestplate",
            new MagentaShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item MAGENTA_SHARDPLATE_LEGGINGS = registerItem("magenta_shardplate_leggings",
            new MagentaShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item MAGENTA_SHARDPLATE_BOOTS = registerItem("magenta_shardplate_boots",
            new MagentaShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //LIME
    public static final Item LIME_SHARDPLATE_HELM = registerItem("lime_shardplate_helm",
            new LimeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIME_SHARDPLATE_CHESTPLATE = registerItem("lime_shardplate_chestplate",
            new LimeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIME_SHARDPLATE_LEGGINGS = registerItem("lime_shardplate_leggings",
            new LimeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIME_SHARDPLATE_BOOTS = registerItem("lime_shardplate_boots",
            new LimeShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //GREEN
    public static final Item GREEN_SHARDPLATE_HELM = registerItem("green_shardplate_helm",
            new GreenShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREEN_SHARDPLATE_CHESTPLATE = registerItem("green_shardplate_chestplate",
            new GreenShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREEN_SHARDPLATE_LEGGINGS = registerItem("green_shardplate_leggings",
            new GreenShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREEN_SHARDPLATE_BOOTS = registerItem("green_shardplate_boots",
            new GreenShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //LIGHT_BLUE
    public static final Item LIGHT_BLUE_SHARDPLATE_HELM = registerItem("light_blue_shardplate_helm",
            new LightBlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_BLUE_SHARDPLATE_CHESTPLATE = registerItem("light_blue_shardplate_chestplate",
            new LightBlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_BLUE_SHARDPLATE_LEGGINGS = registerItem("light_blue_shardplate_leggings",
            new LightBlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_BLUE_SHARDPLATE_BOOTS = registerItem("light_blue_shardplate_boots",
            new LightBlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //BLUE
    public static final Item BLUE_SHARDPLATE_HELM = registerItem("blue_shardplate_helm",
            new BlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLUE_SHARDPLATE_CHESTPLATE = registerItem("blue_shardplate_chestplate",
            new BlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLUE_SHARDPLATE_LEGGINGS = registerItem("blue_shardplate_leggings",
            new BlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLUE_SHARDPLATE_BOOTS = registerItem("blue_shardplate_boots",
            new BlueShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //RED
    public static final Item RED_SHARDPLATE_HELM = registerItem("red_shardplate_helm",
            new RedShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item RED_SHARDPLATE_CHESTPLATE = registerItem("red_shardplate_chestplate",
            new RedShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item RED_SHARDPLATE_LEGGINGS = registerItem("red_shardplate_leggings",
            new RedShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item RED_SHARDPLATE_BOOTS = registerItem("red_shardplate_boots",
            new RedShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //YELLOW
    public static final Item YELLOW_SHARDPLATE_HELM = registerItem("yellow_shardplate_helm",
            new YellowShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item YELLOW_SHARDPLATE_CHESTPLATE = registerItem("yellow_shardplate_chestplate",
            new YellowShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item YELLOW_SHARDPLATE_LEGGINGS = registerItem("yellow_shardplate_leggings",
            new YellowShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item YELLOW_SHARDPLATE_BOOTS = registerItem("yellow_shardplate_boots",
            new YellowShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //PINK
    public static final Item PINK_SHARDPLATE_HELM = registerItem("pink_shardplate_helm",
            new PinkShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PINK_SHARDPLATE_CHESTPLATE = registerItem("pink_shardplate_chestplate",
            new PinkShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PINK_SHARDPLATE_LEGGINGS = registerItem("pink_shardplate_leggings",
            new PinkShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PINK_SHARDPLATE_BOOTS = registerItem("pink_shardplate_boots",
            new PinkShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //CYAN
    public static final Item CYAN_SHARDPLATE_HELM = registerItem("cyan_shardplate_helm",
            new CyanShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CYAN_SHARDPLATE_CHESTPLATE = registerItem("cyan_shardplate_chestplate",
            new CyanShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CYAN_SHARDPLATE_LEGGINGS = registerItem("cyan_shardplate_leggings",
            new CyanShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CYAN_SHARDPLATE_BOOTS = registerItem("cyan_shardplate_boots",
            new CyanShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //PURPLE
    public static final Item PURPLE_SHARDPLATE_HELM = registerItem("purple_shardplate_helm",
            new PurpleShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PURPLE_SHARDPLATE_CHESTPLATE = registerItem("purple_shardplate_chestplate",
            new PurpleShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PURPLE_SHARDPLATE_LEGGINGS = registerItem("purple_shardplate_leggings",
            new PurpleShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item PURPLE_SHARDPLATE_BOOTS = registerItem("purple_shardplate_boots",
            new PurpleShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //BLACK
    public static final Item BLACK_SHARDPLATE_HELM = registerItem("black_shardplate_helm",
            new BlackShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLACK_SHARDPLATE_CHESTPLATE = registerItem("black_shardplate_chestplate",
            new BlackShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLACK_SHARDPLATE_LEGGINGS = registerItem("black_shardplate_leggings",
            new BlackShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BLACK_SHARDPLATE_BOOTS = registerItem("black_shardplate_boots",
            new BlackShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //BROWN
    public static final Item BROWN_SHARDPLATE_HELM = registerItem("brown_shardplate_helm",
            new BrownShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BROWN_SHARDPLATE_CHESTPLATE = registerItem("brown_shardplate_chestplate",
            new BrownShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BROWN_SHARDPLATE_LEGGINGS = registerItem("brown_shardplate_leggings",
            new BrownShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item BROWN_SHARDPLATE_BOOTS = registerItem("brown_shardplate_boots",
            new BrownShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //WHITE
    public static final Item WHITE_SHARDPLATE_HELM = registerItem("white_shardplate_helm",
            new WhiteShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item WHITE_SHARDPLATE_CHESTPLATE = registerItem("white_shardplate_chestplate",
            new WhiteShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item WHITE_SHARDPLATE_LEGGINGS = registerItem("white_shardplate_leggings",
            new WhiteShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item WHITE_SHARDPLATE_BOOTS = registerItem("white_shardplate_boots",
            new WhiteShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //GREY
    public static final Item GREY_SHARDPLATE_HELM = registerItem("grey_shardplate_helm",
            new GreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREY_SHARDPLATE_CHESTPLATE = registerItem("grey_shardplate_chestplate",
            new GreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREY_SHARDPLATE_LEGGINGS = registerItem("grey_shardplate_leggings",
            new GreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item GREY_SHARDPLATE_BOOTS = registerItem("grey_shardplate_boots",
            new GreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    //LIGHT_GREY
    public static final Item LIGHT_GREY_SHARDPLATE_HELM = registerItem("light_grey_shardplate_helm",
            new LightGreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_GREY_SHARDPLATE_CHESTPLATE = registerItem("light_grey_shardplate_chestplate",
            new LightGreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_GREY_SHARDPLATE_LEGGINGS = registerItem("light_grey_shardplate_leggings",
            new LightGreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item LIGHT_GREY_SHARDPLATE_BOOTS = registerItem("light_grey_shardplate_boots",
            new LightGreyShardplateArmorItem(ModArmorMaterials.SHARDPLATE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));

    public static final Item CARAPACE_HELM = registerItem("carapace_helm",
            new CarapaceArmorItem(ModArmorMaterials.CARAPACE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_CHESTPLATE = registerItem("carapace_chestplate",
            new CarapaceArmorItem(ModArmorMaterials.CARAPACE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_LEGGINGS = registerItem("carapace_leggings",
            new CarapaceArmorItem(ModArmorMaterials.CARAPACE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));
    public static final Item CARAPACE_BOOTS = registerItem("carapace_boots",
            new CarapaceArmorItem(ModArmorMaterials.CARAPACE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_EQUIPABLES).maxCount(1)));



    public static final Item CREMLING_SPAWN_EGG = registerItem("cremling_spawn_egg",
            new SpawnEggItem(ModEntities.CREMLING,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item SKY_EEL_SPAWN_EGG = registerItem("sky_eel_spawn_egg",
            new SpawnEggItem(ModEntities.SKY_EEL,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item CHULL_SPAWN_EGG = registerItem("chull_spawn_egg",
            new SpawnEggItem(ModEntities.CHULL,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item WARFORM_FEMALEN_SPAWN_EGG = registerItem("warform_femalen_spawn_egg",
            new SpawnEggItem(ModEntities.WARFORM_FEMALEN,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item WARFORM_MALEN_SPAWN_EGG = registerItem("warform_malen_spawn_egg",
            new SpawnEggItem(ModEntities.WARFORM_MALEN,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(16)));

    public static final Item ROCK_ILLUSION = registerItem("rock_illusion",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(1)));

    public static final Item OAK_TREE_ILLUSION = registerItem("oak_tree_illusion",
            new Item(new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StormlightMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StormlightMod.LOGGER.debug("Registering Mod Items for " + StormlightMod.MOD_ID);
    }
}
