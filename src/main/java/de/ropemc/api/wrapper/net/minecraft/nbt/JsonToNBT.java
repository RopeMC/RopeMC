package de.ropemc.api.wrapper.net.minecraft.nbt;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.JsonToNBT")
public interface JsonToNBT {

    int func_150310_b(String var0);

    String func_150311_c(String var0, boolean var1);

    int func_150312_a(String var0, char var1);

    String func_150313_b(String var0, boolean var1);

    String func_150314_a(String var0, boolean var1);

    //JsonToNBT$Any func_150316_a(String var0, String var1);

    String func_179269_a(String var0, int var1);

    //JsonToNBT$Any func_179270_a(String var0, boolean var1);

    boolean func_179271_b(String var0, int var1);

    //JsonToNBT$Any func_179272_a(String[] var0);

    NBTTagCompound getTagFromJson(String var0);

}
