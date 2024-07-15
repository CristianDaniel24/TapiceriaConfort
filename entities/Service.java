package Proyecto.TapiceriaConfort.entities;

import java.time.LocalDateTime;

public class Service {

    private int id;
    private String name;
    private Double price;
    private enum status{};
    private LocalDateTime createdAt;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;

    public void startService(){
    }
    public void finishService(){
    }
    public void completeService(){
    }
}
