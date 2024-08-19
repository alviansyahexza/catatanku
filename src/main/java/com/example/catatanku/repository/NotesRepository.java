package com.example.catatanku.repository;


import com.example.catatanku.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {

    List<Notes> findByTitleContaining(String title);

    @Modifying
    @Query("UPDATE Notes n SET n.content = :content WHERE n.id = :id")
    int updateContent(@Param("content") String content, @Param("id") Integer id);

    @Modifying
    @Query(value = "UPDATE notes n set n.content = :content where n.id = :id", nativeQuery = true)
    int updateContentNative(@Param("content") String content, @Param("id") Integer id);
}
