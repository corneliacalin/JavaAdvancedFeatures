package oop.polymorphism.exercitiu1;

public class HboGoPlayer extends VodPlayer{
    @Override
    public void play(final String title) {
        System.out.println("Playing" + title +" on hbo");
    }
}
