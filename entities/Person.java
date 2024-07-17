package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

public abstract class Person implements Storable {
    private String name;
    private String email;
    private Integer phoneNumber;

    public Person() {
    }

    public Person(String name, String email, Integer phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String serialize() {
        return name + "," + email + "," + phoneNumber;
    }

    @Override
    public Storable deserialize(String line) {
        return null;
    }
}