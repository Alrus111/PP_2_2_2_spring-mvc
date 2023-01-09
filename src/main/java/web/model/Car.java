package web.model;

public class Car {
    private String brand;
    private String color;
    private int id;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Car(String brand, String color, int id) {
        this.brand = brand;
        this.color = color;
        this.id = id;
    }
}
