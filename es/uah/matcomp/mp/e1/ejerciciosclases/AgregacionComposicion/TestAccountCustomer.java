package es.uah.matcomp.mp.e1.ejerciciosclases.AgregacionComposicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.AgregacionComposicion.Customer;
import es.uah.matcomp.mp.e1.ejerciciosclases.AgregacionComposicion.Account;
public class TestAccountCustomer {
    public static void main(String[] args){
        //Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Account class
        Account acc1 = new Account(123, c1, 3333);
        System.out.println(acc1);
        acc1.setBalance (122.36);
        System.out.println("id is: "+ acc1.getId());
        System.out.println("customer is:"+ acc1.getCustomer());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println(acc1.toString());
        double amount = 120.32;
        acc1.deposit(amount);
        System.out.println("Account  after "+amount+" deposit is: "+acc1.toString());
        acc1.withdraw(amount);
        System.out.println("Account  after "+amount+" withdraw is: "+acc1.toString());
    }
}
