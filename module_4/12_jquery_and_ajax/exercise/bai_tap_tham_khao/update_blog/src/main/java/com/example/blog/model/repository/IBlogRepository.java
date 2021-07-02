package com.example.blog.model.repository;


import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Integer> {
    Page<Blog> findByNameContaining(String name, Pageable pageable);

    List<Blog> findByNameContaining(String name);




    Iterable<Blog> findAllByCategory(Category category);
    //  Xem danh sách các bài viết của một category
    @Query(value = "select *from blogs where category_id=:id",nativeQuery = true)
    List<Blog> findCategoryOfBlog(@Param("id") Integer id);
}