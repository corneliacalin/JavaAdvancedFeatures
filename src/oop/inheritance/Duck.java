package oop.inheritance;

public class Duck extends Animals {
    @Override
    public void eat() {
        System.out.println("The Duck is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack quack");
    }
}
