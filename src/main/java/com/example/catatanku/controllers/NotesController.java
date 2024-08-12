package com.example.catatanku.controllers;

import com.example.catatanku.body.PostNotesBody;
import com.example.catatanku.models.Notes;
import com.example.catatanku.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "notes")
public class NotesController {

    @Autowired
    NotesService notesService;

    @PostMapping
    public Notes add(@RequestBody PostNotesBody postNotesBody) {
        return notesService.add(postNotesBody.getTitle(), postNotesBody.getContent());
    }
}
