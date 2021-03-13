package oop.inheritance;

public class Dog extends Animals {

    public void bark(){
        System.out.println("Ham ham");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Bow bow");
    }

}
