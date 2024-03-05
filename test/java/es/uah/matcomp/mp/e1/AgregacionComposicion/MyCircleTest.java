package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circulo = new MyCircle();
        int radioEsperado = 1;
        int radioObtenido = circulo.getRadius();
        Assertions.assertEquals(radioEsperado, radioObtenido);
    }
    @Test
    void setRadius() {
        MyCircle circulo = new MyCircle(0,0,3);
        int radioEsperado = 1;
        circulo.setRadius(radioEsperado);
        int radioObtenido = circulo.getRadius();
        Assertions.assertEquals(radioEsperado, radioObtenido);
    }
    @Test
    void getCenter() {
        MyCircle circulo = new MyCircle(1,2,4);
        MyPoint centerEsperado = new MyPoint(1,2);
        MyPoint centerObtenido = circulo.getCenter();
        Assertions.assertEquals(centerEsperado.getX(), centerObtenido.getX());
        Assertions.assertEquals(centerEsperado.getY(), centerObtenido.getY());
    }
    @Test
    void setCenter() {
        MyCircle circulo = new MyCircle(3,7,4);
        MyPoint centerEsperado = new MyPoint(1,2);
        circulo.setCenter(centerEsperado);
        MyPoint centerObtenido = circulo.getCenter();
        Assertions.assertEquals(centerEsperado.getX(), centerObtenido.getX());
        Assertions.assertEquals(centerEsperado.getY(), centerObtenido.getY());
    }

    @Test
    void getCenterX() {
        MyCircle circulo = new MyCircle(1,2,4);
        int centerXEsperado = 1;
        int centerXObtenido = circulo.getCenterX();
        Assertions.assertEquals(centerXEsperado, centerXObtenido);
    }

    @Test
    void setCenterX() {
        MyCircle circulo = new MyCircle(7,2,4);
        int centerXEsperado = 1;
        circulo.setCenterX(centerXEsperado);
        int centerXObtenido = circulo.getCenterX();
        Assertions.assertEquals(centerXEsperado, centerXObtenido);
    }

    @Test
    void getCenterY() {
        MyCircle circulo = new MyCircle(1,2,4);
        int centerYEsperado = 2;
        int centerYObtenido = circulo.getCenterY();
        Assertions.assertEquals(centerYEsperado, centerYObtenido);
    }

    @Test
    void setCenterY() {
        MyCircle circulo = new MyCircle(1,2,4);
        int centerYEsperado = 2;
        circulo.setCenterY(centerYEsperado);
        int centerYObtenido = circulo.getCenterY();
        Assertions.assertEquals(centerYEsperado, centerYObtenido);
    }

    @Test
    void getCenterXY() {
        MyCircle circulo = new MyCircle(1,2,4);
        int[] centerXYEsperado = {1,2};
        int[] centerXYObtenido = circulo.getCenterXY();
        Assertions.assertArrayEquals(centerXYEsperado, centerXYObtenido);
    }

    @Test
    void setCenterXY() {
        MyCircle circulo = new MyCircle(3,7,4);
        int[] centerXYEsperado = {1,2};
        circulo.setCenterXY(1,2);
        int[] centerXYObtenido = circulo.getCenterXY();
        Assertions.assertArrayEquals(centerXYEsperado, centerXYObtenido);
    }

    @Test
    void testToString() {
        MyCircle circulo = new MyCircle(1,2,4);
        String mensajeEsperado = "MyCircle=[radius=4, center=(1,2)]";
        String mensajeObtenido = circulo.toString();
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }
    @Test
    void getArea() {
        MyCircle circulo = new MyCircle(1,3,5);
        double areaEsperada = Math.PI * 25;
        double areaObtenida = circulo.getArea();
        Assertions.assertEquals(areaEsperada, areaObtenida);
    }
    @Test
    void getCircumference() {
        MyCircle circulo = new MyCircle(1,3,5);
        double circumferenceEsperada = Math.PI * 10;
        double circumferenceObtenida = circulo.getCircumference();
        Assertions.assertEquals(circumferenceEsperada, circumferenceObtenida);
    }
    @Test
    void distance() {
        MyCircle circulo1 = new MyCircle(1,3,5);
        MyCircle circulo2 = new MyCircle(3,3,9);
        double distanciaEsperada = 2;
        double distanciaObtenida = circulo1.distance(circulo2);
        Assertions.assertEquals(distanciaEsperada, distanciaObtenida);
    }
}