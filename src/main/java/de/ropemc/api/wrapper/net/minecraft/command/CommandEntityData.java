package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandEntityData")
public interface CommandEntityData {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    boolean isUsernameIndex(String[] var0, int var1);

    void processCommand(ICommandSender var0, String[] var1);

}
