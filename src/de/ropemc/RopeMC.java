package de.ropemc;

import java.io.File;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import de.ropemc.api.Minecraft;
import de.ropemc.Mappings.MCVersion;
import de.ropemc.event.EventManager;
import de.ropemc.event.window.WindowTitleChangeEvent;
import de.ropemc.mods.ModManager;

public class RopeMC
{
	
	public static final Float ROPE_VERSION = 1.0F;
	public static MCVersion version;
	public static File rope_directory;
	public static File rope_mods_directory;
	public static File rope_config_directory;
	public static File rope_Mappings_directory;
	
	public static void premain(String args, Instrumentation instrumentation)
	{
		version = MCVersion.MC1_8_8;
		//creating folders
		rope_directory = new File("RopeMC");
		if(!rope_directory.exists()) rope_directory.mkdir();
		rope_mods_directory = new File(rope_directory,"Mods");
		if(!rope_mods_directory.exists()) rope_mods_directory.mkdir();
		rope_config_directory = new File(rope_directory,"Config");
		if(!rope_config_directory.exists()) rope_config_directory.mkdir();
		rope_Mappings_directory = new File(rope_directory, "Mappings");
		if(!rope_Mappings_directory.exists()) rope_Mappings_directory.mkdir();
		ModManager.loadModules(rope_mods_directory);
		instrumentation.addTransformer(new ClassFileTransformer()
		{
			public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException
			{
				if("org/lwjgl/opengl/Display".equals(s))
				{
					try {
                        ClassPool cp = ClassPool.getDefault();
                        CtClass cc = cp.get("org.lwjgl.opengl.Display");
                        CtMethod m = cc.getDeclaredMethod("setTitle");
                        m.insertBefore("{de.ropemc.RopeMC.setTitleHook(newTitle);return;}");
                        byte[] byteCode = cc.toBytecode();
                        cc.detach();
                        return byteCode;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
				}
				if(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP").equals(s))
				{
					try {
                        ClassPool cp = ClassPool.getDefault();
                        CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP"));
                        CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "onLivingUpdate"));
                        m.insertBefore("de.ropemc.event.EventManager.callEvent(new de.ropemc.event.player.PlayerUpdateEvent());");
                        byte[] byteCode = cc.toBytecode();
                        cc.detach();
                        return byteCode;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
				}
				return null;
			}
		});
	}

	public static void setTitleHook(String title)
	{
		WindowTitleChangeEvent e = new WindowTitleChangeEvent(title);
		EventManager.callEvent(e);
		if(!e.isCancelled())
		{
			//Minecraft.setWindowTitle(e.getTitle());
		}
		Minecraft.setWindowTitle("RopeMC v" + RopeMC.ROPE_VERSION + " ("+Minecraft.getMinecraftVersion()+") [" + ModManager.getModules().size() + " mods loaded]");
	}
	
}
