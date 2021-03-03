package oop.inheritance.exercitii.ex1curs;

public class Car extends Vehicle {
    private boolean convertible;

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible=" + convertible + " " + getMaxSpeed() +
                '}';
    }
}
