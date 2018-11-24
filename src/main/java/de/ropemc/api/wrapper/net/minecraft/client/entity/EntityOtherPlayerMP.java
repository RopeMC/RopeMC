package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.entity.EntityOtherPlayerMP")
public interface EntityOtherPlayerMP {

    void addChatMessage(IChatComponent var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canCommandSenderUseCommand(int var0, String var1);

    BlockPos getPosition();

    void onLivingUpdate();

    void onUpdate();

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

}
