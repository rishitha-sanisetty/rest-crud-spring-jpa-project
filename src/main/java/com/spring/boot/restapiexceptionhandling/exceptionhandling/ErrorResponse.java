package com.spring.boot.restapiexceptionhandling.exceptionhandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private String message;
    private int statusCode;

    public ErrorResponse(String message) {
        this.message = message;
    }

}
