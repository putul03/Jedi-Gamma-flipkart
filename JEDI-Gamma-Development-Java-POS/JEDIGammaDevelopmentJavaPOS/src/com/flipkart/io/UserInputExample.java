package com.flipkart.io;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        // Using do-while loop as per assignment requirements
        do {
            System.out.println("\nWelcome to the Flipfit Application for GYM");
            System.out.println("1. Login");
            System.out.println("2. Registration of the GymCustomer");
            System.out.println("3. Registration of the GymOwner");
            System.out.println("4. change password");
            System.out.println("5. Exit");
            System.out.print("Please select the option: ");
            
            option = scan.nextInt();

            // Using if-else statements for main menu as per assignment
            if (option == 1) {
                System.out.println("--- Login ---");
                System.out.print("Username: ");
                String username = scan.next();
                System.out.print("Password: ");
                String password = scan.next();
                
                System.out.println("Role: 1. GYMOwner 2. GymCustomer 3. GymAdmin");
                int roleChoice = scan.nextInt();

                // Using switch case for role selection as per assignment
                switch (roleChoice) {
                    case 1:
                        System.out.println("Displaying GymOwner Menu for " + username);
                        break;
                    case 2:
                        System.out.println("Displaying GymCustomer Menu for " + username);
                        break;
                    case 3:
                        System.out.println("Displaying GymAdmin Menu for " + username);
                        break;
                    default:
                        System.out.println("Invalid Role Selection.");
                }
            } else if (option == 2) {
                System.out.println("Starting Registration for GymCustomer...");
            } else if (option == 3) {
                System.out.println("Starting Registration for GymOwner...");
            } else if (option == 4) {
                System.out.println("Change password module selected.");
            } else if (option == 5) {
                System.out.println("Exiting Application. Thank you!");
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

        } while (option != 5); // Loop continues until user selects Exit (5)

        scan.close();
    }
}