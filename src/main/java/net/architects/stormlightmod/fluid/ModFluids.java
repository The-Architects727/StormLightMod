package net.architects.stormlightmod.fluid;

import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_SHADESMAR_BEADS;
    public static FlowableFluid FLOWING_SHADESMAR_BEADS;
    public static Block SHADESMAR_BEADS_BLOCK;
    public static Item SHADESMAR_BEADS_BUCKET;

    public static void register() {
        STILL_SHADESMAR_BEADS = Registry.register(Registry.FLUID,
                new Identifier(StormlightMod.MOD_ID, "shadesmar_beads"), new SoapWaterFluid.Still());
        FLOWING_SHADESMAR_BEADS = Registry.register(Registry.FLUID,
                new Identifier(StormlightMod.MOD_ID, "flowing_shadesmar_beads"), new SoapWaterFluid.Flowing());

        SHADESMAR_BEADS_BLOCK = Registry.register(Registry.BLOCK, new Identifier(StormlightMod.MOD_ID, "shadesmar_beads_block"),
                new FluidBlock(ModFluids.STILL_SHADESMAR_BEADS, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SHADESMAR_BEADS_BUCKET = Registry.register(Registry.ITEM, new Identifier(StormlightMod.MOD_ID, "shadesmar_beads_bucket"),
                new BucketItem(ModFluids.STILL_SHADESMAR_BEADS, new FabricItemSettings().group(ModItemGroup.STORMLIGHT_ITEMS).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
