package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    @Test
    void getBegin() {
        MyLine linea = new MyLine(0, 0, 2,2);
        MyPoint beginEsperado = new MyPoint();
        MyPoint beginObtenido = linea.getBegin();
        Assertions.assertEquals(beginEsperado.getX(),beginObtenido.getX());
        Assertions.assertEquals(beginEsperado.getY(),beginObtenido.getY());
    }
    @Test
    void setBegin() {
        MyLine linea = new MyLine(1, 1, 2,2);
        MyPoint beginEsperado = new MyPoint();
        MyPoint nuevoBegin = new MyPoint(0,0);
        linea.setBegin(nuevoBegin);
        MyPoint beginObtenido = linea.getBegin();
        Assertions.assertEquals(beginEsperado.getX(),beginObtenido.getX());
        Assertions.assertEquals(beginEsperado.getY(),beginObtenido.getY());
    }
    @Test
    void getEnd() {
        MyLine linea = new MyLine(0, 0, 2,2);
        MyPoint endEsperado = new MyPoint(2,2);
        MyPoint endObtenido = linea.getEnd();
        Assertions.assertEquals(endEsperado.getX(),endObtenido.getX());
        Assertions.assertEquals(endEsperado.getY(),endObtenido.getY());
    }
    @Test
    void setEnd() {
        MyLine linea = new MyLine(0, 0, 5,5);
        MyPoint endEsperado = new MyPoint(2,2);
        linea.setEnd(endEsperado);
        MyPoint endObtenido = linea.getEnd();
        Assertions.assertEquals(endEsperado.getX(),endObtenido.getX());
        Assertions.assertEquals(endEsperado.getY(),endObtenido.getY());
    }
    @Test
    void getBeginX() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int beginXEsperado = 0;
        int beginXObtenido = linea.getBeginX();
        Assertions.assertEquals(beginXEsperado,beginXObtenido);
    }
    @Test
    void setBeginX() {
        MyLine linea = new MyLine(3, 0, 2,2);
        int beginXEsperado = 0;
        linea.setBeginX(beginXEsperado);
        int beginXObtenido = linea.getBeginX();
        Assertions.assertEquals(beginXEsperado,beginXObtenido);
    }
    @Test
    void getBeginY() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int beginYEsperado = 0;
        int beginYObtenido = linea.getBeginY();
        Assertions.assertEquals(beginYEsperado,beginYObtenido);
    }
    @Test
    void setBeginY() {
        MyLine linea = new MyLine(3, 0, 2,2);
        int beginYEsperado = 0;
        linea.setBeginY(beginYEsperado);
        int beginYObtenido = linea.getBeginY();
        Assertions.assertEquals(beginYEsperado,beginYObtenido);
    }
    @Test
    void getEndX() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int endXEsperado = 2;
        int endXObtenido = linea.getEndX();
        Assertions.assertEquals(endXEsperado,endXObtenido);
    }
    @Test
    void setEndX() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int endXEsperado = 3;
        linea.setEndX(endXEsperado);
        int endXObtenido = linea.getEndX();
        Assertions.assertEquals(endXEsperado,endXObtenido);
    }
    @Test
    void getEndY() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int endYEsperado = 2;
        int endYObtenido = linea.getEndY();
        Assertions.assertEquals(endYEsperado,endYObtenido);
    }
    @Test
    void setEndY() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int endYEsperado = 3;
        linea.setEndY(endYEsperado);
        int endYObtenido = linea.getEndY();
        Assertions.assertEquals(endYEsperado,endYObtenido);
    }
    @Test
    void getBeginXY() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int[] beginXYEsperado = {0,0};
        int[] beginXYObtenido = linea.getBeginXY();
        Assertions.assertArrayEquals(beginXYEsperado, beginXYObtenido);
    }
    @Test
    void setBeginXY() {
        MyLine linea = new MyLine(1, 1, 2,2);
        int[] beginXYEsperado = {0,0};
        linea.setBeginXY(0,0);
        int[] beginXYObtenido = linea.getBeginXY();
        Assertions.assertArrayEquals(beginXYEsperado, beginXYObtenido);
    }
    @Test
    void getEndXY() {
        MyLine linea = new MyLine(0, 0, 2,2);
        int[] endXYEsperado = {2 ,2};
        int[] endXYObtenido = linea.getEndXY();
        Assertions.assertArrayEquals(endXYEsperado, endXYObtenido);
    }
    @Test
    void setEndXY() {
        MyLine linea = new MyLine(0, 0, 4,4);
        int[] endXYEsperado = {2 ,2};
        linea.setEndXY(2,2);
        int[] endXYObtenido = linea.getEndXY();
        Assertions.assertArrayEquals(endXYEsperado, endXYObtenido);
    }
    @Test
    void getLength() {
        MyPoint begin = new MyPoint();
        MyPoint end = new MyPoint(4,0);
        MyLine linea = new MyLine(begin, end);
        double lengthEsperada = 4;
        double lengthObtenida = linea.getLength();
        Assertions.assertEquals(lengthEsperada, lengthObtenida);
    }
    @Test
    void getGradient() {
        MyPoint begin = new MyPoint();
        MyPoint end = new MyPoint(4,4);
        MyLine linea = new MyLine(begin, end);
        double gradientEsperada = Math.atan2(4,4);
        double gradientObtenida = linea.getGradient();
        Assertions.assertEquals(gradientEsperada, gradientObtenida);
    }
    @Test
    void testToString() {
        MyLine linea = new MyLine(0, 0, 2,2);
        String textEsperado = "MyLine[begin=(0,0), end=(2,2)]";
        String textObtenido = linea.toString();
        Assertions.assertEquals(textEsperado, textObtenido);
    }
}