package net.architects.stormlightmod.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;

import java.util.function.ToIntFunction;

public class ModSaplingBlock extends SaplingBlock {
    public ModSaplingBlock(SaplingGenerator generator, Block block, int light) {
        super(generator, FabricBlockSettings.copyOf(block).nonOpaque().luminance(createLightLevel(light)));
    }

    private static ToIntFunction<BlockState> createLightLevel(int light) {
        return (state) -> {
            return light;
        };
    }
}
