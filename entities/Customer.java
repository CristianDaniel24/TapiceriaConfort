package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

public class Customer extends Person implements Storable {
    private ShoppingCart shoppingCart;
    private Service service;

    public Customer() {
    }

    public Customer(Long id, String name, String email, Integer phoneNumber) {
        super(id, name, email, phoneNumber);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void buyProduct() {
        System.out.println("Comprando producto..");
    }

    public void requestService() {
        System.out.println("Solicitando servicio");
    }

    @Override
    public String serialize() {
        return super.serialize();
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        return new Customer(Long.valueOf(fields[0]), fields[1], fields[2], Integer.valueOf(fields[3]));
    }
}
