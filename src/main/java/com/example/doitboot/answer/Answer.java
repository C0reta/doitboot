package com.example.doitboot.answer;

import java.time.LocalDateTime;

import com.example.doitboot.question.Question;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import com.example.doitboot.question.Question;

import lombok.Setter;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    // 하나의 질문에 답변은 여러 개이므로 해당 속성
    @ManyToOne
    private Question question;
}
