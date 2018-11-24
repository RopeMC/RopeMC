package de.ropemc.api.wrapper.net.minecraft.client.resources;

//import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.ResourcePackRepository")
public interface ResourcePackRepository {

    //ListenableFuture downloadResourcePack(String var0, String var1);

    void fixDirResourcepacks();

    void func_148529_f();

    void func_183028_i();

    File getDirResourcepacks();

    List getRepositoryEntries();

    List getRepositoryEntriesAll();

    List getResourcePackFiles();

    IResourcePack getResourcePackInstance();

    void setRepositories(List var0);

    //ListenableFuture setResourcePackInstance(File var0);

    void updateRepositoryEntriesAll();

}
