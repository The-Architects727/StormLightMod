package net.architects.stormlightmod.world.dimension;

import net.architects.stormlightmod.StormlightMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;


public class ModDimensions {
    public static final RegistryKey<World> BRAIZE_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(StormlightMod.MOD_ID, "braize"));
    public static final RegistryKey<DimensionType> BRAIZE_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, BRAIZE_DIMENSION_KEY.getValue());

    public static void register() {
        StormlightMod.LOGGER.debug("Registering ModDimensions for " + StormlightMod.MOD_ID);
    }
}
