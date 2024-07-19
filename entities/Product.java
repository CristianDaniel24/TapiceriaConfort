package Proyecto.TapiceriaConfort.entities;

public class Product {

    private String name;
    private Double price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("los detalles del productos son:" +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nStock: " + stock);
    }
}