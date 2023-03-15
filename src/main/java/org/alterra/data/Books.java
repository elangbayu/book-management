package org.alterra.data;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private ArrayList<Book> books;

    public Books() {
        this.books = new ArrayList<>();
    }

    public void setBooks() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = input.nextLine();
        System.out.print("Enter author: ");
        String author = input.nextLine();
        System.out.print("Enter category: ");
        String category = input.nextLine();

        books.add(new Book(title, author, category));

        System.out.println("book created!");
        System.out.println("===");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Category: "+category);
        System.out.println("===");
    }

    public void getBooks() {
        System.out.println("===ALL BOOKS===");
        for (Book book : books) {
            System.out.println("===");
            System.out.println("ID: " + book.getID());
            System.out.println("Title: " + book.getJudul());
            System.out.println("Author: " + book.getPenulis());
            System.out.println("Category: " + book.getKategori());
            System.out.println("===");
        }
    }

    public void getBookById(String Id) {
        boolean isFound = false;
        for (Book book : books) {
            if (book.getID().equals(Id)) {
                System.out.println("===");
                System.out.println("ID: "+book.getID());
                System.out.println("Title: "+book.getJudul());
                System.out.println("Author: "+book.getPenulis());
                System.out.println("Category: "+book.getKategori());
                System.out.println("===");
                isFound = true;
            }
            break;
        }
        if (isFound == false) {
            System.out.println("Book not found!");
        }
    }

    public void updateBook(String Id) {
        Scanner input = new Scanner(System.in);
        boolean isFound = false;

        for (Book book : books) {
            if (book.getID().equals(Id)) {
                System.out.println("Enter title:");
                book.setJudul(input.nextLine());
                System.out.println("Enter author:");
                book.setPenulis(input.nextLine());
                System.out.println("Enter category:");
                book.setKategori(input.nextLine());

                System.out.println("book updated!");

                System.out.println("===");
                System.out.println("ID: "+book.getID());
                System.out.println("Title: "+book.getJudul());
                System.out.println("Author: "+book.getPenulis());
                System.out.println("Category: "+book.getKategori());
                System.out.println("===");

                isFound = true;
            }
            break;
        }

        if (isFound == false) {
            System.out.println("Book not found!");
        }
    }

    public void deleteBook(String Id) {
        boolean isFound = false;

        for (Book book : books) {
            if (book.getID().equals(Id)) {
                books.remove(book);
                System.out.println("book deleted!");
                isFound = true;
            }
            break;
        }

        if (isFound == false) {
            System.out.println("Book not found!");
        }
    }
}
