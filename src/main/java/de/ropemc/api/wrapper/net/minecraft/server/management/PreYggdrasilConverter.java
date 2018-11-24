package de.ropemc.api.wrapper.net.minecraft.server.management;

//import org.apache.logging.log4j.Logger;
import java.util.Date;
import java.io.File;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.net.minecraft.server.dedicated.DedicatedServer;
import de.ropemc.api.wrapper.net.minecraft.server.dedicated.PropertyManager;
import java.util.Collection;
//import com.mojang.authlib.ProfileLookupCallback;
import java.util.Map;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.PreYggdrasilConverter")
public interface PreYggdrasilConverter {

    //Logger access$000();

    //Date access$200(String var0, Date var1);

    //void access$400(File var0);

    void backupConverted(File var0);

    //boolean convertIpBanlist(MinecraftServer var0);

    //boolean convertOplist(MinecraftServer var0);

    boolean convertSaveFiles(DedicatedServer var0, PropertyManager var1);

    //boolean convertUserBanlist(MinecraftServer var0);

    //boolean convertWhitelist(MinecraftServer var0);

    File getPlayersDirectory(PropertyManager var0);

    String getStringUUIDFromName(String var0);

    boolean hasUnconvertableFiles(PropertyManager var0);

    boolean hasUnconvertablePlayerFiles(PropertyManager var0);

    //void lookupNames(MinecraftServer var0, Collection var1, ProfileLookupCallback var2);

    void mkdir(File var0);

    Date parseDate(String var0, Date var1);

    List readFile(File var0, Map var1);

    boolean tryConvert(PropertyManager var0);

}
