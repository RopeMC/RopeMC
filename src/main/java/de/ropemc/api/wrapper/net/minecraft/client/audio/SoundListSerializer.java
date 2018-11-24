package de.ropemc.api.wrapper.net.minecraft.client.audio;

import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundListSerializer")
public interface SoundListSerializer {

    SoundList deserialize(JsonElement var0, Type var1, JsonDeserializationContext var2);

}
