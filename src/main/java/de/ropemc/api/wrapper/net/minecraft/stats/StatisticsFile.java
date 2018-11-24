package de.ropemc.api.wrapper.net.minecraft.stats;

import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.StatisticsFile")
public interface StatisticsFile {

    String dumpJson(Map var0);

    void func_150876_a(EntityPlayerMP var0);

    void func_150877_d();

    Set func_150878_c();

    boolean func_150879_e();

    Map parseJson(String var0);

    void readStatFile();

    void saveStatFile();

    void sendAchievements(EntityPlayerMP var0);

    void unlockAchievement(EntityPlayer var0, StatBase var1, int var2);

}
