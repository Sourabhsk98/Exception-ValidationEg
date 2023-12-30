package com.RethrowException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Email {

    public static void main(String[] args) {
        try {
            sendEmail("recipient@example.com", "Hello", "Body of the email");
        } catch (EmailSendingException e) {
            System.out.println("Error sending email: " + e.getMessage());
        }
    }

    public static void sendEmail(String recipient, String subject, String body) throws EmailSendingException {
        try {
            // Code for sending an email
            // ...

        } catch (AddressException | MessagingException emailException) {
            logEmailException(emailException);
            throw new EmailSendingException("Error sending email to: " + recipient, emailException);
        }
    }

    private static void logEmailException(Exception e) {
        // Log email exception details
        e.printStackTrace();
    }

    public static class EmailSendingException extends Exception {
        public EmailSendingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
