package de.ropemc.api.wrapper.net.minecraft.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.JsonUtils")
public interface JsonUtils {

    boolean getBoolean(JsonElement var0, String var1);

    boolean getBoolean(JsonObject var0, String var1);

    boolean getBoolean(JsonObject var0, String var1, boolean var2);

    float getFloat(JsonElement var0, String var1);

    float getFloat(JsonObject var0, String var1);

    float getFloat(JsonObject var0, String var1, float var2);

    int getInt(JsonElement var0, String var1);

    int getInt(JsonObject var0, String var1);

    int getInt(JsonObject var0, String var1, int var2);

    JsonArray getJsonArray(JsonElement var0, String var1);

    JsonArray getJsonArray(JsonObject var0, String var1);

    JsonArray getJsonArray(JsonObject var0, String var1, JsonArray var2);

    JsonObject getJsonObject(JsonElement var0, String var1);

    JsonObject getJsonObject(JsonObject var0, String var1);

    JsonObject getJsonObject(JsonObject var0, String var1, JsonObject var2);

    String getString(JsonElement var0, String var1);

    String getString(JsonObject var0, String var1);

    String getString(JsonObject var0, String var1, String var2);

    boolean hasField(JsonObject var0, String var1);

    boolean isBoolean(JsonObject var0, String var1);

    boolean isJsonArray(JsonObject var0, String var1);

    boolean isJsonPrimitive(JsonObject var0, String var1);

    boolean isString(JsonElement var0);

    boolean isString(JsonObject var0, String var1);

    String toString(JsonElement var0);

}
