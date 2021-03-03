package oop.lambda;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person (30);
        // fara lambda
        Predicate<Person> adultPersonTest =new AdultPersonTest();
        System.out.println(adultPersonTest.test(person));

        // implementare pt test lambda
        Predicate<Person> adultPersonTest2=person1 -> person1.getAge()>18;
        System.out.println(adultPersonTest2.test(person));

        // runnable
        Runnable runnable = () -> System.out.println("Runnig is runnable");
        runnable.run();

        // lambda method reference

        Predicate<Person> adultPersonTest3=Person::isAdult;

        System.out.println(adultPersonTest3.test(person));
// block of code lambda
        UnaryOperator<Integer> square=i->{
            int result= i*i;
            return result;
        };
        System.out.println(square.apply(100));



    }
}
