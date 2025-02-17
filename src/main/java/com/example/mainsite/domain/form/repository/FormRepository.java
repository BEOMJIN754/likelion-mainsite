package com.example.mainsite.domain.form.repository;

import com.example.mainsite.domain.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FormRepository extends JpaRepository<Form, Long> {
    boolean existsByQueryNumber(String queryNumber);

    boolean existsByStudentId(String studentId);
    @Query("select f from Form f where f.studentId = :studentId and f.queryNumber = :queryNumber")
    Form findFormResult(@Param("studentId") String studentId, @Param("queryNumber") String queryNumber);


}
