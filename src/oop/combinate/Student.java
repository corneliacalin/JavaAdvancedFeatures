package oop.combinate;


public class Student extends Persoana {
    private String facultate;
    private int numarMatricol;

    public Student(String nume, String prenume, int varsta, String facultate, int numarMatricol) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.numarMatricol = numarMatricol;
    }


    public void afisare() {
        System.out.println("Student{" +
                "Nume='" + getNume() + "Prenume='" + getPrenume() + "Facultate= " + facultate + '\'' +
                ", numarMatricol=" + numarMatricol +
                '}');
    }

    public String getFacultate() {
        return facultate;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }
}
