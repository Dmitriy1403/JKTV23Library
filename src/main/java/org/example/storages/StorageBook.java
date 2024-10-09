package org.example.storages;

import org.example.model.Book;
import org.example.repository.BookRepository;

import java.util.List;

public class StorageBook implements BookRepository {

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public List<Book> loadBooks() {
        return List.of();
    }
}
