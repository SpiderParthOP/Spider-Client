package com.spiderclient.util;

public class SafeScheduler {

    private static long lastRun = 0;

    public static boolean canRun(long delayMs) {
        long now = System.currentTimeMillis();
        if (now - lastRun >= delayMs) {
            lastRun = now;
            return true;
        }
        return false;
    }
}
