package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IChatComponent")
public interface IChatComponent {

    IChatComponent appendSibling(IChatComponent var0);

    IChatComponent appendText(String var0);

    IChatComponent createCopy();

    ChatStyle getChatStyle();

    String getFormattedText();

    List getSiblings();

    String getUnformattedText();

    String getUnformattedTextForChat();

    IChatComponent setChatStyle(ChatStyle var0);

}
