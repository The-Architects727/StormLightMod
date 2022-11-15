package net.architects.stormlightmod.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import java.util.function.ToIntFunction;

public class Glowing_Leaves extends LeavesBlock{
    public Glowing_Leaves(Block block, int light) {
        super(FabricBlockSettings.copyOf(block).nonOpaque().luminance(createLightLevel(light)));

    }

    private static ToIntFunction<BlockState> createLightLevel(int light) {
        return (state) -> {
            return light;
        };
    }




}