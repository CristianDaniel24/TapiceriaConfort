package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

import java.util.List;

public class Employee extends Person implements Storable {
    private String position;
    private Double salary;
    private List<Service> services;

    public Employee() {
    }

    public Employee(String name, String email, Integer phoneNumber, String position, Double salary) {
        super(name, email, phoneNumber);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public String serialize() {
        return super.serialize() + "," + position + "," + salary;
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        return new Employee(fields[0], fields[1], Integer.valueOf(fields[2]), fields[3], Double.valueOf(fields[4]));
    }
}