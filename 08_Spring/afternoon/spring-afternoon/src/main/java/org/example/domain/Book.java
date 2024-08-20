package org.example.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books") // 클래스명이 테이블병과 같으면 생략가능함
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "title")
    private String author;

    public Book() {
    }

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
