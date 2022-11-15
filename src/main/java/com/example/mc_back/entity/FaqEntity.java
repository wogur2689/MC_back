package com.example.mc_back.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "faq")
public class FaqEntity extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 아이디

    @Column(name = "faq_content", columnDefinition = "TEXT", nullable = false)
    private String faqContent; //질문내용

    @Column(name = "faq_answer_check", nullable = false)
    private String faqAnswerCheck; //답변여부

    @Builder
    public FaqEntity(String faqContent, String faqAnswerCheck) {
        this.faqContent = faqContent;
        this.faqAnswerCheck = faqAnswerCheck;
    }
}
