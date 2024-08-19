package com.example.catatanku.body;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatchNotesBody {
    @Size(max = 10)
    String content;
}
