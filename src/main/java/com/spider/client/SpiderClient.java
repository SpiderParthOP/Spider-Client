package com.spider.client;

import net.fabricmc.api.ModInitializer;
import com.spiderclient.fps.FPSController;

public class SpiderClient implements ModInitializer {

    public static final String MOD_ID = "spiderclient";

    @Override
    public void onInitialize() {
        FPSController.init();
        System.out.println("[SpiderClient] FPS Core Initialized");
    }
}
