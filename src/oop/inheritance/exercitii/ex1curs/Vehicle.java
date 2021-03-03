package oop.inheritance.exercitii.ex1curs;

public class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxspeed) {
        this.maxSpeed = maxspeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
