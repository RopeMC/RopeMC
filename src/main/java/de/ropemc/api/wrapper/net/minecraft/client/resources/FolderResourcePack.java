package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.io.InputStream;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.FolderResourcePack")
public interface FolderResourcePack {

    InputStream getInputStreamByName(String var0);

    Set getResourceDomains();

    boolean hasResourceName(String var0);

}
