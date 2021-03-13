package oop.patterns.exercise.singleton;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = Animal.getInstance();
        Animal animal2 = Animal.getInstance();

        // AM PUS CONSTRUCT private Animal din PUBLIC si nu ne mai lasa sa instantiem "New"
        //       Animal animal3 = new Animal();
        Animal.getInstance();
        Animal.getInstance();
        Animal.getInstance();
        Animal.getInstance();

        animal1.setType("Lion");

        System.out.println(animal1.getType());

        animal2.setType("Tiger");
        System.out.println(animal2.getType());

    }
}
