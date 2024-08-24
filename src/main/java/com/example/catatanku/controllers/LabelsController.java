package com.example.catatanku.controllers;

import com.example.catatanku.body.PostLabelsBody;
import com.example.catatanku.models.Labels;
import com.example.catatanku.services.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "labels")
public class LabelsController {

    @Autowired
    LabelsService labelsService;

    @PostMapping
    public Labels add(@RequestBody PostLabelsBody postLabelsBody) {
        return labelsService.add(postLabelsBody);
    }
}
