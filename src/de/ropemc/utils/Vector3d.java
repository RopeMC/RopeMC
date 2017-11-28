package de.ropemc.utils;

public class Vector3d
{

    private double x, y, z;

    public Vector3d(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX()
    {
        return this.x;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    public double getZ()
    {
        return this.z;
    }
    public void setZ(double z)
    {
        this.z=z;
    }

}
