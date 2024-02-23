package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        Date nuevaDate = new Date(dayEsperado, monthEsperado, yearEsperado);
        int dayObtenido = nuevaDate.getDay();
        Assertions.assertEquals(dayEsperado, dayObtenido);
    }

    @Test
    void getMonth() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        Date nuevaDate = new Date(dayEsperado, monthEsperado, yearEsperado);
        int monthObtenido = nuevaDate.getMonth();
        Assertions.assertEquals(monthEsperado, monthObtenido);
    }

    @Test
    void getYear() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        Date nuevaDate = new Date(dayEsperado, monthEsperado, yearEsperado);
        int yearObtenido = nuevaDate.getYear();
        Assertions.assertEquals(yearEsperado, yearObtenido);
    }

    @Test
    void setDay() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        int dayInicial = 30;
        Date nuevaDate = new Date(dayInicial, monthEsperado, yearEsperado);
        nuevaDate.setDay(dayEsperado);
        int dayObtenido = nuevaDate.getDay();
        Assertions.assertEquals(dayEsperado, dayObtenido);
    }

    @Test
    void setMonth() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        int monthInicial = 7;
        Date nuevaDate = new Date(dayEsperado, monthInicial, yearEsperado);
        nuevaDate.setMonth(monthEsperado);
        int monthObtenido = nuevaDate.getMonth();
        Assertions.assertEquals(monthEsperado, monthObtenido);
    }

    @Test
    void setYear() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        int yearInicial = 1999;
        Date nuevaDate = new Date(dayEsperado, monthEsperado, yearInicial);//Tiene el valor de year=1999
        nuevaDate.setYear(yearEsperado);
        int yearObtenido = nuevaDate.getYear();
        Assertions.assertEquals(yearEsperado, yearObtenido);
    }

    @Test
    void setDate() {
    }

    @Test
    void testToString() {
        int dayEsperado = 23;
        int monthEsperado = 6;
        int yearEsperado = 2005;
        String mensajeEsperado = "23/06/2005";
        Date nuevaDate = new Date(dayEsperado, monthEsperado, yearEsperado);
        String mensajeObtenido = nuevaDate.toString();
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }
}