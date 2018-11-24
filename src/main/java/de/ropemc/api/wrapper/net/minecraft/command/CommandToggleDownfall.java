package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandToggleDownfall")
public interface CommandToggleDownfall {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

    void toggleDownfall();

}
