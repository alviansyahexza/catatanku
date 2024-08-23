package com.example.catatanku.services;

import com.example.catatanku.body.PatchNotesBody;
import com.example.catatanku.body.PostNotesBody;
import com.example.catatanku.models.Notes;
import com.example.catatanku.repository.NotesRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class NotesService {

    //injection
    @Autowired
    NotesRepository notesRepository;

    @Autowired
    ValidationService validator;

    public Notes add(PostNotesBody postNotesBody) {
        validator.validate(postNotesBody);

        //modification variable
        String title = postNotesBody.getTitle();
        String content = postNotesBody.getContent();

        //build note
        Notes notes = new Notes();
        notes.setTitle(title);
        notes.setContent(content);

        //save note to database
        notesRepository.save(notes);

        return notes;
    }

    @Transactional
    public int updateContent(PatchNotesBody body, int id) {
        validator.validate(body);
        return notesRepository.updateContent(body.getContent(), id);
    }

    public List<Notes> getList(String title) {
        return notesRepository.findByTitleContaining(title);
    }

    public Optional<Notes> get(int id) {
        return notesRepository.findById(id);
    }

    public void deleteById(int id) { notesRepository.deleteById(id); }
}
