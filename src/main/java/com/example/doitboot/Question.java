package com.example.doitboot;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class Question {
    @Id // 기본 키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 값 1씩 증가
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // 질문에서 답변 참조
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
