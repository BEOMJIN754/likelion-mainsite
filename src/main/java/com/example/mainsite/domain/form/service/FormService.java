package com.example.mainsite.domain.form.service;


import com.example.mainsite.domain.form.dto.FormDTO;
import com.example.mainsite.domain.form.entity.Form;
import com.example.mainsite.domain.form.repository.FormRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormService {

    private final FormRepository repository;

    public FormService(FormRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Form submitForm(FormDTO request) {
        Form form = Form.builder()
                .name(request.getName())
                .studentId(request.getStudentId())
                .department(request.getDepartment())
                .phone(request.getPhone())
                .email(request.getEmail())
                .militaryStatus(request.getMilitaryStatus())
                .rolePreference(request.getRolePreference())
                .selfIntroduction(request.getSelfIntroduction())
                .learningApproach(request.getLearningApproach())
                .teamworkExperience(request.getTeamworkExperience())
                .participationPlan(request.getParticipationPlan())
                .expectations(request.getExpectations())
                .question(request.getInquiries())
                .consent(request.isConsent())
                .queryNumber(request.getQueryNumber())
                .build();

        return repository.save(form);
    }

    @Transactional(readOnly = true)
    public boolean isQueryNumberDuplicate(String queryNumber) {
        return repository.existsByQueryNumber(queryNumber);
    }
}