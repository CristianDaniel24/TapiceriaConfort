package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.constants.EntityStorage;
import Proyecto.TapiceriaConfort.enums.ServiceStatus;
import Proyecto.TapiceriaConfort.storage.Storable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

public class Service implements Storable {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private Long id;
    private String name;
    private Double price;
    private ServiceStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private Bill bill;
    private Long userId;

    public Service() {
        this.id = new Random().nextLong();
        this.price = 0.0;
        this.status = ServiceStatus.NOT_STARTED;
        this.bill = new Bill();
    }

    public Service(Long id, String name, Double price, ServiceStatus status, LocalDateTime createdAt, LocalDateTime startedAt, LocalDateTime finishedAt, Bill bill, Long userId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.createdAt = createdAt;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
        this.bill = bill;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void startService() {
        this.startedAt = LocalDateTime.now();
        this.status = ServiceStatus.IN_PROGRESS;
    }

    public void finishService() {
        this.finishedAt = LocalDateTime.now();
        this.status = ServiceStatus.DONE;
    }

    public void displayDetails() {
        System.out.println("Service details are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Status: " + this.status);
    }

    @Override
    public String serialize() {
        String createdAtString = this.createdAt != null ? this.createdAt.format(formatter) : "";
        String startedAtString = this.startedAt != null ? this.startedAt.format(formatter) : "";
        String finishedAtString = this.finishedAt != null ? this.finishedAt.format(formatter) : "";
        Long serializedBill = this.bill == null ? 0L : this.bill.getId();
        return this.id + ","
                + this.name + ","
                + this.price + ","
                + this.status + ","
                + createdAtString + ","
                + startedAtString + ","
                + finishedAtString + ","
                + serializedBill + ","
                + this.userId;
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        Bill dsBill = EntityStorage.billStorage.find(new Bill(), Bill -> Objects.equals(bill.getId(), Long.valueOf(fields[7]))).orElse(null);

        return new Service(Long.valueOf(
                fields[0]),
                fields[1],
                Double.valueOf(fields[2]),
                ServiceStatus.valueOf(fields[3]),
                parseDate(fields[4]),
                parseDate(fields[5]),
                parseDate(fields[6]),
                dsBill,
                Long.valueOf(fields[8])
        );
    }

    private LocalDateTime parseDate(String value) {
        return value.isEmpty() ? null : LocalDateTime.parse(value, formatter);
    }
}
