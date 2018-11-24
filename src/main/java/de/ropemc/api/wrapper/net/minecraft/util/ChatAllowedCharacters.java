package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatAllowedCharacters")
public interface ChatAllowedCharacters {

    String filterAllowedCharacters(String var0);

    boolean isAllowedCharacter(char var0);

}
