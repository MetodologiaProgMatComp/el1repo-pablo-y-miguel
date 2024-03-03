package es.uah.matcomp.mp.e1.ejerciciosherencia;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
    }
    public float[] getXY(){
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
