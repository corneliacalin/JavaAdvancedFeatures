package oop.combinate;

public class B extends A {
    public void calcul(int x) { // calculeaza x factorial
        double factorial = 1;
        for (int y = 1; y <= x; y++) {
            factorial *= y;
        }
        System.out.println("10 factorial " + (double)factorial);

    }
}
