package com.example.catatanku.body;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PostNotesLabelsBody {

    @NotNull
    int notesId;

    @NotNull
    int labelsId;
}
