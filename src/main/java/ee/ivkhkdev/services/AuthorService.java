package ee.ivkhkdev.services;

<<<<<<< HEAD
import ee.ivkhkdev.helpers.AppHelper;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Author;
=======
import ee.ivkhkdev.helpers.AppHelperAuthorInput;
import ee.ivkhkdev.helpers.AppHelperBookInput;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Author;
import ee.ivkhkdev.model.Book;
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
import ee.ivkhkdev.repository.Repository;

import java.util.List;

<<<<<<< HEAD
public class AuthorService implements Service<Author> {
    private final Input input;
    private final AppHelper<Author> appHelperAuthor;
    private final Repository<Author> repository;
    private List<Author> authors;

    public AuthorService(List<Author> authors, Input input, AppHelper<Author> appHelperAuthor, Repository<Author> repository) {
        this.input = input;
        this.repository = repository;
        this.appHelperAuthor = appHelperAuthor;
        this.authors = authors;

    }
    @Override
    public boolean add(){
        Author author = appHelperAuthor.create();
=======
public class AuthorService {
    private final Input input;
    private final AppHelperAuthorInput appHelperAuthorInput;
    private final Repository<Author> repository;
    private List<Author> authors;

    public AuthorService(List<Author> authors, Input input, AppHelperAuthorInput appHelperAuthorInput, Repository<Author> repository) {
        this.input = input;
        this.repository = repository;
        this.appHelperAuthorInput = appHelperAuthorInput;
        this.authors = authors;

    }

    public boolean addAuthor(){
        Author author = appHelperAuthorInput.createAuthor();
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
        if(author != null) {
            authors.add(author);
            repository.save(authors);
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
        appHelperAuthor.printList();
    }
    @Override
=======
    public void authors() {
        appHelperAuthorInput.printAuthors();
    }

>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
    public Repository<Author> getRepository() {
        return repository;
    }
}
