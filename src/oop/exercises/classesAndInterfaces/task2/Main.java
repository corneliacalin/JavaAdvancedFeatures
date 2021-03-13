package oop.exercises.classesAndInterfaces.task2;

//Movie class
//Create the Movie class which will cover
//title, director, year of release,
//        genre, distributor. This class should contain a default constructor and getter
//        and setter methods. Please consider creating toString method which will be
//        responsible for returning info about a specific object
//MovieCreator class
//Create the static nested MovieCreateor class. It should contain:
//class fields similar tomovie class
// methods witch wil be responsible for setting movie values .
// Each method is being called
//the createMovie method will create the instance of the Movie class. It will
//return it as a method results
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Star wars")
                .setDirector("JJAbrams")
                .setGenre("SF")
                .setYearOfRelease(2000)
                .setPublisher("Disney")
                .createMovie();
        System.out.println(movie);
    }
}
