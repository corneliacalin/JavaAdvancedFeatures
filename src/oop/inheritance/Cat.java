package oop.inheritance;

public class Cat extends Animals {

    public void purr() {
        System.out.println("The cat is purring");
    }


    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }

    public void purr(String catName){
        System.out.println("The cat " + catName + " is purring");
    }

}
