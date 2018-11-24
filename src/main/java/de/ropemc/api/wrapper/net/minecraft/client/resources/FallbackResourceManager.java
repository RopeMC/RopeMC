package de.ropemc.api.wrapper.net.minecraft.client.resources;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.List;
import java.io.InputStream;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.FallbackResourceManager")
public interface FallbackResourceManager {

    //Logger access$000();

    void addResourcePack(IResourcePack var0);

    List getAllResources(ResourceLocation var0);

    InputStream getInputStream(ResourceLocation var0, IResourcePack var1);

    ResourceLocation getLocationMcmeta(ResourceLocation var0);

    IResource getResource(ResourceLocation var0);

    Set getResourceDomains();

}
