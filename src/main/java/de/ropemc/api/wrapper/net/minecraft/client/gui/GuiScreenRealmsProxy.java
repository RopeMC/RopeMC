package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
//import de.ropemc.api.wrapper.net.minecraft.realms.RealmsScreen;
//import de.ropemc.api.wrapper.net.minecraft.realms.RealmsButton;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenRealmsProxy")
public interface GuiScreenRealmsProxy {

    void actionPerformed(GuiButton var0);

    void confirmClicked(boolean var0, int var1);

    boolean doesGuiPauseGame();

    void drawCreativeTabHoveringText(String var0, int var1, int var2);

    void drawDefaultBackground();

    void drawGradientRect(int var0, int var1, int var2, int var3, int var4, int var5);

    void drawHoveringText(List var0, int var1, int var2);

    void drawScreen(int var0, int var1, float var2);

    void drawTexturedModalRect(int var0, int var1, int var2, int var3, int var4, int var5);

    void drawWorldBackground(int var0);

    void func_154319_c(String var0, int var1, int var2, int var3);

    List func_154320_j();

    //RealmsScreen func_154321_a();

    void func_154322_b(String var0, int var1, int var2, int var3);

    List func_154323_a(String var0, int var1);

    void func_154324_i();

    void func_154325_a(String var0, int var1, int var2, int var3);

    int func_154326_c(String var0);

    //void func_154327_a(RealmsButton var0);

    //void func_154328_b(RealmsButton var0);

    int func_154329_h();

    void handleKeyboardInput();

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClickMove(int var0, int var1, int var2, long var3);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    void onGuiClosed();

    void renderToolTip(ItemStack var0, int var1, int var2);

    void updateScreen();

}
