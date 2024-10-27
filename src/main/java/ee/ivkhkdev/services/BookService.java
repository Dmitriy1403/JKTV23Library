package ee.ivkhkdev.services;

<<<<<<< HEAD
import ee.ivkhkdev.helpers.AppHelper;
import ee.ivkhkdev.helpers.AppHelperBook;
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.interfaces.Input;

import java.util.List;

public class BookService implements Service<Book>{
    private final Input input;
    private final AppHelper<Book> appHelperBook;
    private final Repository<Book> repository;
    private List<Book> books;

    public BookService(List<Book> books, Input input, AppHelper<Book> appHelperBook, Repository<Book> repository) {
        this.input = input;
        this.repository = repository;
        this.appHelperBook = appHelperBook;
        this.books = books;

    }
    @Override
    public boolean add(){
        Book book = appHelperBook.create();
=======
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.helpers.AppHelperBookInput;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.storages.Storage;

import java.util.List;

public class BookService {
    private final Input input;
    private final AppHelperBookInput appHelperBookInput;
    private final Repository<Book> repository;
    private List<Book> books;

    public BookService(List<Book> books, Input input, AppHelperBookInput appHelperBookInput, Repository<Book> repository) {
        this.input = input;
        this.repository = repository;
        this.appHelperBookInput = appHelperBookInput;
        this.books = books;

    }

    public boolean addBook(){
        Book book = appHelperBookInput.createBook();
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
        if(book != null) {
            books.add(book);
            repository.save(books);
            return true;
        }else{
            return false;
        }
    }

<<<<<<< HEAD
    @Override
    public boolean edit() {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }
    @Override
    public void print() {
        appHelperBook.printList();
    }
    @Override
=======
    public void books() {
        appHelperBookInput.printBooks();
    }

>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
    public Repository<Book> getRepository() {
        return repository;
    }
}
