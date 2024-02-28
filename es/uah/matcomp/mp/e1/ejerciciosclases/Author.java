package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Author {
    private String name;
    private String email;
    public Author(String name, String email){
        this.email = email;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "Author[name="+name+",email="+email+"]";
    }
}
