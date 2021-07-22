package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTypeName;
    @OneToMany(targetEntity = Question.class)
    private List<Question> questions;

    public QuestionType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
