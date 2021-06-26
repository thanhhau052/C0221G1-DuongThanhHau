package com.example.model.repository;

import com.example.model.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category,Integer> {
}
