package de.ropemc.api.wrapper.net.minecraft.server.dedicated;

import java.io.File;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.dedicated.PropertyManager")
public interface PropertyManager {

    void generateNewProperties();

    boolean getBooleanProperty(String var0, boolean var1);

    int getIntProperty(String var0, int var1);

    long getLongProperty(String var0, long var1);

    File getPropertiesFile();

    String getStringProperty(String var0, String var1);

    void saveProperties();

    void setProperty(String var0, Object var1);

}
