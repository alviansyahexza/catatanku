package com.example.catatanku.services;

import com.example.catatanku.body.PostLabelsBody;
import com.example.catatanku.models.Labels;
import com.example.catatanku.repository.LabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelsService {

    //injection
    @Autowired
    LabelsRepository labelsRepository;

    @Autowired
    ValidationService validator;

    public Labels add(PostLabelsBody postLabelsBody) {
        validator.validate(postLabelsBody);

        //modification variable
        String name = postLabelsBody.getName();

        //build note
        Labels labels = new Labels();
        labels.setName(name);

        //save note to database
        labelsRepository.save(labels);

        return labels;
    }
}
