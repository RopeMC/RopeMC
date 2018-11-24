package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldType")
public interface WorldType {

    String func_151359_c();

    boolean getCanBeCreated();

    int getGeneratorVersion();

    String getTranslateName();

    WorldType getWorldTypeForGeneratorVersion(int var0);

    int getWorldTypeID();

    String getWorldTypeName();

    boolean isVersioned();

    WorldType parseWorldType(String var0);

    WorldType setCanBeCreated(boolean var0);

    WorldType setNotificationData();

    WorldType setVersioned();

    boolean showWorldInfoNotice();

}
