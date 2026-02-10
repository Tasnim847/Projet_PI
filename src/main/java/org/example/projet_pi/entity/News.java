package org.example.projet_pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newsId;

    private String title;

    @Column(length = 5000)
    private String content;

    @Temporal(TemporalType.DATE)
    private java.util.Date publishDate;

    @ManyToOne
    private Admin admin;
}

