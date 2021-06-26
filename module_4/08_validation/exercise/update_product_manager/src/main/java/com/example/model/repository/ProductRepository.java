package com.example.model.repository;

import com.example.model.entity.Category;
import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {


    Page<Product> findByNameContaining(String name, Pageable pageable);

//    @Query(value = "select *from blogs order by date desc", nativeQuery = true)
//    Iterable<Blog> findAll();


    Iterable<Product> findAllByCategory(Category category);
}
