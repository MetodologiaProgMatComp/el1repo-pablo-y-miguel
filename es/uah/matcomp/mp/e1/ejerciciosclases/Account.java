package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) { //En esta "definición" de Account el balance = 0.
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = balance + amount;
        return balance;
    }

    public int debit(int amount) throws IllegalArgumentException{
        if (amount > balance) {
            throw new IllegalArgumentException("Amount exceeded balance");
        }
        return balance - amount;
    }
    public int transferTo(Account another, int amount){
        if (amount <= balance){
            another.balance = another.balance + amount;
            balance = balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id="+ id +", name="+name+", balance="+balance+"]";
    }
}
