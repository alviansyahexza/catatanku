package com.example.catatanku.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class Labels {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    String name;

    @CreationTimestamp
    LocalDateTime createdAt;
}
