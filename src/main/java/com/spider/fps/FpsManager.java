package com.spider.fps;

import net.minecraft.client.MinecraftClient;

public class FpsManager {

    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static void applyBasicBoost() {
        if (mc.options == null) return;

        // Reduce background usage
        mc.options.maxFps = 120;

        // Disable expensive visuals
        mc.options.cloudRenderMode = net.minecraft.client.option.CloudRenderMode.OFF;
        mc.options.graphicsMode = net.minecraft.client.option.GraphicsMode.FAST;
        mc.options.particles = net.minecraft.client.option.ParticlesMode.MINIMAL;

        // Disable vsync
        mc.options.enableVsync = false;
    }
}
