package oop.exercises.oop.task4;

public class Square4 extends Rectangle4 {
    public Square4(String color, boolean isFilled, float size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(float length) {
        super.setWidth(length);
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Square with size = "+ width + " which is sublass of " + super.toString();
    }

}

