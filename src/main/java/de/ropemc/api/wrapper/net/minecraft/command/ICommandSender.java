package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.ICommandSender")
public interface ICommandSender {

    void addChatMessage(IChatComponent var0);

    boolean canCommandSenderUseCommand(int var0, String var1);

    Entity getCommandSenderEntity();

    IChatComponent getDisplayName();

    World getEntityWorld();

    String getName();

    BlockPos getPosition();

    Vec3 getPositionVector();

    boolean sendCommandFeedback();

    //void setCommandStat(CommandResultStats$Type var0, int var1);

}
