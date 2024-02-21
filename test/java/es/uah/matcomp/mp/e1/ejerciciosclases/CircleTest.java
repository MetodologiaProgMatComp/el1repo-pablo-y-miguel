package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void getRadius() {
        double radioEsperado = 1.0;
        Circle nuevoCirculo = new Circle(radioEsperado);
        double radioObtenido = nuevoCirculo.getRadius();
        Assertions.assertEquals(radioEsperado,radioObtenido);
    }

    @Test
    void setRadius() {
        double radioEsperado = 1.0;
        double radioFinal = 5.0;
        Circle nuevoCirculo = new Circle(radioFinal);
        nuevoCirculo.setRadius(radioEsperado);
        double radioObtenido = nuevoCirculo.getRadius(); ;
        Assertions.assertEquals(radioEsperado,radioObtenido);
    }
    @Test
    void getArea() {
        double areaEsperada = 4*Math.PI;
        double radio = 2.0;
        Circle nuevoCirculo = new Circle(radio);
        double areaObtenida = nuevoCirculo.getArea();
        Assertions.assertEquals(areaEsperada, areaObtenida);
    }

    @Test
    void getCircumference() {
        double perimetroEsperado = 4*Math.PI;
        double radio = 2.0;
        Circle nuevoCirculo = new Circle(radio);
        double perimetroObtenido = nuevoCirculo.getCircumference();
        Assertions.assertEquals(perimetroEsperado, perimetroObtenido);
    }

    @Test
    void testToString() {
        String mensajeEsperado = "Circle[radius=5.0]";
        double radius = 5.0;
        Circle nuevoCirculo = new Circle(radius);
        String mensajeObtenido = nuevoCirculo.toString();
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }

}