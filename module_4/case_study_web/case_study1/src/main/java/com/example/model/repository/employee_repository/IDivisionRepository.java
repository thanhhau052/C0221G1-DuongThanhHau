package com.example.model.repository.employee_repository;

import com.example.model.entity.employee.Division;
import org.hibernate.boot.model.source.spi.JpaCallbackSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionRepository extends JpaRepository<Division,Integer> {
}
