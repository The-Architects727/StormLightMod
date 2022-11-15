package net.architects.stormlightmod.recipe;

import net.architects.stormlightmod.StormlightMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(StormlightMod.MOD_ID, VoidlightInfuserRecipe.Serializer.ID),
                VoidlightInfuserRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(StormlightMod.MOD_ID, VoidlightInfuserRecipe.Type.ID),
                VoidlightInfuserRecipe.Type.INSTANCE);
    }
}