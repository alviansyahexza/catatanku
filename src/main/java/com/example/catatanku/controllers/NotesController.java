package com.example.catatanku.controllers;

import com.example.catatanku.body.PatchNotesBody;
import com.example.catatanku.body.PostNotesBody;
import com.example.catatanku.models.Notes;
import com.example.catatanku.services.NotesService;
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
        return notesService.add(postNotesBody);
    }

    @GetMapping
    public List<Notes> getList(@RequestParam String title) {
        return notesService.getList(title);
    }

    @GetMapping("/{id}")
    public Optional<Notes> get(@PathVariable("id") int noteId) {
        return notesService.get(noteId);
    }

    @PatchMapping("/{id}")
    public int update(@RequestBody PatchNotesBody body, @PathVariable("id") int noteId) {
        return notesService.updateContent(body, noteId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int noteId) {
        notesService.deleteById(noteId);
    }
}
