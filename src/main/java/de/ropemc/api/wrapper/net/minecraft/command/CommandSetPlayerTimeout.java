package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandSetPlayerTimeout")
public interface CommandSetPlayerTimeout {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

}
