package oop.combinate;

public class Punct3DColor extends Punct3D {
    private String culoare;

    public Punct3DColor(int x, int y, int z, String culoare) {
        super(x, y, z);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }


    public boolean compara(Punct3DColor p) {
        if (this.getX() == p.getX() && this.getY() == p.getY() && this.getZ() == p.getZ() && this.getCuloare() == p.getCuloare())
            return true;
        return false;
    }

    @Override
    public void afisare() {
        System.out.println("x= " + getX());
        System.out.println("y= " + getY());
        System.out.println("y= " + getZ());
        System.out.println("culoarea = " + getCuloare());
    }
}
