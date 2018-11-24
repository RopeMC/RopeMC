package de.ropemc.api.wrapper.net.minecraft.command.server;

import de.ropemc.api.wrapper.net.minecraft.command.ICommandSender;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.server.CommandPublishLocalServer")
public interface CommandPublishLocalServer {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    void processCommand(ICommandSender var0, String[] var1);

}
