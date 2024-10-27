package ee.ivkhkdev.services;

<<<<<<< HEAD
import ee.ivkhkdev.helpers.AppHelper;
import ee.ivkhkdev.helpers.AppHelperRegister;
import ee.ivkhkdev.model.Register;
import ee.ivkhkdev.repository.Repository;

import java.util.List;

public class RegisterService implements Service<Register>{

    private final AppHelper<Register> appHelperRegister;
=======
import ee.ivkhkdev.helpers.AppHelperRegisterInput;
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.model.Register;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.interfaces.Input;

import java.util.List;

public class RegisterService {

    private final AppHelperRegisterInput appHelperRegisterInput;
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
    private final Repository repository;

    private final List<Register> registers;


<<<<<<< HEAD
    public RegisterService(List<Register> registers, Repository repository, AppHelper<Register> appHelperRegister) {
        this.registers = registers;
        this.repository = repository;
        this.appHelperRegister = appHelperRegister;
    }
    @Override
    public boolean add() {
        Register register = appHelperRegister.create();
=======
    public RegisterService(List<Register> registers, Repository repository, AppHelperRegisterInput appHelperRegisterInput) {
        this.registers = registers;
        this.repository = repository;
        this.appHelperRegisterInput = appHelperRegisterInput;
    }

    public boolean bookBorrow() {
        Register register = appHelperRegisterInput.bookBorrow();
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
        if(register != null) {
            registers.add(register);
            repository.save(registers);
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
        appHelperRegister.printList();
    }

    @Override
    public Repository<Register> getRepository() {
        return repository;
    }

    public boolean returnBook() {
        return ((AppHelperRegister) appHelperRegister).returnBookDialog();
=======
    public boolean returnBook() {
        return appHelperRegisterInput.returnBookDialog();
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
    }
}
