package net.architects.stormlightmod.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<VoidlightInfuserBlockScreenHandler> VOIDLIGHT_INFUSER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        VOIDLIGHT_INFUSER_SCREEN_HANDLER = new ScreenHandlerType<>(VoidlightInfuserBlockScreenHandler::new);
    }
}
