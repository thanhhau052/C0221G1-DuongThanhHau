package com.example.thuc_hanh2_spring_boot.model.repository;


import com.example.thuc_hanh2_spring_boot.model.entity.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
