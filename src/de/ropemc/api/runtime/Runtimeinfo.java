package de.ropemc.api.runtime;

public class Runtimeinfo {
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
