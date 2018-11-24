package de.ropemc.api.wrapper.net.minecraft.util;

import com.google.gson.JsonElement;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IJsonSerializable")
public interface IJsonSerializable {

    void fromJson(JsonElement var0);

    JsonElement getSerializableElement();

}
