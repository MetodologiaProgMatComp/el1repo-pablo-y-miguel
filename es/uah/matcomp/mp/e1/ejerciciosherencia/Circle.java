package es.uah.matcomp.mp.e1.ejerciciosherencia;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super ( color , filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
    public String toString(){
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
