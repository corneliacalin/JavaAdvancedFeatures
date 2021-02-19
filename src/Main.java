


import oop.combinate.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ContBancar cont0 = new ContBancar(20000);
        ContBancarExtins cont1 = new ContBancarExtins(10000, 5);
        cont0.afisare();
        cont1.afisare();
        cont0.adauga(500);
        cont1.adauga(500);
        cont0.afisare();
        cont1.afisare();
        cont0.extrage(100);
        cont1.extrage(200);
        cont0.afisare();
        cont1.afisare();
        cont1.adaugaDobandaLunara();
        cont1.afisare();
        B b = new B();

        System.out.println("Durata de calcul a metodei calcul(90 factorial) este " + (double) b.durataCalcul(90) + "milisecunde");

        // testare persoane studenti


        Student student[] = new Student[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String nume, prenume, facultate;
            int varsta, matricol;
            System.out.println("Nume: ");
            nume = scanner.next();
            System.out.println("Prenume: ");
            prenume = scanner.next();
            System.out.println("Varsta: ");
            varsta = scanner.nextInt();
            System.out.println("Facultate: ");
            facultate = scanner.next();
            System.out.println("Matricol: ");
            matricol = scanner.nextInt();
            student[i] = new Student(nume, prenume, varsta, facultate, matricol);
        }
        int contor = 0;
        for (int i = 0;i < 3; i++) {
            String prenume = student[i].getPrenume();
            if (prenume.compareTo("Ion") == 0)
                contor++;
        }
        System.out.println(contor);



    }
            // sfarsit testare studenti



//
//            playWithPolymorphism();
//            playWithInheritance();
//            playWithAbstraction();
//            playWithGeometricFigures();
//
//        }
//
//        private static void playWithGeometricFigures() {
//            //     GeometricFigure figure = new GeometricFigure(); //the class is abstract and can not be instantiated
//            GeometricFigure square = new Square(50);
//            GeometricFigure circle = new Circle(50);
//            GeometricFigure triangle = new Triangle(50,50,50);
//            GeometricFigure rectangle = new Rectangle(50,100);
//
//            System.out.println("Perimetrul patratului este: " + square.calculatePerimeter());
//            System.out.println("Perimetrul cercului este: " + circle.calculatePerimeter());
//            System.out.println("Perimetrul triangle este: " + triangle.calculatePerimeter());
//            System.out.println("Perimetrul dreptughiului este: " + rectangle.calculatePerimeter());
//            System.out.println("Aria patratului este: " + square.calculateAria());
//            System.out.println("Aria cercului este: " + circle.calculateAria());
//            System.out.println("Aria triunghiului este: " + triangle.calculateAria());
//            System.out.println("Aria dreptunghiului este: " + rectangle.calculateAria());
//        }
//
//
//
//
//
//        private static void playWithPolymorphism(){
//            Animal animal = new Animal();
//            Animal dog = new Dog();
//            Animal cat = new Cat();
//            Animal duck = new Duck();
//
//            Cat otherCat = new Cat();
//
//            animal.makeSound();
//            dog.makeSound();
//            cat.makeSound();
//            otherCat.purr();
//            duck.makeSound();
//            otherCat.purr("Angel"); // compile time polymorphism (static) method overloading
//
//            System.out.println(" -----------------------------------------");
//            Animal[] arrayOfAnimals = new Animal[4];
//            arrayOfAnimals[0] = animal;
//            arrayOfAnimals[1] = dog;
//            arrayOfAnimals[2] = cat;
//            arrayOfAnimals[3] = duck;
//
//            // est varianta de for clasic de iterare (parcurgere) a elementelor unui array
//            for (int i = 0; i < arrayOfAnimals.length; i++){
//                arrayOfAnimals[i].makeSound();
//            }
//
//            System.out.println(" -----------------------------------------");
//            // est varianta de for enhanced de iterare (parcurgere) a elementelor unui array
//            for (Animal element :arrayOfAnimals) {
//                element.makeSound();  // run time polymorphism (dinamic) method overriding
//            }
//
//        }
//
//
//        private static void playWithInheritance(){
//            Animal animal = new Animal();
//
//            Dog dog = new Dog();
//            Cat cat = new Cat();
//            Duck duck=new Duck();
//
//            animal.eat();
//            dog.eat();
//            dog.bark();
//            cat.purr();
//            cat.eat();
//            duck.makeSound();
//            duck.eat();
//
//        }
//
//        private static void playWithAbstraction(){
//            oop.abstraction.Cat cat = new oop.abstraction.Cat();
//            cat.sleep();
//            System.out.println(cat);
//            cat.play();
//            System.out.println(cat);
//            cat.feed();
//            System.out.println(cat);
//        }
//
//

            }



