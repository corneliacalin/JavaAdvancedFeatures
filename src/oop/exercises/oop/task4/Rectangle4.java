package oop.exercises.oop.task4;

public class Rectangle4 extends Shape4 {
    protected float width;
    protected float length;

    public Rectangle4() {
        super("unknown", false);
        width = 1;
        length = 1;
    }

    public Rectangle4(String color, boolean isFilled, float width, float length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float getArea() {
        return length * width;
    }

    @Override
    public float getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with width= " + width + " and length= " + length + "which is a subclass of " + super.toString();
    }
}


