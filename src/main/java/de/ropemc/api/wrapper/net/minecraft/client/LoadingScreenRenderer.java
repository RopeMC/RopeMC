package de.ropemc.api.wrapper.net.minecraft.client;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.LoadingScreenRenderer")
public interface LoadingScreenRenderer {

    void displayLoadingString(String var0);

    void displaySavingString(String var0);

    void displayString(String var0);

    void resetProgressAndMessage(String var0);

    void setDoneWorking();

    void setLoadingProgress(int var0);

}
