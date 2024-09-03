package com.example.catatanku.services;

import com.example.catatanku.body.PostNotesLabelsBody;
import com.example.catatanku.models.NotesLabels;
import com.example.catatanku.models.id.NotesLabelsId;
import com.example.catatanku.repository.NotesLabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesLabelsService {

    @Autowired
    NotesLabelsRepository notesLabelsRepository;

    @Autowired
    ValidationService validationService;

    public void add (PostNotesLabelsBody body) {
        validationService.validate(body);
        NotesLabels notesLabels = new NotesLabels();
        notesLabels.setLabelsId(body.getLabelsId());
        notesLabels.setNotesId(body.getNotesId());
        notesLabelsRepository.save(notesLabels);
    }

    public void remove(int notesId, int labelsId) {
        NotesLabelsId notesLabelsId = new NotesLabelsId();
        notesLabelsId.setNotesId(notesId);
        notesLabelsId.setLabelsId(labelsId);
        notesLabelsRepository.deleteById(notesLabelsId);
    }
}
