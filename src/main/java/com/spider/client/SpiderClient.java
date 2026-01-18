package com.spider.client;

import net.fabricmc.api.ClientModInitializer;

public class SpiderClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("[Spider Client] Initialized successfully (1.21.x)");
    }
}