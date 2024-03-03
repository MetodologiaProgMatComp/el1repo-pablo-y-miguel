package es.uah.matcomp.mp.e1.ejerciciosherencia;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z){
        super(x , y);
        this.z = z;
    }
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = getX();
        XYZ[1] = getY();
        XYZ[2] = z;
        return XYZ;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";//si utilizasemos super.toString nos devolvería ((x,y),z).
    }
}
