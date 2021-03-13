package oop.exercises.exception.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void deleteBook(String id) throws NoBookFoundException {

        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with id " + id);
    }

    public List<Book> findBookByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);

            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't find the book with name " + name);
        }
        return booksByName;
    }
    public List<Book> findBookById (String id) throws NoBookFoundException {
        List<Book> booksById =new ArrayList<>();
        for(Book book :books){
            if(book.getId().equals(id)) {
                booksById.add(book);
            }
        }
        if(booksById.isEmpty()){
            throw new NoBookFoundException("Can't find the book with id "+ id);
        }
        return booksById;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}


