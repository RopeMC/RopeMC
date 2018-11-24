package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.ServerCommandManager")
public interface ServerCommandManager {

    void notifyOperators(ICommandSender var0, ICommand var1, int var2, String var3, Object[] var4);

}
