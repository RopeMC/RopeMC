package de.ropemc.api.wrapper.net.minecraft.util;

//import com.google.common.util.concurrent.ListenableFuture;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IThreadListener")
public interface IThreadListener {

    //ListenableFuture addScheduledTask(Runnable var0);

    boolean isCallingFromMinecraftThread();

}
