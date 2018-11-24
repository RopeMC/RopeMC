package de.ropemc.api.wrapper.net.minecraft.profiler;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.profiler.Profiler")
public interface Profiler {

    void clearProfiling();

    void endSection();

    void endStartSection(String var0);

    String getNameOfLastSection();

    List getProfilingData(String var0);

    void startSection(String var0);

}
