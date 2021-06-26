package com.example.controller;

import com.example.model.dto.ProductDto;
import com.example.model.entity.Category;
import com.example.model.entity.Product;
import com.example.model.service.ICategoryService;
import com.example.model.service.IProductService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/product", "/"})
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }


    @GetMapping(value = "/create-product")
    public ModelAndView showCreateForm() {

        ProductDto productDto = new ProductDto();
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("productDto", productDto);
        return modelAndView;
    }


    @PostMapping(value = "/create-product")
    public ModelAndView saveProduct(@Validated @ModelAttribute ProductDto productDto, BindingResult bindingResult) {
        List<Category> categories = (List<Category>) categoryService.findAll();

        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        // kiem tra
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/product/create");
            modelAndView.addObject("categories", categories);
            return modelAndView;
        } else {
            productService.save(product);
            ModelAndView modelAndView = new ModelAndView("/product/create");
            modelAndView.addObject("product", product);
            modelAndView.addObject("categories", categories);
            modelAndView.addObject("mes", "new product created successfully");
            return modelAndView;
        }
    }


    @GetMapping(value = "/products")
    public ModelAndView listBlogs(@RequestParam("search") Optional<String> search, @PageableDefault(value = 2) Pageable pageable) {
        Page<Product> products;
        ModelAndView modelAndView = new ModelAndView("/product/list");

        if (search.isPresent()) {
            products = productService.findAllByNameContaining(search.get(), pageable);
            modelAndView.addObject("search", search.get());

        } else {
            products = productService.findAll(pageable);
        }

        modelAndView.addObject("products", products);
        return modelAndView;

    }
// coppy la nguoc lai voi create

    @GetMapping(value = "/edit-product/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Product> product = productService.findById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        if (product.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("productDto", productDto);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping(value = "/edit-product")
    public ModelAndView updateProduct(@Validated @ModelAttribute ProductDto productDto, BindingResult bindingResult) {
        List<Category> provinces = (List<Category>) categoryService.findAll();
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/edit");
            modelAndView.addObject("provinces", provinces);
            return modelAndView;
        } else {
            productService.save(product);
            ModelAndView modelAndView = new ModelAndView("product/edit");
            modelAndView.addObject("product", product);
            modelAndView.addObject("provinces", provinces);
            modelAndView.addObject("mes", "product update successfully");
            return modelAndView;

        }
    }

    @GetMapping(value = "/delete-product/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("product/delete");
            modelAndView.addObject("product", product.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping(value = "/delete-product")
    public String deleteBlog(@ModelAttribute("product") Product product) {
        productService.remove(product.getId());
        return "redirect:products";
    }


}