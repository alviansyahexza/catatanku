package com.example.catatanku.controllers;

import com.example.catatanku.body.PostNotesLabelsBody;
import com.example.catatanku.services.NotesLabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "notes-labels")
public class NotesLabelsController {

    @Autowired
    NotesLabelsService notesLabelsService;

    @PostMapping
    boolean add (@RequestBody PostNotesLabelsBody body) {
        notesLabelsService.add(body);
        return true;
    }
}
