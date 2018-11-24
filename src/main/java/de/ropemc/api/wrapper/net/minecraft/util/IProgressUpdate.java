package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IProgressUpdate")
public interface IProgressUpdate {

    void displayLoadingString(String var0);

    void displaySavingString(String var0);

    void resetProgressAndMessage(String var0);

    void setDoneWorking();

    void setLoadingProgress(int var0);

}
