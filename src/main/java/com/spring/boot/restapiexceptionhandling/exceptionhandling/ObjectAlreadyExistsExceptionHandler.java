package com.spring.boot.restapiexceptionhandling.exceptionhandling;

public class ObjectAlreadyExistsExceptionHandler extends RuntimeException {

    public ObjectAlreadyExistsExceptionHandler(String message) {
        super(String.format("%s already exists!!'", message));
    }

}