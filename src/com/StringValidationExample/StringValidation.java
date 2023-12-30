package com.StringValidationExample;

public class StringValidation {

        public static void validateUsername(String username) throws IllegalArgumentException {
            // Check if the username is not empty
            if (username == null || username.trim().isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty.");
            }

            // Check if the username contains any spaces
            if (username.contains(" ")) {
                throw new IllegalArgumentException("Username cannot contain spaces.");
            }

            // Additional validation rules can be added here as needed
        }

        public static void main(String[] args) {
            // Example usage to demonstrate username validation
            try {
                // Valid username
                String validUsername = "john_doe";
                validateUsername(validUsername);
                System.out.println("Username validation passed for: " + validUsername);

                // Invalid username with space
                String invalidUsername = "jane doe";
                validateUsername(invalidUsername);
                System.out.println("Username validation passed for: " + invalidUsername);  // This line won't be reached

            } catch (IllegalArgumentException e) {
                System.out.println("Username validation failed: " + e.getMessage());
            }
        }
    }



