package org.example.services;

import org.example.model.Author;
import org.example.model.Book;

import java.util.Scanner;

public class BookDataInput {
    public Book createBook(Scanner scanner) {
        System.out.println("----NewBook----");
        Book book = new Book();

        System.out.println("Books Name");
        book.setTitle(scanner.nextLine());

        System.out.println("Author Name");
        System.out.println("Quantity authors in te book");
        int countAuthors = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countAuthors; i++) {
            Author author = new Author();
            System.out.printf("Author %d:%n",i+1);
            System.out.println("Name of author: ");
            author.setFirstName(scanner.nextLine());

            System.out.println("LastName of author: ");
            author.setFirstName(scanner.nextLine());
            book.getAuthors().add(author);


        }

        System.out.println("Published year");
        book.setPublishedYear(Integer.parseInt(scanner.nextLine()));
        return book;


    }


}
