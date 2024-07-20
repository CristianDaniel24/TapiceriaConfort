package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.enums.ShoppingCartStatus;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private Long id;
    private LocalDateTime createdAt;
    private ShoppingCartStatus status;
    private List<Product> products;
    private Bill bill;

    public ShoppingCart() {
        this.products = new LinkedList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShoppingCartStatus getStatus() {
        return status;
    }

    public void setStatus(ShoppingCartStatus status) {
        this.status = status;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void purchaseCart() {
    }

    public void clearCart() {
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct() {
    }
}
