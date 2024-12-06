package com.digrazia.business.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends APIException {
    public NotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
