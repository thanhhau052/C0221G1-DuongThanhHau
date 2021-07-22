package com.example.model.service.impl;

import com.example.model.entity.Question;
import com.example.model.repository.IQuestionRepository;
import com.example.model.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    private IQuestionRepository questionRepository;
    @Override
    public Iterable<Question> findAll() {
        return this.questionRepository.findAll();
    }

    @Override
    public Optional<Question> findById(Integer id) {
        return this.questionRepository.findById(id);
    }

    @Override
    public void save(Question question) {
        this.questionRepository.save(question);
    }

    @Override
    public void remove(Integer id) {
        this.questionRepository.deleteById(id);
    }

    @Override
    public Page<Question> findByQuestionContaining(String title, String questionType, Pageable pageable) {
        return this.questionRepository.findByQuestionContaining(title,questionType,pageable);
    }
}
