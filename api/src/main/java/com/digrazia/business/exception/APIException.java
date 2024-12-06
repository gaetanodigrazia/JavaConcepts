package com.digrazia.business.exception;

import org.springframework.http.HttpStatus;

public class APIException extends RuntimeException {
    private HttpStatus httpStatus;

    public APIException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
