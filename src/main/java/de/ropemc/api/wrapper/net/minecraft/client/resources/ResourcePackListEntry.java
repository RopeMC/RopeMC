package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.ResourcePackListEntry")
public interface ResourcePackListEntry {

    void drawEntry(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

    boolean func_148307_h();

    boolean func_148308_f();

    boolean func_148309_e();

    boolean func_148310_d();

    String func_148311_a();

    String func_148312_b();

    void func_148313_c();

    boolean func_148314_g();

    int func_183019_a();

    boolean mousePressed(int var0, int var1, int var2, int var3, int var4, int var5);

    void mouseReleased(int var0, int var1, int var2, int var3, int var4, int var5);

    void setSelected(int var0, int var1, int var2);

}
