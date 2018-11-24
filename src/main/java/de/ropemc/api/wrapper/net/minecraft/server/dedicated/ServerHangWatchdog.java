package de.ropemc.api.wrapper.net.minecraft.server.dedicated;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.dedicated.ServerHangWatchdog")
public interface ServerHangWatchdog {

    void scheduleHalt();

}
