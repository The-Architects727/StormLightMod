package net.architects.stormlightmod.world.gen;

public class ModWorldGen {
    public static void generateWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();

        ModEntitySpawn.addEntitySpawn();
    }
}