package com.example.model.repository;

import com.example.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<User ,Long> {
}