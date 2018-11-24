package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.IMetadataSerializer")
public interface IMetadataSerializer {

    Gson getGson();

    IMetadataSection parseMetadataSection(String var0, JsonObject var1);

    void registerMetadataSectionType(IMetadataSectionSerializer var0, Class var1);

}
