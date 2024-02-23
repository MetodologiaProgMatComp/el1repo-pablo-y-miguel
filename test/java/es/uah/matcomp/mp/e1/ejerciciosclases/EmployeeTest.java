package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        int IDObtenida = nuevoEmployee.getId();
        Assertions.assertEquals(IDEsperada, IDObtenida);
    }
    @Test
    void getFirstName() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        String firstNameObtenido = nuevoEmployee.getFirstName();
        Assertions.assertEquals(firstNameEsperado, firstNameObtenido);
    }

    @Test
    void getLastName() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        String lastNameObtenido = nuevoEmployee.getLastName();
        Assertions.assertEquals(lastNameEsperado, lastNameObtenido);
    }

    @Test
    void getName() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        String nameEsperado = "Miguel Herranz";
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        String nameObtenido = nuevoEmployee.getName();
        Assertions.assertEquals(nameEsperado, nameObtenido);
    }

    @Test
    void getSalary() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        int salaryObtenido = nuevoEmployee.getSalary();
        Assertions.assertEquals(salaryEsperado, salaryObtenido);
    }

    @Test
    void setSalary() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        int salaryInicial = 0;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryInicial);
        nuevoEmployee.setSalary(salaryEsperado);
        int salaryObtenido = nuevoEmployee.getSalary();
        Assertions.assertEquals(salaryEsperado, salaryObtenido);
    }


    @Test
    void getAnnualSalary() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        int salaryInicial = 27;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryInicial);
        int salaryObtenido = nuevoEmployee.getAnnualSalary();
        Assertions.assertEquals(salaryEsperado, salaryObtenido);
    }
    @Test
    void raiseSalary() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 330;
        int salaryInicial = 300;
        int percent = 10;
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryInicial);
        int salaryObtenido = nuevoEmployee.raiseSalary(percent);
        Assertions.assertEquals(salaryEsperado, salaryObtenido);
    }
    @Test
    void testToString() {
        int IDEsperada = 12345;
        String firstNameEsperado = "Miguel";
        String lastNameEsperado = "Herranz";
        int salaryEsperado = 324;
        String mensajeEsperado = "Employee[id=12345, name=Miguel Herranz,salary= 330]";
        Employee nuevoEmployee = new Employee(IDEsperada, firstNameEsperado, lastNameEsperado, salaryEsperado);
        int salaryObtenido = nuevoEmployee.getSalary();
        Assertions.assertEquals(salaryEsperado, salaryObtenido);
    }
}