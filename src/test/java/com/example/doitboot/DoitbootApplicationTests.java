package com.example.doitboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoitbootApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void name() {
    }

    @Test
    void testJpa() {
        List<Question> qList = this.questionRepository.findBySubjectLike("%sbb%");
        Question q = qList.get(0);
        assertEquals("What is sbb?", q.getSubject());


    }

}
