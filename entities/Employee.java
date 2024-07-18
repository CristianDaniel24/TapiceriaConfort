package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

import java.util.List;

public class Employee extends Person implements Storable {
    private String position;
    private Double salary;
    private List<Service> services;

    public Employee() {
    }

    public Employee(Long id, String name, String email, Integer phoneNumber, String position, Double salary) {
        super(id, name, email, phoneNumber);
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

    public void performService(Long serviceId) {
        System.out.println("Performing service with id: " + serviceId);
    }

    @Override
    public String serialize() {
        return super.serialize() + "," + position + "," + salary;
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        return new Employee(Long.valueOf(fields[0]), fields[1], fields[2], Integer.valueOf(fields[3]), fields[4], Double.valueOf(fields[5]));
    }
}