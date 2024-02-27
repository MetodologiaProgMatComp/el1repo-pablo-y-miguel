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
        int balanceEsperado1 = 3333;
        int balanceEsperado2 = 0;
        Account nuevoAccount1 = new Account(IDEsperado, nameEsperado, balanceEsperado1);
        Account nuevoAccount2 = new Account(IDEsperado,nameEsperado); //balance = 0
        int balanceObtenido1 = nuevoAccount1.getBalance();
        int balanceObtenido2 = nuevoAccount2.getBalance();
        Assertions.assertEquals(balanceEsperado1, balanceObtenido1);
        Assertions.assertEquals(balanceEsperado2, balanceObtenido2);
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
        int balanceEsperado1 = 1;
        int balanceEsperado2 = 0;
        Account nuevoAccount1 = new Account(IDEsperado, nameEsperado, balanceInicial);
        Account nuevoAccount2 = new Account(IDEsperado, nameEsperado);
        int balanceObtenido1 = nuevoAccount1.debit(amount);
        int balanceObtenido2 = nuevoAccount2.debit(amount);
        Assertions.assertEquals(balanceEsperado1, balanceObtenido1);
        Assertions.assertEquals(balanceEsperado2, balanceObtenido2);
    }
    @Test
    void transferTo() {
        String ID1 = "ID124";
        String name1 = "Pablo";
        String ID2 = "ID126";
        String name2 = "Miguel";
        int balanceInicial2 = 6666;
        int balanceEsperado1 = 3333;
        int balanceEsperado2 = 3333;
        int balanceEsperado3 = 0; // Caso en el que balance < amount.
        int amount = 3333;
        Account nuevoAccount1 = new Account(ID1, name1); //balance = 0
        Account nuevoAccount2 = new Account(ID2, name2, balanceInicial2);
        int balanceObtenido2 = nuevoAccount2.transferTo(nuevoAccount1, amount);
        Assertions.assertEquals(balanceEsperado2, balanceObtenido2);
        Assertions.assertEquals(balanceEsperado1, nuevoAccount1.getBalance());
        int balanceObtenido3 = nuevoAccount1.transferTo(nuevoAccount2, amount);
        Assertions.assertEquals(balanceEsperado3, balanceObtenido3);
    }

    @Test
    void testToString() {
        String IDEsperado = "ID124";
        String nameEsperado = "Pablo";
        int balanceEsperado = 3333;
        String mensajeEsperado1 = "Account[id=ID124, name=Pablo, balance=3333]";
        String mensajeEsperado2 = "Account[id=ID124, name=Pablo, balance=0]";
        Account nuevoAccount1 = new Account(IDEsperado, nameEsperado, balanceEsperado);
        Account nuevoAccount2 = new Account(IDEsperado, nameEsperado);
        String mensajeObtenido1 = nuevoAccount1.toString();
        String mensajeObtenido2 = nuevoAccount2.toString();
        Assertions.assertEquals(mensajeEsperado1, mensajeObtenido1);
        Assertions.assertEquals(mensajeEsperado2, mensajeObtenido2);

    }
}