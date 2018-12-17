package de.ropemc;

import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.utils.Mapping;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class Transformer implements ClassFileTransformer {

    /**
     * called when a class is transformed
     *
     * @param classLoader
     * @param s                (obfuscated) name of the class which is transformed
     * @param aClass           instance of the class which is transformed
     * @param protectionDomain
     * @param bytes            bytecode of class
     * @return the bytecode to transform, if null nothing will happen
     * @throws IllegalClassFormatException
     */
    public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException {
        if (Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP"));
                CtMethod m1 = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "sendChatMessage"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "onLivingUpdate"));
                m.insertBefore("de.ropemc.api.event.EventManager.callEvent(new de.ropemc.api.event.player.PlayerUpdateEvent());");
                m1.insertBefore("de.ropemc.api.event.chat.ChatEvent event = new de.ropemc.api.event.chat.ChatEvent($1);" +
                        "de.ropemc.api.event.EventManager.callEvent(event);" +
                        "$1 = event.getMessage();" +
                        "if (event.isCancelled()) return;");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.client.gui.GuiIngame").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.gui.GuiIngame"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiIngame", "renderGameOverlay"), new CtClass[]{CtClass.floatType});
                m.insertAt(144, "de.ropemc.Hooks.draw2DHook();");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.client.Minecraft").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.Minecraft"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.Minecraft", "runTick"));
                m.insertBefore("if($0." + Mappings.getFieldName("net.minecraft.client.Minecraft", "currentScreen") + "==null)de.ropemc.Hooks.runTickHook();");
                CtMethod startGameMethod = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.Minecraft", "startGame"));
                startGameMethod.insertAt(562, "de.ropemc.Hooks.onGameStartHook();");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.item.Item").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.item.Item"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.item.Item", "registerItems"));
                m.insertAfter("de.ropemc.Hooks.registerItems();");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.block.Block").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.block.Block"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.block.Block", "registerBlocks"));
                m.insertAfter("de.ropemc.Hooks.registerBlocks();");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.client.renderer.entity.RenderItem").equals(s)) {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.renderer.entity.RenderItem"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.renderer.entity.RenderItem", "registerItems"));
                m.insertAfter("de.ropemc.Hooks.registerRenderItems(this);");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

}
