package oop.exercises.exception.task1;

public class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Cannot divide by 0!");
    }
}
