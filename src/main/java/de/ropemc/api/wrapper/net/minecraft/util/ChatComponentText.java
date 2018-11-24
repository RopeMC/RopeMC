package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentText")
public interface ChatComponentText {

    ChatComponentText createCopy();

    String getChatComponentText_TextValue();

    String getUnformattedTextForChat();

}
