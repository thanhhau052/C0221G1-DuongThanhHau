package com.example.controller;


import com.example.model.entity.Blog;
import com.example.model.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping( value = "/create-blog")
    public ModelAndView showCreateForm(){
        Blog blog = new Blog();
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }

    @PostMapping(value = "/create")
    public ModelAndView saveBlog(@ModelAttribute("blogObj") Blog blog){
        blogService.save(blog);
        Blog blog1 = new Blog();
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog",blog1);
        modelAndView.addObject("mes","new blog created successfully");
        return modelAndView;
    }
    @GetMapping(value = "/blogs")
    public ModelAndView showList(){
        List<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blogs",blogs);
        return modelAndView;
    }

    @GetMapping( value = "/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if (blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/edit");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping(value = "edit")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("mes","Blog update successfully");
        return modelAndView;
    }

    @GetMapping(value = "delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if (blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/delete");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "delete")
    public ModelAndView deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        ModelAndView modelAndView = new ModelAndView("blog/delete");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("mess","Blog delete successfully");
        return modelAndView;
    }
}