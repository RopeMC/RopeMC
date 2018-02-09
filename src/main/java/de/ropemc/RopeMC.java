package de.ropemc;

import de.ropemc.Mappings.MCVersion;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.event.instrumentation.InstrumentationEvent;
import de.ropemc.mods.ModManager;
import de.ropemc.utils.VersionFile;

import java.io.File;
import java.lang.instrument.Instrumentation;

public class RopeMC
{

    public static final Float ROPE_VERSION = 1.0F;
    public static MCVersion version;
    public static File ropeDirectory;
    public static File ropeModsDirectory;
    public static File ropeConfigDirectory;
    public static File ropeMappingsDirectory;
    public static File ropeModDataDirectory;
    public static VersionFile versions;

    /**
     * project main-class, executed before minecraft is started
     *
     * @param args
     * @param instrumentation
     */
    public static void premain(String args, Instrumentation instrumentation)
    {
        version = MCVersion.MC1_8_8;
        //creating folders
        ropeDirectory = new File("RopeMC");
        if (!ropeDirectory.exists()) ropeDirectory.mkdir();

        ropeModsDirectory = new File(ropeDirectory, "Mods");
        if (!ropeModsDirectory.exists()) ropeModsDirectory.mkdir();

        ropeConfigDirectory = new File(ropeDirectory, "Config");
        if (!ropeConfigDirectory.exists()) ropeConfigDirectory.mkdir();

        ropeMappingsDirectory = new File(ropeDirectory, "Mappings");
        if (!ropeMappingsDirectory.exists()) ropeMappingsDirectory.mkdir();

        ropeModDataDirectory = new File(ropeDirectory, "ModData");
        if (!ropeModDataDirectory.exists()) ropeModDataDirectory.mkdir();

        versions = new VersionFile(new File(ropeDirectory, "versions.json"));
        Mappings.load();
        ModManager.loadModules(ropeModsDirectory);
        EventManager.callEvent(new InstrumentationEvent(instrumentation));
        instrumentation.addTransformer(new Transformer());
    }
}
