package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.constants.EntityStorage;
import Proyecto.TapiceriaConfort.enums.ServiceStatus;
import Proyecto.TapiceriaConfort.storage.Storable;

import java.time.LocalDateTime;
import java.util.Optional;

public class Employee extends Person implements Storable {
    private String position;
    private Double salary;

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

    public void performService(Long serviceId) {
        System.out.println("Performing service with id: " + serviceId);
        Optional<Service> serviceFound = EntityStorage.serviceStorage.find(new Service(), service -> service.getId().equals(serviceId));
        if (serviceFound.isPresent()) {
            serviceFound.get().setStartedAt(LocalDateTime.now());
            serviceFound.get().setFinishedAt(LocalDateTime.now());
            serviceFound.get().setStatus(ServiceStatus.DONE);
            EntityStorage.serviceStorage.save(serviceFound.get());
        } else {
            System.out.println("Product not found");
        }
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