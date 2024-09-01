package com.example.catatanku.models;

import com.example.catatanku.models.id.NotesLabelsId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@IdClass(NotesLabelsId.class)
@Data
public class NotesLabels {

    @Id
    int notesId;

    @Id
    int labelsId;

    @CreationTimestamp
    LocalDateTime createdAt;
}
