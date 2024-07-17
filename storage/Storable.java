package Proyecto.TapiceriaConfort.storage;

public interface Storable {
    String serialize();

    Storable deserialize(String line);
}
