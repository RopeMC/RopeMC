package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathFinder")
public interface PathFinder {

    PathEntity addToPath(Entity var0, PathPoint var1, PathPoint var2, float var3);

    PathEntity createEntityPath(PathPoint var0, PathPoint var1);

    PathEntity createEntityPathTo(IBlockAccess var0, Entity var1, double var2, double var3, double var4, float var5);

    PathEntity createEntityPathTo(IBlockAccess var0, Entity var1, Entity var2, float var3);

    PathEntity createEntityPathTo(IBlockAccess var0, Entity var1, BlockPos var2, float var3);

}
