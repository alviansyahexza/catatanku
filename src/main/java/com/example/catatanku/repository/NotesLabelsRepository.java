package com.example.catatanku.repository;

import com.example.catatanku.models.NotesLabels;
import com.example.catatanku.models.id.NotesLabelsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesLabelsRepository extends JpaRepository<NotesLabels, NotesLabelsId> {

    List<NotesLabels> findByNotesId(int notesId);
    List<NotesLabels> findByNotesIdAndLabelsId(int notesId, int labelsId);
    List<NotesLabels> findByLabelsId(int labelsId);
}
