package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){
        this.center = new MyPoint(0,0);//Center = (0,0)
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
    }
    public MyCircle (MyPoint center, int radius){}

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){}
    public void setCenterX(int x){}
    public int getCenterY(){}
    public void setCenterY(int y){}
    public int[] getCenterXY(){}
    public void setCenterXY(int x, int y){}
    public String toString(){}
    public double getArea(){}
    public double getCircumference(){}
    public double distance(MyCircle another){}
}
