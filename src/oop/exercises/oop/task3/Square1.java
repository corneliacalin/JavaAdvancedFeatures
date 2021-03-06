package oop.exercises.oop.task3;

public class Square1 extends Rectangle1 {
    public Square1(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
    public String toString() {
        return "Square with size = "+ width + " which is sublass of " + super.toString();
    }

}
