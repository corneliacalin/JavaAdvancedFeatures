package oop.interfaces;

public class Rectangle implements Shape, OtherShape {

    private double lenght, width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }
    @Override
    public void print(){
    System.out.println("inside rectangle");
}

    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (lenght + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

}
