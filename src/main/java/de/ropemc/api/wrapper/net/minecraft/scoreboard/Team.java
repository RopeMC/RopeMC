package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.Team")
public interface Team {

    String formatString(String var0);

    boolean getAllowFriendlyFire();

    //Team$EnumVisible getDeathMessageVisibility();

    Collection getMembershipCollection();

    //Team$EnumVisible getNameTagVisibility();

    String getRegisteredName();

    boolean getSeeFriendlyInvisiblesEnabled();

    boolean isSameTeam(Team var0);

}
