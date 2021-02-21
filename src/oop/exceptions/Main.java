package oop.exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String text = null;
            text.toString();

            int x = 5 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmetic exception" + arithmeticException.getMessage());
        } catch (Exception e) {
            System.out.println("exception is cought and handled " + e.getMessage());
        } finally {
            System.out.println("this is printed anyway");
        }
        int[] array = {5, 7};
        int index = 1;
        printArrayElement(array, index);


        System.out.println("intr un sir");
        String doubleString="10.5";
        System.out.println(Double.parseDouble(doubleString));

        //int double string
        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("intr un sir");
        n = scanner.next();
        try {
            Integer.parseInt(n);
            System.out.println("INT "+ Integer.parseInt(n));
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(n);
                System.out.println("DOUBLE "+Double.parseDouble(n));
            } catch (NumberFormatException e1) {
                System.out.println("Hey ai introdus un string");
            }
        }
        // sf int double string

//        String doubleString1="10,5";
//        System.out.println(Double.valueOf(Double.parseDouble(doubleString1)));

//        try (Scanner scanner = new Scanner(System.in)) {
//            if (scanner.hasNextInt()) {
//                int n = scanner.nextInt();
//                System.out.println("INT " + n);
//            } else if (scanner.hasNextDouble()) {
//                double n = scanner.nextDouble();
//                System.out.println("DOUBLE " + n);
//            } else {
//                throw new MyException("Hey ai introdus un string");
//            }
//
//
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//
//        }

    }


    public static void printArrayElement(int[] array, int index) throws MyException {
        if (index < 0 || index >= array.length) {
            throw new MyException("incorect index value");
        }
        System.out.println(array[index]);


    }


}
