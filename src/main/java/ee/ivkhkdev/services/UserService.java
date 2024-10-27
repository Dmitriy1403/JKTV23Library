package ee.ivkhkdev.services;

<<<<<<< HEAD
import ee.ivkhkdev.helpers.AppHelper;
import ee.ivkhkdev.helpers.AppHelperUser;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.interfaces.Input;

import java.util.List;

public class UserService implements Service<User>{
    private final Input input;
    private final AppHelper<User> appHelperUser;
    private final Repository<User> repository;
    private final List<User> users;

    public UserService(List<User> users, Input input, AppHelper<User> appHelperUser, Repository<User> repository) {
        this.users = users;
        this.input = input;
        this.appHelperUser = appHelperUser;
        this.repository = repository;
    }
    @Override
    public boolean add(){
        User user = appHelperUser.create();
=======
import ee.ivkhkdev.helpers.AppHelperUserInput;
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.storages.Storage;

import java.util.List;

public class UserService {
    private final Input input;
    private final AppHelperUserInput appHelperUserInput;
    private final Repository<User> repository;
    private final List<User> users;

    public UserService(List<User> users, Input input, AppHelperUserInput appHelperUserInput, Repository<User> repository) {
        this.users = users;
        this.input = input;
        this.appHelperUserInput = appHelperUserInput;
        this.repository = repository;
    }
    public boolean addUser(){
        User user = appHelperUserInput.createUser();
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
        if(user != null){
            users.add(user);
            repository.save(users);
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
        appHelperUser.printList();
    }

    @Override
=======
    public void users() {
        appHelperUserInput.printUsers();
    }

>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
    public Repository<User> getRepository() {
        return repository;
    }
}
