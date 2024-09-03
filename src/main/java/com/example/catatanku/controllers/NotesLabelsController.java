package com.example.catatanku.controllers;

import com.example.catatanku.body.PostNotesLabelsBody;
import com.example.catatanku.models.NotesLabels;
import com.example.catatanku.services.NotesLabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping(path = "/{notes-id}/{labels-id}")
    boolean remove(@PathVariable("notes-id") int notesId, @PathVariable("labels-id") int labelsId) {
        notesLabelsService.remove(notesId, labelsId);
        return true;
    }

    @GetMapping
    List<NotesLabels> list(@RequestParam(value = "notes-id") String notesId, @RequestParam(value = "labels-id") String labelsId) {
        return notesLabelsService.list(notesId, labelsId);
    }
}
