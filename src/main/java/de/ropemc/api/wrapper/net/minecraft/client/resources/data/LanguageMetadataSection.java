package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.LanguageMetadataSection")
public interface LanguageMetadataSection {

    Collection getLanguages();

}
