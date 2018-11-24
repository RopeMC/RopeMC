package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase;
import de.ropemc.api.wrapper.net.minecraft.world.gen.FlatLayerInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiFlatPresets")
public interface GuiFlatPresets {

    //float access$000(GuiFlatPresets var0);

    //float access$100(GuiFlatPresets var0);

    //float access$200(GuiFlatPresets var0);

    //float access$300(GuiFlatPresets var0);

    //List access$400();

    //GuiFlatPresets$ListSlot access$500(GuiFlatPresets var0);

    //GuiTextField access$600(GuiFlatPresets var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_146421_a(String var0, Item var1, BiomeGenBase var2, List var3, FlatLayerInfo[] var4);

    void func_146425_a(String var0, Item var1, BiomeGenBase var2, FlatLayerInfo[] var3);

    void func_146426_g();

    boolean func_146430_p();

    void func_175354_a(String var0, Item var1, int var2, BiomeGenBase var3, List var4, FlatLayerInfo[] var5);

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onGuiClosed();

    void updateScreen();

}
