package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.I18n")
public interface I18n {

    String format(String var0, Object[] var1);

    void setLocale(Locale var0);

}
