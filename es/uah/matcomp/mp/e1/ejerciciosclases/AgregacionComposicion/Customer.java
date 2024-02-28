package es.uah.matcomp.mp.e1.ejerciciosclases.AgregacionComposicion;

public class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name, char gender){
        this.id =  id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        if (gender == 'm' || gender =='f' );
            return gender;
        }else {
            return '\0';
        }
    }
}
