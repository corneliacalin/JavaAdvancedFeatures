package oop.exercises.oop.task7;

public class CircleGeometricObject implements GeometricObject {
    protected float radius;

    public CircleGeometricObject(float radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;

    }

       @Override
    public String toString() {
        return "CircleGeometricObject{" +
                "radius=" + radius +
                '}';
    }
}
