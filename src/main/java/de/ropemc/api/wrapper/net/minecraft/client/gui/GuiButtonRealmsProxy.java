package de.ropemc.api.wrapper.net.minecraft.client.gui;

//import de.ropemc.api.wrapper.net.minecraft.realms.RealmsButton;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiButtonRealmsProxy")
public interface GuiButtonRealmsProxy {

    int func_154312_c(boolean var0);

    int func_175232_g();

    int getButtonWidth();

    boolean getEnabled();

    int getHoverState(boolean var0);

    int getId();

    int getPositionY();

    //RealmsButton getRealmsButton();

    void mouseDragged(Minecraft var0, int var1, int var2);

    boolean mousePressed(Minecraft var0, int var1, int var2);

    void mouseReleased(int var0, int var1);

    void setEnabled(boolean var0);

    void setText(String var0);

}
