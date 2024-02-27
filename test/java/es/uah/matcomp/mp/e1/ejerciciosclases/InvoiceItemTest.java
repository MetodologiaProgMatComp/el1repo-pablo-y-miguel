package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;;
        double unitPriceEsperado = 0.01;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        String IDObtenido = nuevoInvoiceItem.getId();
        Assertions.assertEquals(IDEsperado, IDObtenido);
    }

    @Test
    void getDesc() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;;
        double unitPriceEsperado = 0.01;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        String descObtenida = nuevoInvoiceItem.getDesc();
        Assertions.assertEquals(descEsperada, descObtenida);
    }

    @Test
    void getQty() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;;
        double unitPriceEsperado = 0.01;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        int qtyObtenido = nuevoInvoiceItem.getQty();
        Assertions.assertEquals(qtyEsperado, qtyObtenido);
    }

    @Test
    void setQty() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 33;;
        double unitPriceEsperado = 0.01;
        int qtyInicial = 103;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada, qtyInicial,unitPriceEsperado);
        nuevoInvoiceItem.setQty(qtyEsperado);
        int qtyObtenido = nuevoInvoiceItem.getQty();
        Assertions.assertEquals(qtyEsperado, qtyObtenido);
    }

    @Test
    void getUnitPrice() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;
        double unitPriceEsperado = 0.01;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        double unitPriceObtenido = nuevoInvoiceItem.getUnitPrice();
        Assertions.assertEquals(unitPriceEsperado, unitPriceObtenido);
    }

    @Test
    void setUnitPrice() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;
        double unitPriceEsperado = 0.01;
        double unitPriceInicial = 0.03;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceInicial);
        nuevoInvoiceItem.setUnitPrice(unitPriceEsperado);
        double unitPriceObtenido = nuevoInvoiceItem.getUnitPrice();
        Assertions.assertEquals(unitPriceEsperado, unitPriceObtenido);
    }

    @Test
    void getTotal() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;;
        double unitPriceEsperado = 0.01;
        double totalEsperado = 0.23;
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        double totalObtenido = nuevoInvoiceItem.getTotal();
        Assertions.assertEquals(totalEsperado, totalObtenido);
    }

    @Test
    void testToString() {
        String IDEsperado = "ID123";
        String descEsperada = "Descripción";
        int qtyEsperado = 23;;
        double unitPriceEsperado = 0.01;
        String textEsperado = "InvoiceItem[id=ID123, desc=Descripción, qty=23, unitPrice=0.01]";
        InvoiceItem nuevoInvoiceItem = new InvoiceItem(IDEsperado, descEsperada,qtyEsperado,unitPriceEsperado);
        String textObtenido = nuevoInvoiceItem.toString();
        Assertions.assertEquals(textEsperado, textObtenido);
    }
}