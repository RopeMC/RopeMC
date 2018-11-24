package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.TupleIntJsonSerializable")
public interface TupleIntJsonSerializable {

    int getIntegerValue();

    IJsonSerializable getJsonSerializableValue();

    void setIntegerValue(int var0);

    void setJsonSerializableValue(IJsonSerializable var0);

}
