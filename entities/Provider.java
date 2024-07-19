package Proyecto.TapiceriaConfort.entities;

import java.util.List;

public class Provider extends Person {
    private String companyName;
    private String address;
    private List<Product> product;

    public Provider(String name, String email, Integer phoneNumber, String companyName, String address) {
        super(name, email, phoneNumber);
        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void supplyProduct() {
        System.out.println("Proveer Producto");
    }
}