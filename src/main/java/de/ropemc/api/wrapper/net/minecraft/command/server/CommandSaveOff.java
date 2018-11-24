package de.ropemc.api.wrapper.net.minecraft.command.server;

import de.ropemc.api.wrapper.net.minecraft.command.ICommandSender;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.server.CommandSaveOff")
public interface CommandSaveOff {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    void processCommand(ICommandSender var0, String[] var1);

}
