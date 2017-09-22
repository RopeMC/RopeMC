package de.ropemc.utils;

public class RuntimeInfo {
    public static Runtime mcrt = Runtime.getRuntime();

    public static Long getMaxMemory() {
        return mcrt.maxMemory();
    }

    public static Long getFreeMemory() {
        return mcrt.freeMemory();
    }

    public static Long getUsedMemory() {
        return mcrt.totalMemory();
    }
}
