package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.enums.ShoppingCartStatus;

import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCart {

    private Long id;
    private LocalDateTime createdAt;
    private ShoppingCartStatus status;
    private List<Product> product;
    private Bill bill;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = createdAt;
    }

    public ShoppingCartStatus getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct() {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill() {
        this.bill = bill;
    }

    public void purchaseCart() {
    }

    public void clearCart() {
    }

    public void addProduct() {
    }

    public void removeProduct() {
    }
}
