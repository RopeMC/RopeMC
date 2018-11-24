package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentScore")
public interface ChatComponentScore {

    ChatComponentScore createCopy();

    String getName();

    String getObjective();

    String getUnformattedTextForChat();

    void setValue(String var0);

}
