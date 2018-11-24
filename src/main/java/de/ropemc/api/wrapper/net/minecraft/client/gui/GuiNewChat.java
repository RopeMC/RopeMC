package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiNewChat")
public interface GuiNewChat {

    void addToSentMessages(String var0);

    int calculateChatboxHeight(float var0);

    int calculateChatboxWidth(float var0);

    void clearChatMessages();

    void deleteChatLine(int var0);

    void drawChat(int var0);

    IChatComponent getChatComponent(int var0, int var1);

    int getChatHeight();

    boolean getChatOpen();

    float getChatScale();

    int getChatWidth();

    int getLineCount();

    List getSentMessages();

    void printChatMessage(IChatComponent var0);

    void printChatMessageWithOptionalDeletion(IChatComponent var0, int var1);

    void refreshChat();

    void resetScroll();

    void scroll(int var0);

    void setChatLine(IChatComponent var0, int var1, int var2, boolean var3);

}
