package com.example.blog.model.repository;


import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Integer> {
    Page<Blog> findByNameContaining(String name, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);

}