package oop.generictypes;

public class Car extends Vehicle  {
   private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public  int getMaxSpeed() {
        return maxSpeed;
    }

    public  void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void repair(){
        System.out.println("reparata");
    }


}


