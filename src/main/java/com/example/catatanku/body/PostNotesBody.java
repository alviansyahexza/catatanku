package com.example.catatanku.body;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostNotesBody {

    @Size(max = 5)
    String title;

    @Size(max = 10)
    String content;
}
