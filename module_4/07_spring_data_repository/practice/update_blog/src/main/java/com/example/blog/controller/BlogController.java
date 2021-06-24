package com.example.blog.controller;



import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.service.IBlogService;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }


    @GetMapping( value = "/create-blog")
    public ModelAndView showCreateForm(){
        Blog blog = new Blog();
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }



    @PostMapping(value = "/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        List<Category> categories= (List<Category>) categoryService.findAll();
        Blog blog1 = new Blog();
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog",blog1);
        modelAndView.addObject("categories",categories);
        modelAndView.addObject("mes","new blog created successfully");
        return modelAndView;
    }


    @GetMapping(value = "/blogs")
    public ModelAndView listBlogs(@RequestParam("search") Optional<String> search,@PageableDefault(value =2 ) Pageable pageable){
        Page<Blog> blogs;
        ModelAndView modelAndView = new ModelAndView("/blog/list");

        if(search.isPresent()){
            blogs = blogService.findAllByNameContaining(search.get(), pageable);
            modelAndView.addObject("search",search.get());

        } else {
            blogs = blogService.findAll(pageable);
        }

        modelAndView.addObject("blogs", blogs);
        return modelAndView;

    }

    @GetMapping( value = "/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog",blog.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping(value = "/edit-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        List<Category> provinces= (List<Category>) categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("provinces",provinces);
        modelAndView.addObject("mes","Blog update successfully");
        return modelAndView;
    }

    @GetMapping(value = "/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id){
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()){
            ModelAndView modelAndView = new ModelAndView("blog/delete");
            modelAndView.addObject("blog",blog.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
    blogService.remove(blog.getId());
    return "redirect:blogs";
    }
}