package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.WrapperSystem;

@WrappedClass("net.minecraft.util.ChatComponentText")
public interface ChatComponentText extends IChatComponent {
    static ChatComponentText construct(String text) { return (ChatComponentText) WrapperSystem.construct(ChatComponentText.class, text); }

    String toString();

    String getUnformattedTextForChat();
}
