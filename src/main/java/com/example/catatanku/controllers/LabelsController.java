package com.example.catatanku.controllers;

import com.example.catatanku.body.PatchLabelsBody;
import com.example.catatanku.body.PatchNotesBody;
import com.example.catatanku.body.PostLabelsBody;
import com.example.catatanku.models.Labels;
import com.example.catatanku.models.Notes;
import com.example.catatanku.services.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "labels")
public class LabelsController {

    @Autowired
    LabelsService labelsService;

    @PostMapping
    public Labels add(@RequestBody PostLabelsBody postLabelsBody) {
        return labelsService.add(postLabelsBody);
    }

    @GetMapping
    public List<Labels> getList(@RequestParam String name) {
        return labelsService.getList(name);
    }

    @GetMapping("/{id}")
    public Optional<Labels> get(@PathVariable("id") int labelsId) {
        return labelsService.get(labelsId);
    }

    @PatchMapping("/{id}")
    public int update(@RequestBody PatchLabelsBody body, @PathVariable("id") int labelsId) {
        return labelsService.updateName(body, labelsId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int noteId) {
        labelsService.deleteById(noteId);
    }
}
