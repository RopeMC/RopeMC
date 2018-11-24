package de.ropemc.api.wrapper.net.minecraft.init;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.init.Bootstrap")
public interface Bootstrap {

    boolean isRegistered();

    void printToSYSOUT(String var0);

    void redirectOutputToLog();

    void register();

    void registerDispenserBehaviors();

}
