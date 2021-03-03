package oop.exercises.oop.task1;

public class Point3D extends Point2D {
    private float z;
    public Point3D (float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return z;
    }
    public float [] getXYZ(){
    float [] varXYZ={super.getX(),super.getY(),z};
        return varXYZ;
    }
    public void setXYZ (float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public String toString (){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }



}
