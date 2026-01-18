package com.spiderclient.fps;

import net.minecraft.client.MinecraftClient;

public class FPSController {

    private static final MinecraftClient mc = MinecraftClient.getInstance();
    private static int targetFPS;

    public static void init() {
        targetFPS = SystemDetector.getTargetFPS();
        applySafeSettings();
    }

    private static void applySafeSettings() {
        if (mc.options == null) return;

        mc.options.getViewDistance().setValue(8);
        mc.options.getSimulationDistance().setValue(6);
        mc.options.getCloudRenderMode().setValue(
                net.minecraft.client.option.CloudRenderMode.OFF
        );

        mc.options.getMaxFps().setValue(targetFPS);
    }
}
