package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceEsperado = 3333;
        Account nuevoAccount = new Account(IDEsperado, nameEsperado, balanceEsperado);
        String IDObtenido = nuevoAccount.getID();
        Assertions.assertEquals(IDEsperado, IDObtenido);
    }
    @Test
    void getName() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceEsperado = 3333;
        Account nuevoAccount = new Account(IDEsperado, nameEsperado, balanceEsperado);
        String nameObtenido = nuevoAccount.getName();
        Assertions.assertEquals(nameEsperado, nameObtenido);
    }
    @Test
    void getBalance() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceEsperado = 3333;
        Account nuevoAccount = new Account(IDEsperado, nameEsperado, balanceEsperado);
        int balanceObtenido = nuevoAccount.getBalance();
        Assertions.assertEquals(balanceEsperado, balanceObtenido);
    }

    @Test
    void credit() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceEsperado = 3333;
        int amount = 3333;
        Account nuevoAccount = new Account(IDEsperado, nameEsperado); //balance = 0
        int balanceObtenido = nuevoAccount.credit(amount);
        Assertions.assertEquals(balanceEsperado, balanceObtenido);
    }
    @Test
    void debit() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceInicial = 3333;
        int amount = 3332;
        int balanceEsperado = 1;
        String mensajeEsperado = "Amount exceeded balance";
        Account nuevoAccount1 = new Account(IDEsperado, nameEsperado, balanceInicial);
        Account nuevoAccount2 = new Account(IDEsperado, nameEsperado);
        int balanceObtenido = nuevoAccount1.debit(amount);
        int mensajeObtenido = nuevoAccount2.debit(amount);
        Assertions.assertEquals(balanceEsperado, balanceObtenido);
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }
    @Test
    void transferTo() {
    }

    @Test
    void testToString() {

    }
}