package com.digrazia.business.exception;

import org.springframework.http.HttpStatus;

public class LengthControlException extends APIException {
    public LengthControlException(String message) {
        super(message, HttpStatus.NOT_ACCEPTABLE);
    }
}
