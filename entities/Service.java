package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.enums.ServiceStatus;

import java.time.LocalDateTime;

public class Service {

    private int id;
    private String name;
    private Double price;
    private ServiceStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private Bill bill;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = createdAt;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt() {
        this.startedAt = startedAt;
    }

    public LocalDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt() {
        this.finishedAt = finishedAt;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill() {
        this.bill = bill;
    }

    public void startService() {
    }

    public void finishService() {
    }

    public void completeService() {
    }
}
