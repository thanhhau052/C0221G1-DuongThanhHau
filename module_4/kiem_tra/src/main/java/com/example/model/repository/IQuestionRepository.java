package com.example.model.repository;

import com.example.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends JpaRepository<Question,Integer> {
    @Query(value = "select * from question where  title like %?1%  and question_type_id like %?2%  ",
            nativeQuery = true)
    Page<Question> findByQuestionContaining(String title,String questionType, Pageable pageable);
}
