package session9.practice.car_dealership;

public class Car {

    private String brand;
    private String model;
    private int speed;

    void accelerate(){
        speed += 10;
    }

    void deccelerate(){
        speed -= 10;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
