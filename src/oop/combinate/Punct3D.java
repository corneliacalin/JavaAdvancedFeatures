package oop.combinate;

public class Punct3D {
    private int x;
    private int y;
    private int z;

    public Punct3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void muta(int dx, int dy, int dz) {
        x += dx;
        y += dy;
        z += dz;
    }

    public boolean compara(Punct3D p) {
        if (x == p.x && y == p.y && z == p.z) return true;
        return false;
    }

    public double distanta(Punct3D p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dz = this.z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void afisare() {
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("y= " + y);
    }
}
