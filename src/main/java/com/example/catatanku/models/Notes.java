package com.example.catatanku.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class Notes {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    String title;

    String content;

    @CreationTimestamp
    LocalDateTime createdAt;
}
