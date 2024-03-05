package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1);
        int IDEsperada = 112;
        int IDObtenida = acc1.getId();
        Assertions.assertEquals(IDEsperada, IDObtenida);
    }
    @Test
    void getCustomer() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1);
        Customer customerObtenido = acc1.getCustomer();
        Assertions.assertEquals(custo1, customerObtenido);
    }

    @Test
    void getBalance() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1);
        double balanceEsperada = 0;
        double balanceObtenida = acc1.getBalance();
        Assertions.assertEquals(balanceEsperada, balanceObtenida);
    }

    @Test
    void setBalance() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1,233.337);
        double balanceEsperada = 132;
        acc1.setBalance(132);
        double balanceObtenida = acc1.getBalance();
        Assertions.assertEquals(balanceEsperada, balanceObtenida);
    }
    @Test
    void testToString() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1,233.337);
        String textEsperado = "Miguel(112) balance =233,34";
        String textObtenido = acc1.toString();
        Assertions.assertEquals(textEsperado, textObtenido);
    }

    @Test
    void getCustomerName() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1,233.337);
        String nameEsperado = "Miguel";
        String nameObtenido = acc1.getCustomerName();
        Assertions.assertEquals(nameEsperado, nameObtenido);
    }
    @Test
    void deposit() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1,233.337);
        Account acc2= new Account(112, custo1,234.337);
        Account depositEsperado = acc2;
        Account depositObtenido = acc1.deposit(1);
        Assertions.assertEquals(depositEsperado.getId(), depositObtenido.getId());
        Assertions.assertEquals(depositEsperado.getCustomer(), depositObtenido.getCustomer());
        Assertions.assertEquals(depositEsperado.getBalance(), depositObtenido.getBalance());
    }

    @Test
    void withdraw() {
        Customer custo1 = new Customer(112, "Miguel", 'm');
        Account acc1= new Account(112, custo1,233.337);
        Account acc2= new Account(112, custo1,232.337);
        Account withdrawEsperado = acc2;
        Account withdrawEsperado1 = null;
        Account withdrawObtenido = acc1.withdraw(1);
        Account withdrawObtenido1 = acc1.withdraw(500);
        Assertions.assertEquals(withdrawEsperado.getId(), withdrawObtenido.getId());
        Assertions.assertEquals(withdrawEsperado.getCustomer(), withdrawObtenido.getCustomer());
        Assertions.assertEquals(withdrawEsperado.getBalance(), withdrawObtenido.getBalance());
        Assertions.assertEquals(withdrawEsperado1, withdrawObtenido1);
    }
}