package oop.exercises.oop.task6;

public class Main {
    public static void main(String[] args) {
    MovablePoint movablePoint = new MovablePoint(1,1,2,2);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.moveLeft();
        movablePoint.moveDown();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(10,1,1,2,2);
        movableCircle.moveUp();
        movableCircle.moveDown();
        movableCircle.moveLeft();
        movableCircle.moveRight();
        System.out.println(movableCircle);



    }
}
