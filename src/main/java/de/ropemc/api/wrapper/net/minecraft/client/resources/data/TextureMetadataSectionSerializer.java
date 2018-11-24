package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.TextureMetadataSectionSerializer")
public interface TextureMetadataSectionSerializer {

    TextureMetadataSection deserialize(JsonElement var0, Type var1, JsonDeserializationContext var2);

    String getSectionName();

}
