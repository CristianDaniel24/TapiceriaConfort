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

    public void setId(Long id) {
        this.id = id;
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
}
