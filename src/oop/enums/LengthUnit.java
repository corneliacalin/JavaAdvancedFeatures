package oop.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(100),
    FOOT(50),
    INCH(2.54);
    private double value;

    LengthUnit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }


}
