package com.example.mainsite.domain.form.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormDTO {
    private String name;
    private String studentId;
    private String department;
    private String phone;
    private String email;
    private String militaryStatus;
    private String rolePreference;
    private String selfIntroduction;
    private String learningApproach;
    private String teamworkExperience;
    private String participationPlan;
    private String expectations;
    private String inquiries;
    private boolean consent;
    private String queryNumber;
}