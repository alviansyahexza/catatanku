package com.example.catatanku.services;

import com.example.catatanku.models.Notes;
import com.example.catatanku.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    //injection
    @Autowired
    NotesRepository notesRepository;

    public Notes add(String title, String content) {
        //build note
        Notes notes = new Notes();
        notes.setTitle(title);
        notes.setContent(content);

        //save note to database
        notesRepository.save(notes);

        return notes;
    }

    public List<Notes> getList() {
        return notesRepository.findAll();
    }
}
