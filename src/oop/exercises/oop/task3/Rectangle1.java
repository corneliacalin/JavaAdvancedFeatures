package oop.exercises.oop.task3;

public class Rectangle1 extends Shape1 {
    double width;
    double length;

    public Rectangle1() {
        super("unknown",false);
        width = 1;
        length = 1;
    }

    public Rectangle1(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return length*2+width*2;
    }
    public String toString(){
        return "Rectangle with width= "+ width + " and length= "+length + "which is a subclass of "+ super.toString();
    }
}
