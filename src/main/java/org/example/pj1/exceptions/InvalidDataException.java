package org.example.pj1.exceptions;

public class InvalidDataException extends Exception {
    private static final String DEFAULT_MESSAGE = "Invalid Data";

    public InvalidDataException() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
