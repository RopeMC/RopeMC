package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Iterator;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentStyle")
public interface ChatComponentStyle {

    IChatComponent appendSibling(IChatComponent var0);

    IChatComponent appendText(String var0);

    Iterator createDeepCopyIterator(Iterable var0);

    ChatStyle getChatStyle();

    String getFormattedText();

    List getSiblings();

    String getUnformattedText();

    IChatComponent setChatStyle(ChatStyle var0);

}
