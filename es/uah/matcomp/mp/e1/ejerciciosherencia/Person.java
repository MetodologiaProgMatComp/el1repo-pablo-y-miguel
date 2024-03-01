package es.uah.matcomp.mp.e1.ejerciciosherencia;

public class Person {
    private String name;
    private String address;
    public Person (String name, String adress){}
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){}
}
