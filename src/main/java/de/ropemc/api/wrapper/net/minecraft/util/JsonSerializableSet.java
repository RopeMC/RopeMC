package de.ropemc.api.wrapper.net.minecraft.util;

import com.google.gson.JsonElement;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.JsonSerializableSet")
public interface JsonSerializableSet {

    void fromJson(JsonElement var0);

    JsonElement getSerializableElement();

}
