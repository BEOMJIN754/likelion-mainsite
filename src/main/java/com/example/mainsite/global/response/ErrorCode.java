package com.example.mainsite.global.response;


import org.springframework.http.HttpStatus;

public enum ErrorCode {

    DUPLICATE_ENTRY(HttpStatus.CONFLICT, "Duplicate entry detected."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Resource not found."),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "Bad request."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error.");
    private final HttpStatus httpStatus;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
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