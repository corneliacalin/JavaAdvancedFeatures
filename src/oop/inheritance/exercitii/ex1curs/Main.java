package oop.inheritance.exercitii.ex1curs;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Calin", 45);
        Person person2 = new Person ("Gheorghe", 30);
        person1.setFirstName("");
        person2.setFirstName("Ana");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        person1.setFirstName("Andreea");
        person1.growOlder();
        person2.growOlder();

        Car mycar =new Car(100,true);
        Vehicle myvehicle =new Car(210,true);
        System.out.println(mycar.toString());
        System.out.println(myvehicle.toString());



    }
}
