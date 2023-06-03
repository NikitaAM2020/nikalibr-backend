package com.library.backend.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Could not found the book with id " + id);
    }
}
