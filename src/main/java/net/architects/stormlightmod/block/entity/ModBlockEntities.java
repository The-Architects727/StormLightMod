package net.architects.stormlightmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<VoidlightInfuserBlockEntity> VOIDLIGHT_INFUSER_BLOCK;

    public static void registerBlockEntities() {
        VOIDLIGHT_INFUSER_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(StormlightMod.MOD_ID, "voidlight_infuser"),
                FabricBlockEntityTypeBuilder.create(VoidlightInfuserBlockEntity::new,
                        ModBlocks.VOIDLIGHT_INFUSER_BLOCK).build(null));
    }
}
