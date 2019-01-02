package de.ropemc;

import de.ropemc.Mappings.MCVersion;
import de.ropemc.api.event.EventHandler;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.event.Listener;
import de.ropemc.api.event.game.GameStartEvent;
import de.ropemc.api.event.instrumentation.InjectionEvent;
import de.ropemc.api.event.player.PlayerUpdateEvent;
import de.ropemc.api.inject.InjectionTransformer;
import de.ropemc.api.wrapper.WrapperSystem;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.mods.ModManager;
import de.ropemc.utils.VersionFile;

import java.io.File;
import java.lang.instrument.Instrumentation;

public class RopeMC implements Listener {
    private static RopeMC instance;
    public static final String ROPE_VERSION = "0.0.1";
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
    public static void premain(String args, Instrumentation instrumentation) {
        instance = new RopeMC();
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
        EventManager.registerListener(instance);
        InjectionEvent injectionEvent = new InjectionEvent();
        EventManager.callEvent(injectionEvent);
        instrumentation.addTransformer(new InjectionTransformer(injectionEvent.getInjectors()));

        instrumentation.addTransformer(new DeprecatedTransformer());
    }

    @EventHandler
    private void onGameStart(GameStartEvent event) {
        WrapperSystem.init();
        Minecraft.setWindowTitle("RopeMC v" + RopeMC.ROPE_VERSION + " (" + de.ropemc.api.wrapper.net.minecraft.client.Minecraft.getTheMinecraft().getLaunchedVersion() + ") [" + ModManager.getModules().size() + " mods loaded]");
    }

    @EventHandler
    private void onInject(InjectionEvent event) {
        event.add(PlayerUpdateEvent.PlayerUpdateEventInjector.class);
    }
}
