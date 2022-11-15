package net.architects.stormlightmod.item.custom;

import com.google.common.collect.ImmutableMap;
import net.architects.stormlightmod.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP1 =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.SHARDPLATE,
                            new StatusEffectInstance(StatusEffects.STRENGTH, 100, 2)).build();

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP2 =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.SHARDPLATE,
                            new StatusEffectInstance(StatusEffects.SPEED, 100, 2)).build();

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP3 =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.SHARDPLATE,
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 3)).build();

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;
                if(!hasElytraOn(player) && hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP1.entrySet()) {
            ArmorMaterial mapArmorMaterial1 = entry.getKey();
            StatusEffectInstance mapStatusEffect1 = entry.getValue();

            if(!hasElytraOn(player) && hasCorrectArmorOn(mapArmorMaterial1, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial1, mapStatusEffect1);
            }
        }
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP2.entrySet()) {
            ArmorMaterial mapArmorMaterial2 = entry.getKey();
            StatusEffectInstance mapStatusEffect2 = entry.getValue();

            if(!hasElytraOn(player) && hasCorrectArmorOn(mapArmorMaterial2, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial2, mapStatusEffect2);
            }
        }
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP3.entrySet()) {
            ArmorMaterial mapArmorMaterial3 = entry.getKey();
            StatusEffectInstance mapStatusEffect3 = entry.getValue();

            if(!hasElytraOn(player) && hasCorrectArmorOn(mapArmorMaterial3, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial3, mapStatusEffect3);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());

            if(!hasElytraOn(player) && hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
                player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                        mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));

                // if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
                //     player.getInventory().damageArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
                // }
            }

    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }

    private boolean hasElytraOn(PlayerEntity player) {
        Item chest = ((Item)player.getInventory().getArmorStack(2).getItem());
        ElytraItem elytraItem = (ElytraItem)(Items.ELYTRA);
        return chest == elytraItem;
    }

}
