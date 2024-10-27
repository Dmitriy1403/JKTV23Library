package ee.ivkhkdev.helpers;

import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.model.Register;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.services.BookService;
import ee.ivkhkdev.services.UserService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AppHelperRegisterInput {
    private final List<Book> books;
    private final List<User> users;
    private final List<Register> registers;
    private final Input input;
    private final UserService userService;
    private final BookService bookService;

    public AppHelperRegisterInput(List<Book> books, List<User> users, List<Register> registers, Input input, UserService userService, BookService bookService) {
        this.books = books;
        this.users = users;
        this.registers = registers;
        this.input = input;
        this.userService = userService;
        this.bookService = bookService;
    }

    public Register bookBorrow() {
        try {
            Register register = new Register();
            userService.users();
            System.out.print("Введите номер пользователя из списка: ");
            int numberUser = Integer.parseInt(input.nextLine());
            User user = users.get(numberUser-1);
            bookService.books();
            System.out.print("Введите номер книги из списка: ");
            int numberBook = Integer.parseInt(input.nextLine());
            Book book = books.get(numberBook-1);
            register.setUser(user);
            register.setBook(book);
            register.setBookBorrowDate(LocalDate.now());
            return register;
        } catch (Exception e) {
            return null;
        }
    }

    public void printListBorrowedBooks(){
        if (registers.isEmpty()){
            System.out.println(" --- Список выданных книг пуст --- ");
        } else {
            System.out.println(" --- Список выданных книг --- ");
            for (int i = 0; i < registers.size(); i++){
                if (registers.get(i).getReturnBookDate() != null){
                    continue;
                }
                System.out.printf("%d. %s. %s. %d%n",
                        i+1,
                        registers.get(i).getBook().getTitle(),
                        Arrays.toString(registers.get(i).getBook().getAuthors().toArray()),
                        registers.get(i).getBook().getPublishedYear()
                );
            }
            System.out.println(" --- Конец списка --- ");
        }
    }

    public boolean returnBookDialog() {
        try {
            printListBorrowedBooks();
            System.out.print("Выберите номер возвращаемой книги: ");
            int numberReturnBookRegister = Integer.parseInt(input.nextLine());
            registers.get(numberReturnBookRegister - 1).setReturnBookDate(LocalDate.now());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}