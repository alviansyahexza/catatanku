package com.example.catatanku.body;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostLabelsBody {

    @Size(max = 5) @NotNull @NotEmpty
    String name;
}
