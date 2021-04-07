package bai6_inheritance.bai_tap.Bai_tap2_point2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(){
        super();
        this.z=0;
    }
    public Point3D(float x,float y, float z){
        super(x,y);

        this.z=z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] tage={getX(),getY(),getZ()};
        return  tage;
    }

    @Override
    public String toString() {
        return "Point3D{x = " +super.getX()+",  y = "+
                super.getY()+ ",  z=" + getZ() +
                "}"+ Arrays.toString(getXYZ());
    }
}
