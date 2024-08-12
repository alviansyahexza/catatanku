package com.example.catatanku.repository;


import com.example.catatanku.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {
}
