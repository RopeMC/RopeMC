package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.io.InputStream;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.Locale")
public interface Locale {

    void checkUnicode();

    String formatMessage(String var0, Object[] var1);

    boolean isUnicode();

    void loadLocaleData(InputStream var0);

    void loadLocaleData(List var0);

    void loadLocaleDataFiles(IResourceManager var0, List var1);

    String translateKeyPrivate(String var0);

}
