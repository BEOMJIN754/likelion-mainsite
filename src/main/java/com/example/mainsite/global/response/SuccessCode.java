package com.example.mainsite.global.response;


import org.springframework.http.HttpStatus;

public enum SuccessCode {
    APPLICATION_SUBMIT_SUCCESS(HttpStatus.OK, "Application submitted successfully.");

    private final HttpStatus httpStatus;
    private final String message;

    SuccessCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}