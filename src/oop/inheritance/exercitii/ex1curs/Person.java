package oop.inheritance.exercitii.ex1curs;

public class Person {
private String firstName;
private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        if(firstName!=null && !"".equals(firstName)){
            this.firstName=firstName;
        }
    }
    public void growOlder(){
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}