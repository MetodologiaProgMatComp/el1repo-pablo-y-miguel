package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radius;
    public Circle(double r){
        radius=r;
    }
    public Circle(){
        radius = 1.0;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle[radius="+ radius + "]";
    }
}


