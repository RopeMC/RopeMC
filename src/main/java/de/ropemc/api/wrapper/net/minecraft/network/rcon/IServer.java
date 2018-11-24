package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.IServer")
public interface IServer {

    String[] getAllUsernames();

    int getCurrentPlayerCount();

    String getFolderName();

    String getHostname();

    int getIntProperty(String var0, int var1);

    int getMaxPlayers();

    String getMinecraftVersion();

    String getMotd();

    String getPlugins();

    int getPort();

    String getSettingsFilename();

    String getStringProperty(String var0, String var1);

    String handleRConCommand(String var0);

    boolean isDebuggingEnabled();

    void logDebug(String var0);

    void logInfo(String var0);

    void logSevere(String var0);

    void logWarning(String var0);

    void saveProperties();

    void setProperty(String var0, Object var1);

}
