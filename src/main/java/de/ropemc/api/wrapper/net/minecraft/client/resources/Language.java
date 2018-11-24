package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.Language")
public interface Language {

    int compareTo(Language var0);

    String getLanguageCode();

    boolean isBidirectional();

}
