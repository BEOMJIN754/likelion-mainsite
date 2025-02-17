package com.example.mainsite.domain.form.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String studentId;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(length = 2,nullable = false)
    private String militaryStatus;

    @Column(length = 5,nullable = false)
    private String rolePreference;

    // 8. 자기소개 & 지원동기 (600자)
    @Column(length = 600, nullable = false)
    private String selfIntroduction;

    // 9. 새로운 분야 학습 방법 및 경험 (600자)
    @Column(length = 600, nullable = false)
    private String learningApproach;

    // 10. 효율적인 팀워크 관련 (600자)
    @Column(length = 600, nullable = false)
    private String teamworkExperience;

    // 11. 활동 참여 계획 및 포부 (600자)
    @Column(length = 600, nullable = false)
    private String participationPlan;

    // 12. 13기 활동 기대 또는 목표 (600자)
    @Column(length = 600, nullable = false)
    private String expectations;

    @Column(nullable = true)
    private String question;

    @Column(nullable = false)
    private boolean consent;

    @Column(length = 4,nullable = false, unique = true)
    private String queryNumber;

    @Column
    private Boolean passStatus;
}