package oop.io;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String LastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }
}
