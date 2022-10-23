package com.example.mc_back.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@Entity
@Table(name = "notice")
public class NoticeEntity extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 아이디

    @Column(name = "title", length = 10, nullable = false)
    private String title; // 제목

    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    private String content; //내용
}
