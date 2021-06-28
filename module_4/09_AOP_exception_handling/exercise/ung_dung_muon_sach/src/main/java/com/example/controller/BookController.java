package com.example.controller;

import com.example.exception.BookException;
import com.example.model.entity.Book;
import com.example.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping(value = {"/", "/books"})
    public ModelAndView showListBook() {
        Iterable<Book> books = this.bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("book/list");
        modelAndView.addObject("books", books);
        return modelAndView;

    }

    @GetMapping("/books/{id}")
    public ModelAndView viewBook(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);
        if (book == null) {
            return new ModelAndView("error");
        }
        ModelAndView modelAndView = new ModelAndView("book/view");
        modelAndView.addObject("book", book);
        return modelAndView;
    }

    // mượn sách
    @GetMapping("/books/borrow/{id}")
    public ModelAndView borrowBook(@PathVariable Long id) {
        Book book = bookService.findById(id);
        if (book == null) {
            return new ModelAndView("error");
        }
        book.setQuantity(book.getQuantity() - 1);
        if (book.getQuantity() < 0) {
            return new ModelAndView("error");
        }
        bookService.save(book);
        Iterable<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("book/list");
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    // trả sách
    @GetMapping("/books/get/{id}")
    public ModelAndView getBook(@PathVariable Long id) {
        Book book = bookService.findById(id);
        if (book == null) {
            return new ModelAndView("error");
        }
        book.setQuantity(book.getQuantity() + 1);
        bookService.save(book);
        Iterable<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("book/list");
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    // Handler lại exception

    @ExceptionHandler(BookException.class)
    public String handleBookException() {
        return "error";
    }
}
