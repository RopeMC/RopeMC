package de.ropemc.api.wrapper.net.minecraft.profiler;

import java.util.Map;
import java.net.URL;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.profiler.PlayerUsageSnooper")
public interface PlayerUsageSnooper {

    //IPlayerUsage access$000(PlayerUsageSnooper var0);

    //Object access$100(PlayerUsageSnooper var0);

    //Map access$200(PlayerUsageSnooper var0);

    //int access$300(PlayerUsageSnooper var0);

    //int access$308(PlayerUsageSnooper var0);

    //Map access$400(PlayerUsageSnooper var0);

    //String access$500(PlayerUsageSnooper var0);

    //URL access$600(PlayerUsageSnooper var0);

    void addClientStat(String var0, Object var1);

    void addJvmArgsToSnooper();

    void addMemoryStatsToSnooper();

    void addStatToSnooper(String var0, Object var1);

    void func_152766_h();

    Map getCurrentStats();

    long getMinecraftStartTimeMillis();

    String getUniqueID();

    boolean isSnooperRunning();

    void startSnooper();

    void stopSnooper();

}
