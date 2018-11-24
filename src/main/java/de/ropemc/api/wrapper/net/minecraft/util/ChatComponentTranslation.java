package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentTranslation")
public interface ChatComponentTranslation {

    ChatComponentTranslation createCopy();

    void ensureInitialized();

    Object[] getFormatArgs();

    IChatComponent getFormatArgumentAsComponent(int var0);

    String getKey();

    String getUnformattedTextForChat();

    void initializeFromFormat(String var0);

    IChatComponent setChatStyle(ChatStyle var0);

}
