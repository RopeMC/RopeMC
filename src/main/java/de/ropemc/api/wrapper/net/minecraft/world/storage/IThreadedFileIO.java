package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.IThreadedFileIO")
public interface IThreadedFileIO {

    boolean writeNextIO();

}
