package com.example.catatanku.services;

import com.example.catatanku.body.PatchLabelsBody;
import com.example.catatanku.body.PatchNotesBody;
import com.example.catatanku.body.PostLabelsBody;
import com.example.catatanku.models.Labels;
import com.example.catatanku.models.Notes;
import com.example.catatanku.repository.LabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Transactional
    public int updateName(PatchLabelsBody body, int id) {
        validator.validate(body);
        return labelsRepository.updateName(body.getName(), id);
    }

    public List<Labels> getList(String name) {
        return labelsRepository.findByNameContaining(name);
    }

    public Optional<Labels> get(int id) {
        return labelsRepository.findById(id);
    }

    public void deleteById(int id) { labelsRepository.deleteById(id); }
}
