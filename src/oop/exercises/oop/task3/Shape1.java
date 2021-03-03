package oop.exercises.oop.task3;

import java.time.temporal.IsoFields;

public class Shape1 {
    String color;
    boolean isFilled;

    public Shape1() {
        color = "unknown";
        isFilled = false;
    }

    public Shape1(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        if (isFilled) {
            return "Shape with color of " + color + " and filled ";
        } else {
            return "Shape with color of " + color + " and not filled ";

        }
    }
}
