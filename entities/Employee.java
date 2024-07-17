package Proyecto.TapiceriaConfort.entities;

import java.util.List;

public class Employee extends Person {
    private String position;
    private Double salary;
    private List<Service> services;

    public Employee(String name, String email, Integer phoneNumber, String position, Double salary) {
        super(name, email, phoneNumber);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition() {
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

    public void performService() {
    }
}