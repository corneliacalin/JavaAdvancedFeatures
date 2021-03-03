package oop.exercises.oop.task2;

public class Lecturer extends Person {
    String specialization;
    float salary;

    public Lecturer(String name, String address, String specialization, float salary) {
        super(name,address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name= " + super.getName() +
                ", address= " + super.getAddress()+
                ", specialization= " + specialization + '\'' +
                ", salary= " + salary +
                '}';
    }
}
