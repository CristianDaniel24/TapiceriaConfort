package Proyecto.TapiceriaConfort.entities;

public abstract class Person {
    protected String nombre;
    protected String email;
    protected int phoneNumber;

    public Person(String nombre,String email,int phoneNumber){
        this.nombre = nombre;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}