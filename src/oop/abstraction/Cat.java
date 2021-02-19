package oop.abstraction;

public class Cat {

    private int mood;
    private int energy;
    private int hungry;

    private void meow(){
        System.out.println("meow");
    }

    public void sleep(){
        hungry++;
        energy = energy +1;
    }

    public void play(){
        mood++;
        energy--;
        meow();
    }

    public void feed(){
        hungry--;
        mood++;
        meow();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "mood=" + mood +
                ", energy=" + energy +
                ", hungry=" + hungry +
                '}';
    }
}
