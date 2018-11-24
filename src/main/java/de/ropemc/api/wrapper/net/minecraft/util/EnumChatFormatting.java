package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EnumChatFormatting")
public interface EnumChatFormatting {

    EnumChatFormatting func_175744_a(int var0);

    String func_175745_c(String var0);

    int getColorIndex();

    String getFriendlyName();

    String getTextWithoutFormattingCodes(String var0);

    Collection getValidValues(boolean var0, boolean var1);

    EnumChatFormatting getValueByName(String var0);

    boolean isColor();

    boolean isFancyStyling();

}
