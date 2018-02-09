package de.ropemc.utils;

public class RuntimeInfo
{
    private static Runtime mcrt = Runtime.getRuntime();

    public static Long getMaxMemory()
    {
        return mcrt.maxMemory();
    }

    public static Long getFreeMemory()
    {
        return mcrt.freeMemory();
    }

    public static Long getUsedMemory()
    {
        return mcrt.totalMemory();
    }

    public static int getAvailableProcessors()
    {
        return mcrt.availableProcessors();
    }

}
