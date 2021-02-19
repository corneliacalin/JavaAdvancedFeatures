package oop.inheritance;

public class Rectangle extends GeometricFigure{
private int lengthSide, widthSide;



    public Rectangle(int lengthSide, int widthSide) {
        this.lengthSide = lengthSide;
        this.widthSide=widthSide;
    }

    @Override
    public double calculatePerimeter() {
        return lengthSide*2+ widthSide*2;
    }
    @Override
    public double calculateAria(){ return lengthSide*widthSide;}
}
