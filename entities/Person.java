package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

public abstract class Person implements Storable {
    private Long id;
    private String name;
    private String email;
    private Integer phoneNumber;

    public Person() {
        this.id = 0L;
    }

    public Person(Long id, String name, String email, Integer phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return this.id + "," + this.name + "," + this.email + "," + this.phoneNumber;
    }

    @Override
    public Storable deserialize(String line) {
        return null;
    }
}