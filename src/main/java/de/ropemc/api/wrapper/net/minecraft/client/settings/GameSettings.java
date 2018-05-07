package de.ropemc.api.wrapper.net.minecraft.client.settings;

import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.WrappedField;
import jdk.nashorn.internal.objects.annotations.Setter;

@WrappedClass("net.minecraft.client.settings.GameSettings")
public interface GameSettings
{
    @WrappedField.Getter("chatColours")
    boolean isChatColours();

    @WrappedField.Setter("chatColours")
    void setChatColours(boolean state);

    @WrappedField.Getter("chatLinks")
    boolean isChatLinksEnabled();

    @WrappedField.Setter("chatLinks")
    void setChatLinksEnabled(boolean state);

    @WrappedField.Getter("chatLinksPrompt")
    boolean isChatLinksPromptEnabled();

    @WrappedField.Setter("chatLinksPrompt")
    void setChatLinksPromptEnabled(boolean state);

    @WrappedField.Getter("chatOpacity")
    float getChatOpacity();

    @WrappedField.Setter("chatOpacity")
    void setChatOpacity(float value);

    @WrappedField.Getter("snooperEnabled")
    boolean isSnooperEnabled();

    @WrappedField.Setter("snooperEnabled")
    void setSnooperEnabled(boolean state);

    @WrappedField.Getter("fullScreen")
    boolean isFullscreen();

    @WrappedField.Setter("fullScreen")
    void setFullscreen(boolean state);

    @WrappedField.Getter("enableVsync")
    boolean isVsyncEnabled();

    @WrappedField.Setter("enableVsync")
    void setVsyncEnabled(boolean state);

    @WrappedField.Getter("hideServerAddress")
    boolean isHidingServerAddress();

    @WrappedField.Setter("hideServerAddress")
    void setHidingServerAddress(boolean state);
}
