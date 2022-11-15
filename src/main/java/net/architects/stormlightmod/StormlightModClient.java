package net.architects.stormlightmod;

import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.entity.ModEntities;
import net.architects.stormlightmod.entity.client.*;
import net.architects.stormlightmod.entity.client.armor.*;
import net.architects.stormlightmod.fluid.ModFluids;
import net.architects.stormlightmod.item.ModItems;
import net.architects.stormlightmod.screen.ModScreenHandlers;
import net.architects.stormlightmod.screen.VoidlightInfuserBlockScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class StormlightModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SHADESMAR_BEADS, ModFluids.FLOWING_SHADESMAR_BEADS,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1E038D0
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SHADESMAR_BEADS, ModFluids.FLOWING_SHADESMAR_BEADS);

        HandledScreens.register(ModScreenHandlers.VOIDLIGHT_INFUSER_SCREEN_HANDLER, VoidlightInfuserBlockScreen::new);

        GeoArmorRenderer.registerArmorRenderer(new ShardplateArmorRenderer(), ModItems.SHARDPLATE_BOOTS,
                ModItems.SHARDPLATE_LEGGINGS, ModItems.SHARDPLATE_CHESTPLATE, ModItems.SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new OrangeShardplateArmorRenderer(), ModItems.ORANGE_SHARDPLATE_BOOTS,
                ModItems.ORANGE_SHARDPLATE_LEGGINGS, ModItems.ORANGE_SHARDPLATE_CHESTPLATE, ModItems.ORANGE_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new MagentaShardplateArmorRenderer(), ModItems.MAGENTA_SHARDPLATE_BOOTS,
                ModItems.MAGENTA_SHARDPLATE_LEGGINGS, ModItems.MAGENTA_SHARDPLATE_CHESTPLATE, ModItems.MAGENTA_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new LimeShardplateArmorRenderer(), ModItems.LIME_SHARDPLATE_BOOTS,
                ModItems.LIME_SHARDPLATE_LEGGINGS, ModItems.LIME_SHARDPLATE_CHESTPLATE, ModItems.LIME_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new GreenShardplateArmorRenderer(), ModItems.GREEN_SHARDPLATE_BOOTS,
                ModItems.GREEN_SHARDPLATE_LEGGINGS, ModItems.GREEN_SHARDPLATE_CHESTPLATE, ModItems.GREEN_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new LightBlueShardplateArmorRenderer(), ModItems.LIGHT_BLUE_SHARDPLATE_BOOTS,
                ModItems.LIGHT_BLUE_SHARDPLATE_LEGGINGS, ModItems.LIGHT_BLUE_SHARDPLATE_CHESTPLATE, ModItems.LIGHT_BLUE_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new BlueShardplateArmorRenderer(), ModItems.BLUE_SHARDPLATE_BOOTS,
                ModItems.BLUE_SHARDPLATE_LEGGINGS, ModItems.BLUE_SHARDPLATE_CHESTPLATE, ModItems.BLUE_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new RedShardplateArmorRenderer(), ModItems.RED_SHARDPLATE_BOOTS,
                ModItems.RED_SHARDPLATE_LEGGINGS, ModItems.RED_SHARDPLATE_CHESTPLATE, ModItems.RED_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new YellowShardplateArmorRenderer(), ModItems.YELLOW_SHARDPLATE_BOOTS,
                ModItems.YELLOW_SHARDPLATE_LEGGINGS, ModItems.YELLOW_SHARDPLATE_CHESTPLATE, ModItems.YELLOW_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new PinkShardplateArmorRenderer(), ModItems.PINK_SHARDPLATE_BOOTS,
                ModItems.PINK_SHARDPLATE_LEGGINGS, ModItems.PINK_SHARDPLATE_CHESTPLATE, ModItems.PINK_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new CyanShardplateArmorRenderer(), ModItems.CYAN_SHARDPLATE_BOOTS,
                ModItems.CYAN_SHARDPLATE_LEGGINGS, ModItems.CYAN_SHARDPLATE_CHESTPLATE, ModItems.CYAN_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new PurpleShardplateArmorRenderer(), ModItems.PURPLE_SHARDPLATE_BOOTS,
                ModItems.PURPLE_SHARDPLATE_LEGGINGS, ModItems.PURPLE_SHARDPLATE_CHESTPLATE, ModItems.PURPLE_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new BlackShardplateArmorRenderer(), ModItems.BLACK_SHARDPLATE_BOOTS,
                ModItems.BLACK_SHARDPLATE_LEGGINGS, ModItems.BLACK_SHARDPLATE_CHESTPLATE, ModItems.BLACK_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new BrownShardplateArmorRenderer(), ModItems.BROWN_SHARDPLATE_BOOTS,
                ModItems.BROWN_SHARDPLATE_LEGGINGS, ModItems.BROWN_SHARDPLATE_CHESTPLATE, ModItems.BROWN_SHARDPLATE_HELM);

        GeoArmorRenderer.registerArmorRenderer(new WhiteShardplateArmorRenderer(), ModItems.WHITE_SHARDPLATE_BOOTS,
                ModItems.WHITE_SHARDPLATE_LEGGINGS, ModItems.WHITE_SHARDPLATE_CHESTPLATE, ModItems.WHITE_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new GreyShardplateArmorRenderer(), ModItems.GREY_SHARDPLATE_BOOTS,
                ModItems.GREY_SHARDPLATE_LEGGINGS, ModItems.GREY_SHARDPLATE_CHESTPLATE, ModItems.GREY_SHARDPLATE_HELM);
        GeoArmorRenderer.registerArmorRenderer(new LightGreyShardplateArmorRenderer(), ModItems.LIGHT_GREY_SHARDPLATE_BOOTS,
                ModItems.LIGHT_GREY_SHARDPLATE_LEGGINGS, ModItems.LIGHT_GREY_SHARDPLATE_CHESTPLATE, ModItems.LIGHT_GREY_SHARDPLATE_HELM);



        GeoArmorRenderer.registerArmorRenderer(new CarapaceArmorRenderer(), ModItems.CARAPACE_BOOTS,
                ModItems.CARAPACE_LEGGINGS, ModItems.CARAPACE_CHESTPLATE, ModItems.CARAPACE_HELM);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_DARK_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_SPRUCE_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_DARK_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_SPRUCE_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.CREMLING, CremlingRenderer::new);
        EntityRendererRegistry.register(ModEntities.CHULL, ChullRenderer::new);
        EntityRendererRegistry.register(ModEntities.WARFORM_FEMALEN, WarformFemalenRenderer::new);
        EntityRendererRegistry.register(ModEntities.WARFORM_MALEN, WarformMalenRenderer::new);
        EntityRendererRegistry.register(ModEntities.SKY_EEL, SkyEelRenderer::new);



    }
}
