package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 15);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        Shape shape = rectangle;
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
        shape.print();
        Shape square =new Square(8);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.print();
        square.toString();
    }
}