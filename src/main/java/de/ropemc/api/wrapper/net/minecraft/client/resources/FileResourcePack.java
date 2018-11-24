package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipFile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.FileResourcePack")
public interface FileResourcePack {

    InputStream getInputStreamByName(String var0);

    Set getResourceDomains();

    ZipFile getResourcePackZipFile();

    boolean hasResourceName(String var0);

}
