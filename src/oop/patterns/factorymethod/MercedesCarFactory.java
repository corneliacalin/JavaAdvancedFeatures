package oop.patterns.factorymethod;

public class MercedesCarFactory {
    public Car order(int budget) {
        if (budget < 20000) {
            return new Glk();
        }
        if (budget < 40000) {
            return new Glc();
        }
        return new Gle();
    }
}

