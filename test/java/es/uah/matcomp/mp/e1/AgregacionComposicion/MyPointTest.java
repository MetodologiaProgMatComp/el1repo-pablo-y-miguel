package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    @Test
    void getX() {
        MyPoint point1 = new MyPoint(1, 1);
        int xObtenido = point1.getX();
        Assertions.assertEquals(1,xObtenido);
    }

    @Test
    void setX() {
        MyPoint point1 = new MyPoint(1, 1);
        point1.setX(3);
        int xObtenido = point1.getX();
        Assertions.assertEquals(3,xObtenido);
    }

    @Test
    void getY() {
        MyPoint point1 = new MyPoint(1, 1);
        int yObtenido = point1.getY();
        Assertions.assertEquals(1,yObtenido);
    }

    @Test
    void setY() {
        MyPoint point1 = new MyPoint(1, 1);
        point1.setY(4);
        int yObtenido = point1.getY();
        Assertions.assertEquals(4,yObtenido);
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(1 ,1);
        int [] XY = point.getXY();
        Assertions.assertEquals(1,XY[0]);
        Assertions.assertEquals(1,XY[1]);
    }
    @Test
    void setXY() {
        MyPoint point = new MyPoint(1 ,1);
        point.setXY(2, 4);
        int [] XY = point.getXY();
        Assertions.assertEquals(2,XY[0]);
        Assertions.assertEquals(4,XY[1]);
    }
    @Test
    void testToString() {
        MyPoint point = new MyPoint(1 ,1);
        String mensajeObtenido = point.toString();
        String mensajeEsperado = "(1,1)";
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }
    @Test
    void distance() {
        MyPoint point = new MyPoint(1,1);
        double distanciaObtenida = point.distance(1, 2);
        double distanciaEsperada = 1;
        Assertions.assertEquals(distanciaEsperada, distanciaObtenida);
    }

    @Test
    void testDistance() {
        MyPoint point1 = new MyPoint(1,1);
        MyPoint point2 = new MyPoint(2,2);
        double distanciaObtenida = point1.distance(point2);
        double distanciaEsperada = Math.sqrt(2);
        Assertions.assertEquals(distanciaEsperada, distanciaObtenida);
    }

    @Test
    void testDistance1() {
        MyPoint point1 = new MyPoint(1,1);
        double distanciaObtenida = point1.distance();
        double distanciaEsperada = Math.sqrt(2);
        Assertions.assertEquals(distanciaEsperada, distanciaObtenida);
    }
}