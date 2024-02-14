package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int ammount) {
        this.balance = balance + ammount;
        return balance;
    }

    public int debit(int ammount) {
        if (ammount <= balance) {
            this.balance = balance - ammount;
        } else {

        }
        return balance;
    }
}
