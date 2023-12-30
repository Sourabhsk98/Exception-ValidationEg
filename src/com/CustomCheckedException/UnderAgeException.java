package com.CustomCheckedException;

class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

 class Voting {
    // Declare that the main method may throw UnderAgeException
    public static void main(String[] args) throws UnderAgeException {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException("You can Vote now");
            } else {
                System.out.println("You can vote now");
            }
        } catch (UnderAgeException e) {
            // Handle the exception or log it as needed
            e.printStackTrace();
        }
        System.out.println("Hello");

    }

}
