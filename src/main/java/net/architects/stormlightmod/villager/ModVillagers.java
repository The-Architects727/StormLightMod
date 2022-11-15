package net.architects.stormlightmod.villager;

import net.architects.stormlightmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

import java.util.List;

public class ModVillagers {
    public static void registerTrades() {




            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,1,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(ModItems.SHARDPLATE_BOOTS, 5),
                                6, 2, 0.02f
                        )));
                    });
    }
}
