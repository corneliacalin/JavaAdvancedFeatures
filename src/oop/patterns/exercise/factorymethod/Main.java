package oop.patterns.exercise.factorymethod;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory=new PizzaFactory();
        Pizza pizza1= pizzaFactory.getPizza(2);
        System.out.println(pizza1.getDetectedPizza());

    }


}
