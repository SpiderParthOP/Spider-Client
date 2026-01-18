package com.spiderclient;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import com.spiderclient.fps.DynamicScaler;

@Override
public void onInitialize() {
    FPSController.init();

    ClientTickEvents.END_CLIENT_TICK.register(client -> {
        DynamicScaler.tick();
    });

    System.out.println("[SpiderClient] FPS Core Initialized");
}
