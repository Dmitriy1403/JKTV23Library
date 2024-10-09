package org.example.repository;

import org.example.model.Book;

import java.util.List;

public interface BookRepository {

    void saveBook(Book book);

    List<Book> loadBooks();

}
