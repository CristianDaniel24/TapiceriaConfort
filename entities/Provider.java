package Proyecto.TapiceriaConfort.entities;

public class Provider extends Person {
    private String companyName;
    private String address;

    public Provider(String name, String email, Integer phoneNumber, String companyName, String address) {
        super(name, email, phoneNumber);
        this.companyName = companyName;
        this.address = address;
    }

    public void supplyProduct() {
    }
}