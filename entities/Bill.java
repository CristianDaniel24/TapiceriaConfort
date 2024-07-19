package Proyecto.TapiceriaConfort.entities;

import Proyecto.TapiceriaConfort.storage.Storable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill implements Storable {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private Long id;
    private LocalDateTime date;

    public Bill() {
    }

    public Bill(Long id, LocalDateTime date) {
        this.id = id;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void generateBill() {
    }

    @Override
    public String serialize() {
        return this.id + "," + this.date.format(formatter);
    }

    @Override
    public Storable deserialize(String line) {
        String[] fields = line.split(",");
        return new Bill(Long.valueOf(fields[0]), LocalDateTime.parse(fields[1], formatter));
    }
}
