package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
//import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats$Type;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConConsoleSource")
public interface RConConsoleSource {

    void addChatMessage(IChatComponent var0);

    boolean canCommandSenderUseCommand(int var0, String var1);

    Entity getCommandSenderEntity();

    IChatComponent getDisplayName();

    World getEntityWorld();

    RConConsoleSource getInstance();

    String getLogContents();

    String getName();

    BlockPos getPosition();

    Vec3 getPositionVector();

    void resetLog();

    boolean sendCommandFeedback();

    //void setCommandStat(CommandResultStats$Type var0, int var1);

}
