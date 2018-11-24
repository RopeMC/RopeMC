package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentSelector")
public interface ChatComponentSelector {

    ChatComponentSelector createCopy();

    String getSelector();

    String getUnformattedTextForChat();

}
