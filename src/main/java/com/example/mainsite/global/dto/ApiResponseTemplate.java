package com.example.mainsite.global.dto;


import com.example.mainsite.global.response.ErrorCode;
import com.example.mainsite.global.response.SuccessCode;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class ApiResponseTemplate<T> {

    private final int status;
    private final String message;
    private final LocalDateTime timestamp;  // 추가된 날짜/시간 필드
    private T data;

    public static <T> ApiResponseTemplate<T> success(SuccessCode successCode, T data) {
        return ApiResponseTemplate.<T>builder()
                .status(successCode.getHttpStatus().value())
                .message(successCode.getMessage())
                .timestamp(LocalDateTime.now())  // 현재 시각을 기록
                .data(data)
                .build();
    }

    public static <T> ApiResponseTemplate<T> error(ErrorCode errorCode) {
        return ApiResponseTemplate.<T>builder()
                .status(errorCode.getHttpStatus().value())
                .message(errorCode.getMessage())
                .timestamp(LocalDateTime.now())  // 현재 시각을 기록
                .data(null)
                .build();
    }
}