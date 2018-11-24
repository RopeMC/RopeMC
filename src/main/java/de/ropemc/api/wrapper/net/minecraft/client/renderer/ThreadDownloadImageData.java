package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.io.File;
//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ThreadDownloadImageData")
public interface ThreadDownloadImageData {

    //String access$000(ThreadDownloadImageData var0);

    //File access$100(ThreadDownloadImageData var0);

    //Logger access$200();

    //IImageBuffer access$300(ThreadDownloadImageData var0);

    void checkTextureUploaded();

    int getGlTextureId();

    void loadTexture(IResourceManager var0);

    void loadTextureFromServer();

    void setBufferedImage(BufferedImage var0);

}
