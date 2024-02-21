package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        float lengthEsperado = 33f;
        float widthEsperado = 33f;
        Rectangle nuevoRectangulo = new Rectangle(lengthEsperado,widthEsperado);
        float lengthObtenido = nuevoRectangulo.getLength();
        Assertions.assertEquals(lengthEsperado,lengthObtenido);
    }

    @Test
    void setLength() {
        float lengthEsperado = 33f;
        float widthEsperado = 33f;
        float newLength = 43f;
        Rectangle nuevoRectangulo = new Rectangle(newLength,widthEsperado);
        nuevoRectangulo.setLength(lengthEsperado);
        float lengthObtenido = nuevoRectangulo.getLength();
        Assertions.assertEquals(lengthEsperado,lengthObtenido);
    }

    @Test
    void getWidth() {
        float lengthEsperado = 33f;
        float widthEsperado = 33f;
        Rectangle nuevoRectangulo = new Rectangle(lengthEsperado,widthEsperado);
        float widthObtenido = nuevoRectangulo.getWidth();
        Assertions.assertEquals(widthEsperado,widthObtenido);
    }

    @Test
    void setWidth() {
        float lengthEsperado = 33f;
        float widthEsperado = 33f;
        float newwidth = 43f;
        Rectangle nuevoRectangulo = new Rectangle(lengthEsperado,newwidth);
        nuevoRectangulo.setLength(lengthEsperado);
        float lengthObtenido = nuevoRectangulo.getWidth();
        Assertions.assertEquals(lengthEsperado,lengthObtenido);
    }

    @Test
    void getArea() {
        float length = 33f;
        float width = 33f;
        float areaEsperada = (float) Math.pow(33f, 2);
        Rectangle nuevoRectangulo = new Rectangle(length, width);
        double areaObtenida = nuevoRectangulo.getArea();
        Assertions.assertEquals(areaEsperada,areaObtenida);
    }

    @Test
    void getPerimeter() {
        float length = 33f;
        float width = 33f;
        float perimetroEsperado = 132 ;
        Rectangle nuevoRectangulo = new Rectangle(length, width);
        double perimetroObtenido = nuevoRectangulo.getPerimeter(); //el tipo de dato tiene que ser igual que el que se ha definido en el metodo
        Assertions.assertEquals(perimetroEsperado,perimetroObtenido);
    }

    @Test
    void testToString() {
        float length = 33.3f;
        float width = 33.3f;
        String mensajeEsperado = "Rectangle [lenght=33.3, width=33.3]";
        Rectangle nuevoRectangulo = new Rectangle(length, width);
        String mensajeObtenido = nuevoRectangulo.toString();
        Assertions.assertEquals(mensajeEsperado,mensajeObtenido);
    }
}