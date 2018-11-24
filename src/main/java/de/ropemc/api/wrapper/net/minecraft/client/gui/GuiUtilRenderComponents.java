package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiUtilRenderComponents")
public interface GuiUtilRenderComponents {

    List func_178908_a(IChatComponent var0, int var1, FontRenderer var2, boolean var3, boolean var4);

    String func_178909_a(String var0, boolean var1);

}
