package com.example.mc_back.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "faq")
public class FaqEntity extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 아이디

    @Column(name = "faq_content", columnDefinition = "TEXT", nullable = false)
    private String faqContent; //질문내용
}
