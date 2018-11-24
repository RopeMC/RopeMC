package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.resources.LanguageManager;
import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiLanguage")
public interface GuiLanguage {

    //LanguageManager access$000(GuiLanguage var0);

    //GameSettings access$100(GuiLanguage var0);

    //GuiOptionButton access$200(GuiLanguage var0);

    //GuiOptionButton access$300(GuiLanguage var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void handleMouseInput();

    void initGui();

}
