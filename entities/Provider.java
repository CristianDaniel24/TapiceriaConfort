package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

import java.util.List;

public class Provider extends Person implements Storable {
    private String companyName;
    private String address;
    private List<Product> product;

    public Provider() {
    }

    public Provider(Long id, String name, String email, Integer phoneNumber, String companyName, String address) {
        super(id, name, email, phoneNumber);
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

    @Override
    public String serialize() {
        return super.serialize() + "," + this.companyName + "," + this.address;
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        return new Provider(Long.valueOf(fields[0]), fields[1], fields[2], Integer.valueOf(fields[3]), fields[4], fields[5]);
    }
}