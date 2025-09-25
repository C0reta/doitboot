package com.example.doitboot;

import org.springframework.data.jpa.repository.JpaRepository;

// 리포지터리: 데이터의 저장, 조회, 수정, 삭제... and so on

public interface QuestionRepository extends JpaRepository<Question, Integer>{
}
