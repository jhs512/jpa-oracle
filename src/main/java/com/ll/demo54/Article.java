package com.ll.demo54;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq_generator")
    @SequenceGenerator(name = "article_seq_generator", sequenceName = "ARTICLE_SEQUENCE", allocationSize = 1)
    private Long id;
}
