package com.example.catatanku.models;

import com.example.catatanku.models.id.NotesLabelsId;
import jakarta.persistence.*;
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

    @OneToOne @JoinColumn(name = "labelsId", referencedColumnName = "id")
    Labels labels;

    @OneToOne @JoinColumn(name = "notesId ", referencedColumnName = "id")
    Notes notes;
}
