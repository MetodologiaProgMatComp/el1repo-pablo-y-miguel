package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(112, "Miguel", 'm');
        assertEquals(112, customer.getId());
    }
    @Test
    void getName() {
        Customer customer = new Customer(112, "Miguel", 'm');
        assertEquals("Miguel", customer.getName());
    }
    @Test
    void getGender() {
        Customer customer1 = new Customer(112, "Miguel", 'm');
        assertEquals('m', customer1.getGender());
        Customer customer2 = new Customer(112, "Miguel", 'x');//Si gender!= 'm' o 'f'.
        assertEquals('\0', customer2.getGender());
    }
    @Test
    void testToString() {
        Customer customer1 = new Customer(112, "Miguel", 'm');
        String textEsperado = "Miguel(112)";
        Assertions.assertEquals(textEsperado, customer1.toString());
    }
}