package oop.combinate;

public class ContBancar {
    public double suma; // daca il fac privat nu il vad in ContBancarExtins

    public ContBancar(double suma) {
        this.suma = suma;
    }

    public void adauga(double suma) {
        this.suma += suma;
    }

    public boolean extrage(double suma) {
        if (this.suma < suma) return false;
        this.suma -= suma;
        return true;
    }

    public double getSuma() {
        return suma;
    }

    public void afisare() {
        System.out.println("Suma din cont este: " + suma);
    }
}
