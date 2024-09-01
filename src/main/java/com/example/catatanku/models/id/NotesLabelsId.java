package com.example.catatanku.models.id;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class NotesLabelsId implements Serializable {

    private int notesId;
    private int labelsId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotesLabelsId that = (NotesLabelsId) o;
        return Objects.equals(notesId, that.notesId) &&
                Objects.equals(labelsId, that.labelsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notesId, labelsId);
    }
}
