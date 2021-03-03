package oop.exercises.oop.task2;


public class Main {
    public static void main(String[] args) {
Person student1 = new Student ("Andrei","sibiu","ing",5,5000);
Person student2 = new Student("Gheorghe","Brasov","medicina",6,10000);
Lecturer profesor1 = new Lecturer("Simion","Sibiu","Istorie",5000);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(profesor1);
        student1.setAddress("Iasi");
        student2.setName("Gheorghe Gheorghe");
        profesor1.setSalary(10000);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(profesor1);


    }
}
