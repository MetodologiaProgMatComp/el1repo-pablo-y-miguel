package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void getHour() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        Time nuevoTime = new Time(hourEsperada, minuteEsperado, secondEsperado);
        int hourObtenida = nuevoTime.getHour();
        Assertions.assertEquals(hourEsperada, hourObtenida);
    }

    @org.junit.jupiter.api.Test
    void getMinute() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        Time nuevoTime = new Time(hourEsperada, minuteEsperado, secondEsperado);
        int minuteObtenido = nuevoTime.getMinute();
        Assertions.assertEquals(minuteEsperado, minuteObtenido);
    }

    @org.junit.jupiter.api.Test
    void getSecond() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        Time nuevoTime = new Time(hourEsperada, minuteEsperado, secondEsperado);
        int secondObtenido = nuevoTime.getSecond();
        Assertions.assertEquals(secondEsperado, secondObtenido);
    }

    @org.junit.jupiter.api.Test
    void setHour() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        int hourInicial = 13;
        Time nuevoTime = new Time(hourInicial, minuteEsperado, secondEsperado);
        nuevoTime.setHour(hourEsperada);
        int hourObtenida = nuevoTime.getHour();
        Assertions.assertEquals(hourEsperada, hourObtenida);
    }

    @org.junit.jupiter.api.Test
    void setMinute() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        int minuteInicial = 13;
        Time nuevoTime = new Time(hourEsperada, minuteInicial, secondEsperado);
        nuevoTime.setMinute(minuteEsperado);
        int minuteObtenido = nuevoTime.getMinute();
        Assertions.assertEquals(minuteEsperado, minuteObtenido);
    }

    @org.junit.jupiter.api.Test
    void setSecond() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        int secondInicial = 13;
        Time nuevoTime = new Time(hourEsperada, minuteEsperado, secondInicial);
        nuevoTime.setSecond(secondEsperado);
        int secondObtenido = nuevoTime.getSecond();
        Assertions.assertEquals(secondEsperado, secondObtenido);
    }

    @org.junit.jupiter.api.Test
    void setTime() {
        int hourEsperada = 23;
        int minuteEsperado = 45;
        int secondEsperado = 21;
        int hourInicial = 12;
        int minuteInicial = 59;
        int secondInicial = 1;
        Time nuevoTime = new Time(hourInicial, minuteInicial, secondInicial);
        nuevoTime.setTime(hourEsperada, minuteEsperado, secondEsperado);
        int hourObtenida = nuevoTime.getHour();
        int minuteObtenido = nuevoTime.getMinute();
        int secondObtenido = nuevoTime.getSecond();
        Assertions.assertEquals(hourEsperada, hourObtenida);
        Assertions.assertEquals(minuteEsperado, minuteObtenido);
        Assertions.assertEquals(secondEsperado, secondObtenido);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        int hourInicial = 12;
        int minuteInicial = 59;
        int secondInicial = 1;
        String textEsperado = "12:59:01";
        Time nuevoTime = new Time(hourInicial, minuteInicial, secondInicial);
        String textObtenido = nuevoTime.toString();
        Assertions.assertEquals(textEsperado, textObtenido);
    }

    @org.junit.jupiter.api.Test
    void nextSecond() {
        int hourInicial = 12;
        int minuteInicial = 59;
        int secondInicial = 58;
        String textEsperado1 = "12:59:59";
        String textEsperado2 = "13:00:00";
        Time nuevoTime = new Time(hourInicial, minuteInicial, secondInicial);
        nuevoTime.nextSecond();
        String textObtenido1 = nuevoTime.toString();
        nuevoTime.nextSecond();
        String textObtenido2 = nuevoTime.toString();
        Assertions.assertEquals(textEsperado1, textObtenido1);
        Assertions.assertEquals(textEsperado2, textObtenido2);
    }

    @org.junit.jupiter.api.Test
    void previousSecond(){
        int hourInicial = 13;
        int minuteInicial = 0;
        int secondInicial = 1;
        String textEsperado1 = "13:00:00";
        String textEsperado2 = "12:59:59";
        Time nuevoTime = new Time(hourInicial, minuteInicial, secondInicial);
        nuevoTime.previousSecond();
        String textObtenido1 = nuevoTime.toString();
        nuevoTime.previousSecond();
        String textObtenido2 = nuevoTime.toString();
        Assertions.assertEquals(textEsperado1, textObtenido1);
        Assertions.assertEquals(textEsperado2, textObtenido2);
    }
}