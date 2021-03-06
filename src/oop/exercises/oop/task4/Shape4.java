package oop.exercises.oop.task4;

public abstract class Shape4 {
    protected String color;
    protected boolean isFilled;
    public abstract float getPerimeter();
    public abstract float getArea();

    public Shape4() {
        color = "unknown";
        isFilled = false;
    }

    public Shape4(String color, boolean isFilled) {
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




