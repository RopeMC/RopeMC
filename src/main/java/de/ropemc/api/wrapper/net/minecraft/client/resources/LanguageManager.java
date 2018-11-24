package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.util.SortedSet;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.LanguageManager")
public interface LanguageManager {

    Language getCurrentLanguage();

    SortedSet getLanguages();

    boolean isCurrentLanguageBidirectional();

    boolean isCurrentLocaleUnicode();

    void onResourceManagerReload(IResourceManager var0);

    void parseLanguageMetadata(List var0);

    void setCurrentLanguage(Language var0);

}
