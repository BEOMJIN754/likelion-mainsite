package com.example.mainsite.domain.form.repository;

import com.example.mainsite.domain.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {
}
