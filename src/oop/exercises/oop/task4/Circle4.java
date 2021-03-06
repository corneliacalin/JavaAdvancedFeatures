package oop.exercises.oop.task4;

public class Circle4 extends Shape4 {
    private float radius;

    public Circle4() {
        super("unknown", false);
        radius = 1;

    }

    public Circle4(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);

    }

    @Override
    public float getPerimeter() {
        return (float) (Math.PI * radius * 2);
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + " which is a subclass of " + super.toString();
    }
}

