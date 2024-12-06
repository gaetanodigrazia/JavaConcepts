package com.digrazia.business.exception;

import org.springframework.http.HttpStatus;

public class SQLInjectionControlException extends APIException {
    public SQLInjectionControlException(String message) {
        super(message, HttpStatus.NOT_ACCEPTABLE);
    }
}
