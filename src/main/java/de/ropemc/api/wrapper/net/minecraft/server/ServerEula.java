package de.ropemc.api.wrapper.net.minecraft.server;

import java.io.File;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.ServerEula")
public interface ServerEula {

    void createEULAFile();

    boolean hasAcceptedEULA();

    boolean loadEULAFile(File var0);

}
