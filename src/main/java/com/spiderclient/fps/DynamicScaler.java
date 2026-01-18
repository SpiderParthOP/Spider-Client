package com.spiderclient.fps;

import net.minecraft.client.MinecraftClient;

public class DynamicScaler {

    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static void tick() {
        if (mc.getCurrentFps() < 40) {
            mc.options.getViewDistance().setValue(6);
        } else if (mc.getCurrentFps() > 100) {
            mc.options.getViewDistance().setValue(10);
        }
    }
}
