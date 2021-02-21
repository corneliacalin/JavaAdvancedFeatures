package oop.generictypes;

public class Garage<T extends Vehicle> {       // tipul T extinde vehicle
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void repair() {
        vehicle.setMaxSpeed(vehicle.getMaxSpeed() + 10);
    }

    public T getVehicle() {
        return vehicle;
    }
}
