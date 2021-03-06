package oop.exercises.oop.task4;

public class Main {
    public static void main(String[] args) {


        Shape4[] shapes = {
                new Circle4("blue", true, 20),
                new Rectangle4("yellow", true, 20, 30),
                new Square4("green", false, 40)};
        for (Shape4 shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
