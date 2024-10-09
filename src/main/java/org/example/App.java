package org.example;

import java.util.Scanner;

public class App {

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean repeat = true;

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
            case 0: break;
            case 1: break;
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
