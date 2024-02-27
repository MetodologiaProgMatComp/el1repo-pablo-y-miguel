package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xInicial = 1;
        Ball nuevaBall = new Ball(xInicial, yEsperado, radiusEsperado, xDeltaEsperado, yDeltaEsperado);
        float xObtenido = nuevaBall.getX();
        Assertions.assertEquals(xEsperado, xObtenido);
    }
    @Test
    void setX() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xInicial = 3;
        Ball nuevaBall = new Ball(xInicial, yEsperado, radiusEsperado, xDeltaEsperado, yDeltaEsperado);
        nuevaBall.setX(xEsperado);
        float xObtenido = nuevaBall.getX();
        Assertions.assertEquals(xEsperado, xObtenido);
    }
    @Test
    void getY() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float yInicial = 1;
        Ball nuevaBall = new Ball(xEsperado, yInicial, radiusEsperado, xDeltaEsperado, yDeltaEsperado);
        float yObtenido = nuevaBall.getY();
        Assertions.assertEquals(yEsperado, yObtenido);
    }
    @Test
    void setY() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float yInicial = 3;
        Ball nuevaBall = new Ball(xEsperado, yInicial, radiusEsperado, xDeltaEsperado, yDeltaEsperado);
        nuevaBall.setY(yEsperado);
        float yObtenido = nuevaBall.getY();
        Assertions.assertEquals(yEsperado, yObtenido);
    }
    @Test
    void getRadius() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        int radiusInicial = 1;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusInicial, xDeltaEsperado, yDeltaEsperado);
        int radiusObtenido = nuevaBall.getRadius();
        Assertions.assertEquals(radiusEsperado, radiusObtenido);
    }
    @Test
    void setRadius() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        int radiusInicial = 3;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusInicial, xDeltaEsperado, yDeltaEsperado);
        nuevaBall.setRadius(radiusEsperado);
        int radiusObtenido = nuevaBall.getRadius();
        Assertions.assertEquals(radiusEsperado, radiusObtenido);
    }
    @Test
    void getXDelta() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xDeltaInicial = 1;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaInicial, yDeltaEsperado);
        float xDeltaObtenido = nuevaBall.getXDelta();
        Assertions.assertEquals(xDeltaEsperado, xDeltaObtenido);
    }
    @Test
    void setXDelta() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xDeltaInicial = 3;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaInicial, yDeltaEsperado);
        nuevaBall.setXDelta(xDeltaEsperado);
        float xDeltaObtenido = nuevaBall.getXDelta();
        Assertions.assertEquals(xDeltaEsperado, xDeltaObtenido);
    }
    @Test
    void getYDelta() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float yDeltaInicial = 1;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaEsperado, yDeltaInicial);
        float yDeltaObtenido = nuevaBall.getYDelta();
        Assertions.assertEquals(yDeltaEsperado, yDeltaObtenido);
    }
    @Test
    void setYDelta() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float yDeltaInicial = 3;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaEsperado, yDeltaInicial);
        nuevaBall.setYDelta(yDeltaEsperado);
        float yDeltaObtenido = nuevaBall.getYDelta();
        Assertions.assertEquals(yDeltaEsperado, yDeltaObtenido);
    }
    @Test
    void move() {
        float xEsperado = 2;
        float yEsperado = 2;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xInicial = 1;
        float yInicial = 1;
        Ball nuevaBall = new Ball(xInicial, yInicial, radiusEsperado, xDeltaEsperado, yDeltaEsperado);
        nuevaBall.move();
        float xObtenido = nuevaBall.getX();
        float yObtenido = nuevaBall.getY();
        Assertions.assertEquals(xEsperado, xObtenido);
        Assertions.assertEquals(yEsperado, yObtenido);
    }

    @Test
    void reflectHorizontal() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float xDeltaInicial = -1;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaInicial, yDeltaEsperado);
        nuevaBall.reflectHorizontal();
        float xDeltaObtenido = nuevaBall.getXDelta();
        Assertions.assertEquals(xDeltaEsperado, xDeltaObtenido);
    }

    @Test
    void reflectVertical() {
        float xEsperado = 1;
        float yEsperado = 1;
        int radiusEsperado = 1;
        float xDeltaEsperado = 1;
        float yDeltaEsperado = 1;
        float yDeltaInicial = -1;
        Ball nuevaBall = new Ball(xEsperado, yEsperado, radiusEsperado, xDeltaEsperado, yDeltaInicial);
        nuevaBall.reflectVertical();
        float yDeltaObtenido = nuevaBall.getYDelta();
        Assertions.assertEquals(yDeltaEsperado, yDeltaObtenido);
    }

    @Test
    void testToString() {
        float x = 1;
        float y = 1;
        int radius = 1;
        float xDelta = 1;
        float yDelta = 1;
        String textEsperado = "Ball[(1.0,1.0), speed=(1.0,1.0)]";
        Ball nuevaBall = new Ball(x, y, radius, xDelta, yDelta);
        String textObtenido = nuevaBall.toString();
        Assertions.assertEquals(textEsperado, textObtenido);
    }
}