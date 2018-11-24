package de.ropemc.api.wrapper.net.minecraft.world;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.Explosion")
public interface Explosion {

    void doExplosionA();

    void doExplosionB(boolean var0);

    void func_180342_d();

    List getAffectedBlockPositions();

    EntityLivingBase getExplosivePlacedBy();

    Map getPlayerKnockbackMap();

}
