package de.ropemc.api.wrapper.net.minecraft.client.gui.achievement;

import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.stats.StatFileWriter;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.achievement.GuiStats")
public interface GuiStats {

    //FontRenderer access$000(GuiStats var0);

    //StatFileWriter access$100(GuiStats var0);

    //void access$1000(GuiStats var0, int var1, int var2, int var3, int var4, int var5, int var6);

    //FontRenderer access$1100(GuiStats var0);

    //FontRenderer access$1200(GuiStats var0);

    //void access$1300(GuiStats var0, int var1, int var2, int var3, int var4, int var5, int var6);

    //FontRenderer access$1400(GuiStats var0);

    //void access$1500(GuiStats var0, int var1, int var2, Item var3);

    //FontRenderer access$1600(GuiStats var0);

    //FontRenderer access$1700(GuiStats var0);

    //FontRenderer access$1800(GuiStats var0);

    //FontRenderer access$1900(GuiStats var0);

    //FontRenderer access$200(GuiStats var0);

    //FontRenderer access$2000(GuiStats var0);

    //FontRenderer access$2100(GuiStats var0);

    //FontRenderer access$2200(GuiStats var0);

    //FontRenderer access$300(GuiStats var0);

    //void access$400(GuiStats var0, int var1, int var2, int var3, int var4);

    //FontRenderer access$500(GuiStats var0);

    //FontRenderer access$600(GuiStats var0);

    //FontRenderer access$700(GuiStats var0);

    //FontRenderer access$800(GuiStats var0);

    //FontRenderer access$900(GuiStats var0);

    void actionPerformed(GuiButton var0);

    void createButtons();

    boolean doesGuiPauseGame();

    void doneLoading();

    void drawButtonBackground(int var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    void drawSprite(int var0, int var1, int var2, int var3);

    void drawStatsScreen(int var0, int var1, Item var2);

    void func_175366_f();

    void handleMouseInput();

    void initGui();

}
