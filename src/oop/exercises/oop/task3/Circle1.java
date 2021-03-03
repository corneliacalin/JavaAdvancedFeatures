package oop.exercises.oop.task3;

public class Circle1 extends Shape1 {
    private float radius;

    public Circle1() {
        super("unknown", false);
        radius = 1;

    }

    public Circle1(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);

    }

    public float getPerimeter() {
        return (float) (Math.PI * radius * 2);
    }
    public String toString (){
        return "Circle with radius= "+ radius + " which is a subclass of "+ super.toString();
    }
}
