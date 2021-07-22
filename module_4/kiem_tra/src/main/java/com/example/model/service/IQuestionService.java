package com.example.model.service;

import com.example.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionService extends IGeneralService<Question> {
    Page<Question> findByQuestionContaining(String title, String questionType, Pageable pageable);
}
