package Proyecto.TapiceriaConfort.entities;

public class Customer extends Person {
    private Long id;

    public Customer(String name, String email, Integer phoneNumber, Long id) {
        super(name, email, phoneNumber);
        this.id = id;
    }

    public void buyProduct() {
    }

    public void requestService() {
    }
}
