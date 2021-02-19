package oop.inheritance;

public class Cat extends Animal {

    public void purr() {
        System.out.println("The cat is purring");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void purr(String catName){
        System.out.println("The cat " + catName + " is purring");
    }

}
