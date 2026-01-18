package com.spiderclient.fps;

public class SystemDetector {

    public static boolean isAndroid() {
        String runtime = System.getProperty("java.runtime.name");
        return runtime != null && runtime.toLowerCase().contains("android");
    }

    public static int getTargetFPS() {
        if (isAndroid()) return 60;
        return 144;
    }
}
