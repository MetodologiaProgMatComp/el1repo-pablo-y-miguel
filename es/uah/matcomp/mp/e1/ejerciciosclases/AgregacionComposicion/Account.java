package es.uah.matcomp.mp.e1.ejerciciosclases.AgregacionComposicion;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance;
    public Account (int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account (int id, Customer customer){
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        DecimalFormat numeroDecimal = new DecimalFormat("x.xx");
        String balanceRedondeado = numeroDecimal.format(balance);
        return customer.toString()+" balance ="+balanceRedondeado;
    }
    public String getCustomerName(){
        String customerName = customer.getName();
        return customerName;
    }
    public Account deposit(double amount){
        Account account = new Account(int id, Customer customer, double balance);
        balance = balance + amount;
        return account;
    }
    public Account withdraw(double amount){
        Account account = new Account(int id, Customer customer, double balance);
        if (balance >= amount){
            balance =- amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return account;
    }
}

