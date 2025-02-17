package com.example.mainsite.global.response;


import org.springframework.http.HttpStatus;

public enum SuccessCode {
    APPLICATION_SUBMIT_SUCCESS(HttpStatus.OK, "Application submitted successfully."),
    FORM_SUBMIT_SUCCESS(HttpStatus.OK, "Form submitted successfully."),
    QUERY_NUMBER_CHECK_SUCCESS(HttpStatus.OK, "Query number check successful."),
    FORM_RETRIEVAL_SUCCESS(HttpStatus.OK, "Form retrieval successful."),
    PASS_STATUS_CHECK_SUCCESS(HttpStatus.OK, "Pass status check successful."),
    STUDENT_ID_CHECK_SUCCESS(HttpStatus.OK,"Student id check successful" );

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