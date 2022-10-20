package com.example.mc_back.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@Entity
@Table(name = "notice")
public class NoticeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 아이디

    @Column(name = "title", length = 10, nullable = false)
    private String title; // 제목

    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    private String content; //내용

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at; // 작성일시

    @Column(name = "created_by", length = 10, nullable = false)
    private String created_by; // 작성자

    @Column(name = "updated_by", length = 10, nullable = false)
    private String updated_by; // 수정자

    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at; // 수정일시
}
