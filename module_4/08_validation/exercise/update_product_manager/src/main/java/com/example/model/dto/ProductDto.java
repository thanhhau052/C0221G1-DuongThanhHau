package com.example.model.dto;

import com.example.model.entity.Category;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class ProductDto {
    private Integer id;
    private String name;
    private String detail;
    private int amount;
    private Date date= new Date();


    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id" ,referencedColumnName = "id")
    private Category category;
}
