package com.example.mainsite.domain.form.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormResultDTO {
    private String name;
    private Boolean passStatus;
}