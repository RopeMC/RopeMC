package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.PackMetadataSectionSerializer")
public interface PackMetadataSectionSerializer {

    PackMetadataSection deserialize(JsonElement var0, Type var1, JsonDeserializationContext var2);

    String getSectionName();

    JsonElement serialize(PackMetadataSection var0, Type var1, JsonSerializationContext var2);

}
