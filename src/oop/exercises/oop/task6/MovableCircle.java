package oop.exercises.oop.task6;

public class MovableCircle implements Movable {
    private int radius;

    MovablePoint movablePoint;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);

    }

    public void moveUp() {
        movablePoint.moveUp();
    }
    public void moveDown() {
        movablePoint.moveDown();
    }
    public void moveLeft() {

        movablePoint.moveLeft();
    }
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
