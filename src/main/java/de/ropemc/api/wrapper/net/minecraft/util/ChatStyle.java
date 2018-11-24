package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.event.ClickEvent;
import de.ropemc.api.wrapper.net.minecraft.event.HoverEvent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatStyle")
public interface ChatStyle {

    //Boolean access$000(ChatStyle var0);

    //Boolean access$002(ChatStyle var0, Boolean var1);

    //Boolean access$100(ChatStyle var0);

    //Boolean access$102(ChatStyle var0, Boolean var1);

    //Boolean access$200(ChatStyle var0);

    //Boolean access$202(ChatStyle var0, Boolean var1);

    //Boolean access$300(ChatStyle var0);

    //Boolean access$302(ChatStyle var0, Boolean var1);

    //Boolean access$400(ChatStyle var0);

    //Boolean access$402(ChatStyle var0, Boolean var1);

    //EnumChatFormatting access$500(ChatStyle var0);

    //EnumChatFormatting access$502(ChatStyle var0, EnumChatFormatting var1);

    //String access$600(ChatStyle var0);

    //String access$602(ChatStyle var0, String var1);

    //ClickEvent access$700(ChatStyle var0);

    //ClickEvent access$702(ChatStyle var0, ClickEvent var1);

    //HoverEvent access$800(ChatStyle var0);

    //HoverEvent access$802(ChatStyle var0, HoverEvent var1);

    ChatStyle createDeepCopy();

    ChatStyle createShallowCopy();

    boolean getBold();

    ClickEvent getChatClickEvent();

    HoverEvent getChatHoverEvent();

    EnumChatFormatting getColor();

    String getFormattingCode();

    String getInsertion();

    boolean getItalic();

    boolean getObfuscated();

    ChatStyle getParent();

    boolean getStrikethrough();

    boolean getUnderlined();

    boolean isEmpty();

    ChatStyle setBold(Boolean var0);

    ChatStyle setChatClickEvent(ClickEvent var0);

    ChatStyle setChatHoverEvent(HoverEvent var0);

    ChatStyle setColor(EnumChatFormatting var0);

    ChatStyle setInsertion(String var0);

    ChatStyle setItalic(Boolean var0);

    ChatStyle setObfuscated(Boolean var0);

    ChatStyle setParentStyle(ChatStyle var0);

    ChatStyle setStrikethrough(Boolean var0);

    ChatStyle setUnderlined(Boolean var0);

}
