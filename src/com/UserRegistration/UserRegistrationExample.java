package com.UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationExample {
    public static boolean isAlphanumeric(String inputString) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration!");

        try {
            // Simulate user registration process
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Validate password for alphanumeric characters
            if (!isAlphanumeric(password)) {
                throw new IllegalArgumentException("Password must be alphanumeric.");
            }

            // Simulate successful registration
            System.out.println("Registration successful!");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

        } catch (IllegalArgumentException e) {
            System.out.println("Registration failed. " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

}
