package oop.exercises.oop.task3;

public class Main {
    public static void main(String[] args) {
        Shape1 shape = new Shape1("red", false);
        System.out.println(shape);
        Shape1 circle = new Circle1("blue", true, 20);
        System.out.println(circle);
        Shape1 rectangle = new Rectangle1("yellow", true, 20, 30);
        System.out.println(rectangle);
        Shape1 square = new Square1("green", false, 40);
        System.out.println(square);
    }
}

