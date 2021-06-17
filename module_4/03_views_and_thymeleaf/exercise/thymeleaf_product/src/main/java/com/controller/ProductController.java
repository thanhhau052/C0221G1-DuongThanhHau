package com.controller;

import com.model.bean.Product;
import com.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = {"/product","/"})
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "")
    public String index(Model model) {
        List<Product> productList=productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping(value ="/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }


    @PostMapping(value = "/save")
    public String save(@ModelAttribute("product") Product product, RedirectAttributes redirect) {
        product.setId(productService.findAll().size() + 1);
        productService.save(product);
        redirect.addFlashAttribute("success", "Add Product Successfully!");
        return "redirect:/product/";
    }

    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable int id,Model model) {
      model.addAttribute("product",productService.findById(id));
        return "/edit";
    }


    @PostMapping(value = "/update")
    public String update(Product product, RedirectAttributes redirect) {
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Update Product Successfully!");
        return "redirect:/product/";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Delete Product Successfully!");
        return "redirect:/product/";
    }


    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }

    @GetMapping("/search")
    public String findProduct(@RequestParam String name,Model model){
        model.addAttribute("products",productService.findByName(name));
        return "/index";
    }


//    @PostMapping(value = "/search")
//    public ModelAndView searchForm(@ModelAttribute Product product) {
//        System.out.println(product.getName());
//        System.out.println(productService.findByName(product.getName()).get(0).getName());
//        ModelAndView modelAndView = new ModelAndView("search");
//        modelAndView.addObject("products", productService.findByName(product.getName()));
//        return modelAndView;
//    }
}