package com.example.catatanku.controllers;

import com.example.catatanku.body.PostNotesBody;
import com.example.catatanku.models.Notes;
import com.example.catatanku.services.NotesService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "notes")
public class NotesController {

    @Autowired
    NotesService notesService;

    @PostMapping
    public Notes add(@RequestBody PostNotesBody postNotesBody) {
        return notesService.add(postNotesBody.getTitle(), postNotesBody.getContent());
    }

    @GetMapping
    public List<Notes> getList() {
        return notesService.getList();
    }

    @GetMapping("/{id}")
    public Optional<Notes> get(@PathVariable("id") int noteId) {
        return notesService.get(noteId);
    }
}
