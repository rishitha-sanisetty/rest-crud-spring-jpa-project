package com.spring.boot.restapi.exceptionhandling;

public class ObjectAlreadyExistsExceptionHandler extends RuntimeException {

    public ObjectAlreadyExistsExceptionHandler(String message) {
        super(String.format("%s already exists!!'", message));
    }

}