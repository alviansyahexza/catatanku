package com.example.catatanku.services;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ValidationService {

    //import jakarta validation
    @Autowired
    private Validator validator;

    public void validate(Object request) {
        //parameters validation
        Set<ConstraintViolation<Object>> errors = validator.validate(request);
        if (!errors.isEmpty()) throw new ConstraintViolationException(errors);
    }
}
