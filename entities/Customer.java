package Proyecto.TapiceriaConfort.entities;

public class Customer extends Person {
    private Long id;
    private ShoppingCart shoppingCart;
    private Service service;

    public Customer(String name, String email, Integer phoneNumber, Long id) {
        super(name, email, phoneNumber);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart() {
        this.shoppingCart = shoppingCart;
    }

    public Service getService() {
        return service;
    }

    public void setService() {
        this.service = service;
    }

    public void buyProduct() {
    }

    public void requestService() {
    }
}
