package com.digrazia.business.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LengthControlException.class)
    public ResponseEntity<String> handleLengthControlException(LengthControlException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(SQLInjectionControlException.class)
    public ResponseEntity<String> handleSQLInjectionControlException(SQLInjectionControlException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
