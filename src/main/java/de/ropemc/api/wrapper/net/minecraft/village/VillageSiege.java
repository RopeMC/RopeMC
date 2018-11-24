package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.VillageSiege")
public interface VillageSiege {

    Vec3 func_179867_a(BlockPos var0);

    boolean func_75529_b();

    boolean spawnZombie();

    void tick();

}
