package es.uah.matcomp.mp.e1.AgregacionComposicion;

import java.util.Arrays;

public class TestCircle {
    public static void main(String[] args){
        //Test constructor and toString():
        MyCircle c1 = new MyCircle(0,0,1);
        System.out.println(c1);
        //Test getters and setters:
        MyPoint newCenter = new MyPoint(1,1);
        c1.setCenter(newCenter);
        System.out.println(c1);
        System.out.println("Radius is:"+c1.getRadius());
        System.out.println("Center is:"+c1.getCenter());
        System.out.println("Center is:"+c1.getCenter());
        System.out.println("Center 'x' is:"+c1.getCenterX());
        System.out.println("Center 'y' is:"+c1.getCenterY());
        System.out.println("Center 'XY' is:"+ Arrays.toString(c1.getCenterXY()));
        //Test de getArea and getCircumference:
        System.out.println("Area of the circle is:"+c1.getArea());
        System.out.println("Circumference of the circle is:"+c1.getCircumference());
        MyCircle c2 = new MyCircle(5,5,7);
        System.out.println(c2);
        System.out.println("Distance from c1 to c2 is:"+c1.distance(c2));
    }
}
