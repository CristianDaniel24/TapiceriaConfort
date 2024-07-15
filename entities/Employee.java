package Proyecto.TapiceriaConfort.entities;

public class Employee extends Person {
    private String position;
    private Double salary;

    public Employee(String name, String email, Integer phoneNumber, String position, Double salary) {
        super(name, email, phoneNumber);
        this.position = position;
        this.salary = salary;
    }

    public void performService() {
    }
}