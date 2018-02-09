package de.ropemc.api.world;

import de.ropemc.utils.Vector3i;

public class Block
{

    private Vector3i position;

    public Block(Vector3i pos)
    {
        this.position = pos;
    }

    /**
     * @return position of the block
     */
    public Vector3i getPosition()
    {
        return position;
    }
}
