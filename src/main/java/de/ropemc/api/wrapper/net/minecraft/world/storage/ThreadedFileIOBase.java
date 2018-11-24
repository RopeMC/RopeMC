package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.ThreadedFileIOBase")
public interface ThreadedFileIOBase {

    ThreadedFileIOBase getThreadedIOInstance();

    void processQueue();

    void queueIO(IThreadedFileIO var0);

    void waitForFinish();

}
