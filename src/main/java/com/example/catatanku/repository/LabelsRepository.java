package com.example.catatanku.repository;


import com.example.catatanku.models.Labels;
import com.example.catatanku.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelsRepository extends JpaRepository<Labels, Integer> {}
