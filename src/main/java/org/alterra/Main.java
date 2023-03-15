package org.alterra;

import org.alterra.data.Books;

import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("Welcome to book management app");
        System.out.println("Please choose your menu:");
        System.out.println("1. Create a new book");
        System.out.println("2. Get all books");
        System.out.println("3. Get book by ID");
        System.out.println("4. Update book");
        System.out.println("5. Delete book");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        Books books = new Books();
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            menu();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    books.setBooks();
                    break;
                case 2:
                    books.getBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID: ");
                    books.getBookById(input.nextLine());
                    break;
                case 4:
                    System.out.println("Enter book ID: ");
                    books.updateBook(input.nextLine());
                    break;
                case 5:
                    System.out.print("Enter book ID: ");
                    books.deleteBook(input.nextLine());
                    break;
                case 6:
                    System.out.println("Good bye!");
                    exit = true;
                    break;
                default:
                    System.out.println("No option!");
                    break;
            }
        }

    }
}