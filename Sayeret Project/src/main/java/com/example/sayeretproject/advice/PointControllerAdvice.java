package com.example.sayeretproject.advice;

import com.example.sayeretproject.exceptions.ExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class PointControllerAdvice {
    @ExceptionHandler(ExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDetails handleErrors(Exception e) {
        return new ErrorDetails("CatException: Something went wrong!", e.getMessage(), 400);
    }
}
