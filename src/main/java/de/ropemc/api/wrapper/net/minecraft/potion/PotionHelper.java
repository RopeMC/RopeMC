package de.ropemc.api.wrapper.net.minecraft.potion;

import java.util.Collection;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.PotionHelper")
public interface PotionHelper {

    int applyIngredient(int var0, String var1);

    int brewBitOperations(int var0, int var1, boolean var2, boolean var3, boolean var4);

    int calcPotionLiquidColor(Collection var0);

    boolean checkFlag(int var0, int var1);

    int countSetFlags(int var0);

    int func_77904_a(boolean var0, boolean var1, boolean var2, int var3, int var4, int var5, int var6);

    int func_77908_a(int var0, int var1, int var2, int var3, int var4, int var5);

    boolean getAreAmbient(Collection var0);

    int getLiquidColor(int var0, boolean var1);

    List getPotionEffects(int var0, boolean var1);

    String getPotionPrefix(int var0);

    int getPotionPrefixIndex(int var0);

    int isFlagSet(int var0, int var1);

    int isFlagUnset(int var0, int var1);

    int parsePotionEffects(String var0, int var1, int var2, int var3);

}
