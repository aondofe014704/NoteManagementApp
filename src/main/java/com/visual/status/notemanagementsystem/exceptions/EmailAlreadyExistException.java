package com.visual.status.notemanagementsystem.exceptions;

public class EmailAlreadyExistException extends RuntimeException {
    public EmailAlreadyExistException(String response) {
        super(response);
    }
}
