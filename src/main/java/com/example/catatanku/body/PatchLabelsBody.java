package com.example.catatanku.body;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatchLabelsBody {
    @Size(max = 10) @NotEmpty @NotNull
    String name;
}
