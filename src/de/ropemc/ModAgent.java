package de.ropemc;

import java.io.File;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import de.ropemc.Mappings.MCVersion;
import de.ropemc.api.Minecraft;
import de.ropemc.event.EventManager;
import de.ropemc.event.window.WindowTitleChangeEvent;
import de.ropemc.mods.ModManager;

public class ModAgent
{
	
	public static final Float ROPE_VERSION = 1.0F;
	public static MCVersion version;
	public static File rope_directory;
	public static File rope_mods_directory;
	public static File rope_config_directory;
	
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
		ModManager.loadModules(rope_mods_directory);
		instrumentation.addTransformer(new ClassFileTransformer()
		{
			public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException
			{
				if("org/lwjgl/opengl/Display".equals(s))
				{
					ClassReader reader = new ClassReader(bytes);
					ClassWriter writer = new ClassWriter(reader, 0);
					JaTestVisitor visitor = new JaTestVisitor(writer);
					reader.accept(visitor, 0);
					return writer.toByteArray();
				}
				return null;
			}
		});
	}

	public static void setTitleHook()
	{
		WindowTitleChangeEvent e = new WindowTitleChangeEvent("Debug");
		EventManager.callEvent(e);
		if(!e.isCancelled())
		{
			Minecraft.setWindowTitle(e.getTitle());
		}
	}

	public static class JaTestVisitor extends ClassVisitor
	{

		public JaTestVisitor(ClassWriter writer)
		{
			super(Opcodes.ASM4, writer);
		}

		public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
		{
			super.visit(version, access, name, signature, superName, interfaces);
		}

		public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
	        //System.out.println(" " + name + desc);
	        if(name.equals("setTitle"))return new SetTitleMethodVisitor(super.visitMethod(access, name, desc, signature, exceptions));
	        return super.visitMethod(access, name, desc, signature, exceptions);
	    }

		public void visitEnd()
		{
			super.visitEnd();
		}

	}

	public static class SetTitleMethodVisitor extends MethodVisitor
	{

		public void visitCode()
		{
			//mv.visitInsn(Opcodes.RETURN);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, "de/ropemc/ModAgent", "setTitleHook", "()V", false);
			mv.visitInsn(Opcodes.RETURN);
		}
		
		
		
		public SetTitleMethodVisitor(MethodVisitor mv)
		{
			super(Opcodes.ASM5, mv);
		}

	}
	
}
