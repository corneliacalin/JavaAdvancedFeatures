package oop.exercises.exception.task2;
//BookRepository class
//Create the BookRepository class, which will be responsible for:
//adding Book objects
//removing Book objects
//searching for objects of the Book type with the indicated name
//searching for objects of the Book type with the indicated id
//removing objects of the Book type based on the provided id
//Book class
//The Book class should include the following
//        id
//        title
//        author
//        year of release
//        NoBookFoundException
//        In case of lack of searched results an exception should be thrown. This
//        exception should accept the String parameter object with information about
//        which elements could not be found.


import java.util.List;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(new Book("1", "titlu1", "autor1", 2020));
        bookRepository.addBook(new Book("2", "titlu2", "autor2", 2021));
        bookRepository.addBook(new Book("3", "titlu3", "autor3", 2022));
        bookRepository.addBook(new Book("4", "titlu4", "autor4", 2023));
        System.out.println(bookRepository.toString());
        List<Book> book = bookRepository.findBookById("2");
        System.out.println(book.toString());

        List<Book> book1 = bookRepository.findBookById("4");
        System.out.println(book1.toString());
        bookRepository.deleteBook("4");


        }
    }

