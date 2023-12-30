package com.CustomCheckedException;

 class UnderUnCheckedException extends RuntimeException {
    UnderUnCheckedException() {
        super("You are under age");
    }

    UnderUnCheckedException(String message) {
        super(message);
    }
}

class Voting {
    // Declare that the main method may throw UnderAgeException
    public static void main(String[] args)  {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderUnCheckedException("You can Vote now");
            } else
            {
                System.out.println("You can vote now");
            }
        } catch (UnderUnCheckedException e) {
            // Handle the exception or log it as needed
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
