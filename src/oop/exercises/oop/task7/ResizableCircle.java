package oop.exercises.oop.task7;

public class ResizableCircle extends CircleGeometricObject implements Resizable  {

    public ResizableCircle (float radius){
        super(radius);
    }

    @Override
    public void resize1(int percent){
        radius =radius*percent/100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
