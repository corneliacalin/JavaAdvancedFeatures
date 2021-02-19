package oop.inheritance;

//import com.sda.alina.Main;

public class Square extends GeometricFigure{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
    @Override
    public double calculateAria(){ return side*side;}
}
