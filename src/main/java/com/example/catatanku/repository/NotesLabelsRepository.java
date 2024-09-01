package com.example.catatanku.repository;

import com.example.catatanku.models.NotesLabels;
import com.example.catatanku.models.id.NotesLabelsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesLabelsRepository extends JpaRepository<NotesLabels, NotesLabelsId> {
}
