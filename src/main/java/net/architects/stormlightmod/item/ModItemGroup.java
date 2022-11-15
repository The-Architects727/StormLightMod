package net.architects.stormlightmod.item;

import net.architects.stormlightmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.architects.stormlightmod.StormlightMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup STORMLIGHT_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(StormlightMod.MOD_ID, "stormlight_blocks"), () -> new ItemStack(ModBlocks.UNCUT_EMERALD_BLOCK));
    public static final ItemGroup STORMLIGHT_EQUIPABLES = FabricItemGroupBuilder.build(
            new Identifier(StormlightMod.MOD_ID, "stormlight_equipables"), () -> new ItemStack(ModItems.OATHBRINGER));
    public static final ItemGroup STORMLIGHT_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(StormlightMod.MOD_ID, "stormlight_items"), () -> new ItemStack(ModItems.UNCUT_SAPPHIRE));
}
