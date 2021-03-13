package oop.patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        MercedesCarFactory mercedesCarFactory=new MercedesCarFactory();
        Car car1=mercedesCarFactory.order(45000);
        System.out.println(car1.getModel());
    }
}
