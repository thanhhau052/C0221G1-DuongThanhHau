package com.example.blog.model.service;



import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByProvince(Category category);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    List<Blog> findCategoryOfBlog( Integer id);

}