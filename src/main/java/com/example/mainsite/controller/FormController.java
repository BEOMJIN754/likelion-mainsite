package com.example.mainsite.controller;


import com.example.mainsite.domain.form.dto.FormDTO;
import com.example.mainsite.domain.form.dto.FormResultDTO;
import com.example.mainsite.domain.form.entity.Form;
import com.example.mainsite.domain.form.service.FormService;
import com.example.mainsite.global.dto.ApiResponseTemplate;
import com.example.mainsite.global.response.SuccessCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
public class FormController {

    private final FormService service;

    public FormController(FormService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    public ResponseEntity<ApiResponseTemplate<Form>> submitForm(@RequestBody FormDTO request) {
        Form savedForm = service.submitForm(request);
        return ResponseEntity.ok(
                ApiResponseTemplate.success(SuccessCode.APPLICATION_SUBMIT_SUCCESS, savedForm)
        );
    }

    @GetMapping("/checkpw")
    public ResponseEntity<ApiResponseTemplate<Boolean>> checkQueryNumber(@RequestParam String queryNumber) {
        boolean isDuplicate = service.isQueryNumberDuplicate(queryNumber);
        return ResponseEntity.ok(ApiResponseTemplate.success(SuccessCode.QUERY_NUMBER_CHECK_SUCCESS, isDuplicate));
    }


    @GetMapping("/checkid")
    public ResponseEntity<ApiResponseTemplate<Boolean>> checkStudentId (@RequestParam String studentId){

        boolean isDuplicate = service.isStudentIdDuplicate(studentId);
        return ResponseEntity.ok(ApiResponseTemplate.success(SuccessCode.STUDENT_ID_CHECK_SUCCESS,isDuplicate));
    }


    @GetMapping("/{id}")
    public ResponseEntity<ApiResponseTemplate<Form>> getFormById(@PathVariable Long id) {
        Form form = service.getFormById(id);
        return ResponseEntity.ok(ApiResponseTemplate.success(SuccessCode.FORM_RETRIEVAL_SUCCESS, form));
    }

    @GetMapping("/result")
    public ResponseEntity<ApiResponseTemplate<FormResultDTO>> checkPassStatus(
            @RequestParam String studentId,
            @RequestParam String queryNumber) {
        FormResultDTO result = service.checkPassStatus(studentId, queryNumber);
        return ResponseEntity.ok(ApiResponseTemplate.success(SuccessCode.PASS_STATUS_CHECK_SUCCESS, result));
    }

    @PutMapping("/update")
    public ResponseEntity<ApiResponseTemplate<Form>> updateResultByStudentId(
            @RequestParam String studentId,
            @RequestParam Boolean result) {
        Form updatedForm = service.updateResultByStudentId(studentId, result);
        return ResponseEntity.ok(ApiResponseTemplate.success(SuccessCode.RESULT_UPDATE_SUCCESS, updatedForm));
    }

}