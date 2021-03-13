package oop.exercises.exception.task1;

//Create the divide method which has to divide the two numbers that are the
//attributes of the method. In case the second parameter of the method is 0, a
//non-default exception should be thrown: CannotDivideBy0Exception

public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
DivideMethodError.divide(5,0);
    }
}
