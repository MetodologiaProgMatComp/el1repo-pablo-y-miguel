package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);//Center = (0,0)
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        int[] centerXY = new int[2];
        centerXY[0] = getCenterX();
        centerXY[1] = getCenterY();
        return centerXY;
    }
    public void setCenterXY(int x, int y){
        this.center=new MyPoint(x,y);
        int[] centerXY = new int[2];
        centerXY[0] = getCenterX();
        centerXY[1] = getCenterY();
    }
    public String toString(){
        return "MyCircle=[radius="+radius+", center="+center.toString()+"]";
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference(){
        return Math.PI * 2 * radius;
    }
    public double distance(MyCircle another){
        double distancia = center.distance(another.getCenter());
        return distancia;
    }
}
