package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import de.ropemc.api.wrapper.net.minecraft.util.EnumChatFormatting;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.ScorePlayerTeam")
public interface ScorePlayerTeam {

    String formatPlayerName(Team var0, String var1);

    String formatString(String var0);

    void func_98298_a(int var0);

    int func_98299_i();

    boolean getAllowFriendlyFire();

    EnumChatFormatting getChatFormat();

    String getColorPrefix();

    String getColorSuffix();

    //Team$EnumVisible getDeathMessageVisibility();

    Collection getMembershipCollection();

    //Team$EnumVisible getNameTagVisibility();

    String getRegisteredName();

    boolean getSeeFriendlyInvisiblesEnabled();

    String getTeamName();

    void setAllowFriendlyFire(boolean var0);

    void setChatFormat(EnumChatFormatting var0);

    //void setDeathMessageVisibility(Team$EnumVisible var0);

    void setNamePrefix(String var0);

    void setNameSuffix(String var0);

    //void setNameTagVisibility(Team$EnumVisible var0);

    void setSeeFriendlyInvisiblesEnabled(boolean var0);

    void setTeamName(String var0);

}
