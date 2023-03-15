package org.alterra;

import java.util.ArrayList;
import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        // Create an empty ArrayList to store the names
        ArrayList<String> names = new ArrayList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("For loop: ");
        int loop = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < loop; i++) {
            names = new ArrayList<>();
            // Prompt the user to enter a name
            System.out.print("Enter a name: ");

            // Read the user input and add it to the ArrayList
            String name = scanner.nextLine();
            names.add(name);
        }

        // Print the contents of the ArrayList
        System.out.println("The names entered are:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
