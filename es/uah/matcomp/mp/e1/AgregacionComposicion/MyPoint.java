package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] XY = new  int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
        int[] XY = new int[2];
        XY[0] = x;
        XY[1] = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int y, int x){
       double distancia1 = Math.sqrt(Math.pow(this.x - x, 2)+-Math.pow(this.y - y, 2));
       return distancia1;
    }
    public double distance(MyPoint another){
        return distance(another.x, another.y);
    }
    public double distance(){
        return distance(0, 0);
    }
}
