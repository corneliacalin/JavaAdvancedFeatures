package oop.inheritance;

public class Triangle extends GeometricFigure {
    private int side1;
    private int side2;
    private int side3;

    public Triangle (int side1, int side2, int side3){

    }
    @Override
    public double calculatePerimeter(){
        return side1+side2+side3;
    }
    @Override
    public double calculateAria(){
        double semiPerimeter;
        semiPerimeter=(side1+side2+side3)/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}

