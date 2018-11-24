package de.ropemc.api.wrapper.net.minecraft.client.gui.stream;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.client.stream.IStream;
import java.util.List;
//import tv.twitch.chat.ChatUserMode;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
//import tv.twitch.chat.ChatUserSubscription;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.stream.GuiTwitchUserMode")
public interface GuiTwitchUserMode {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    List func_152328_a(Set var0, Set var1, IStream var2);

    //IChatComponent func_152329_a(ChatUserMode var0, String var1, boolean var2);

    //IChatComponent func_152330_a(ChatUserSubscription var0, String var1, boolean var2);

    void initGui();

}
