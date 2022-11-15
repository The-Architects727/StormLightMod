package net.architects.stormlightmod;

import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.block.entity.ModBlockEntities;
import net.architects.stormlightmod.fluid.ModFluids;
import net.architects.stormlightmod.recipe.ModRecipes;
import net.architects.stormlightmod.screen.ModScreenHandlers;
import net.architects.stormlightmod.util.ModRegistries;
import net.architects.stormlightmod.villager.ModVillagers;
import net.architects.stormlightmod.world.dimension.ModDimensions;
import net.architects.stormlightmod.world.feature.ModConfiguredFeatures;
import net.architects.stormlightmod.world.gen.ModOreGeneration;
import net.architects.stormlightmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.architects.stormlightmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

// Very important comment
public class StormlightMod implements ModInitializer {
	public static final String MOD_ID = "stormlightmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateWorldGen();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerAllScreenHandlers();

		ModDimensions.register();

		ModRecipes.registerRecipes();

		ModRegistries.registerModStuffs();

		GeckoLib.initialize();

		ModFluids.register();

		ModVillagers.registerTrades();

	}
}
