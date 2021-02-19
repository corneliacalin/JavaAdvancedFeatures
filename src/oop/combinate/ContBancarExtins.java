package oop.combinate;

public class ContBancarExtins extends ContBancar {
    private double rataDobanziiAnuale;

    public ContBancarExtins(double suma, double rataDobanziiAnuale) {
        super(suma);
        this.rataDobanziiAnuale = rataDobanziiAnuale;
    }

    public void adaugaDobandaLunara() {
        double dobanda = this.getSuma() * rataDobanziiAnuale / 1200;
        this.adauga(dobanda);
    }

    public void afisare() {
        System.out.println("Suma din cont este: " + this.getSuma());
        System.out.println("Rata dobanzii este: " + rataDobanziiAnuale);
    }

}
