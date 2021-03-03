package oop.exercises.oop.task2;

public class Student extends Person {
    String typeOfStudy;
    int yearOfStudy;
    float studyPrice;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, float studyPrice) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public float getStudyPrice() {
        return studyPrice;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(float studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + super.getName() +
                ", address= " + super.getAddress()+
                ", typeOfStudy= " + typeOfStudy + '\'' +
                ", yearOfStudy= " + yearOfStudy +
                ", studyPrice= " + studyPrice +
                '}';
    }
}
