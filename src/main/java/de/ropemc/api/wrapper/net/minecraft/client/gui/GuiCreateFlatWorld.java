package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.world.gen.FlatGeneratorInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiCreateFlatWorld")
public interface GuiCreateFlatWorld {

    //float access$000(GuiCreateFlatWorld var0);

    //float access$100(GuiCreateFlatWorld var0);

    //float access$200(GuiCreateFlatWorld var0);

    //float access$300(GuiCreateFlatWorld var0);

    //FlatGeneratorInfo access$400(GuiCreateFlatWorld var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_146375_g();

    boolean func_146382_i();

    void func_146383_a(String var0);

    String func_146384_e();

    void handleMouseInput();

    void initGui();

}
