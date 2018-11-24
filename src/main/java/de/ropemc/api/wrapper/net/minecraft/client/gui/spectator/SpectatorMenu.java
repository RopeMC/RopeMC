package de.ropemc.api.wrapper.net.minecraft.client.gui.spectator;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.categories.SpectatorDetails;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.spectator.SpectatorMenu")
public interface SpectatorMenu {

    //int access$112(SpectatorMenu var0, int var1);

    void func_178641_d();

    List func_178642_a();

    ISpectatorMenuObject func_178643_a(int var0);

    void func_178644_b(int var0);

    ISpectatorMenuObject func_178645_b();

    SpectatorDetails func_178646_f();

    void func_178647_a(ISpectatorMenuView var0);

    int func_178648_e();

    ISpectatorMenuView func_178650_c();

}
