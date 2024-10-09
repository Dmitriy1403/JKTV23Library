package org.example;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.services.BookDataInput;
import org.example.services.BookService;
import org.example.storages.StorageBook;

import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Book> books;

    private BookRepository bookRepository = new StorageBook();

    public App(){
        this.books = bookRepository.loadBooks();
    }

    private Scanner scanner = new Scanner(System.in);



    public void run() {
        boolean repeat = false;

       do{
        System.out.println("------------------JKTV23 Library--------------------");

        System.out.println("TaskList:");
        System.out.println("0. Exit");
        System.out.println("1. Add Book");
        System.out.println("1. Add User");
        System.out.println("3. Books_List");
        System.out.println("4. Users_List");
        System.out.println("5. Give a Book");
        System.out.println("6. Return Book");
        System.out.println("7.Choose task of list: ");

        int task = Integer.parseInt(scanner.nextLine());

        switch (task) {

            case 0:
                repeat = false;
                break;
            case 1:
                BookService bookService = new  BookService(scanner);
                bookService.addBook(new BookDataInput());

                break;
            case 2: break;

            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;

            default:
                System.out.println("Choose a task number from list");

        }
        System.out.println("Goodbye");

       }while (repeat);

        System.out.println("Goodbye");




    }
}
