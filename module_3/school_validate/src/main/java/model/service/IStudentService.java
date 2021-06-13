package model.service;

import model.bean.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(int id);

    List<Student> findByName(String name);

    boolean save(Student student);

    boolean update(int id, Student student);

    boolean remove(int id);
}
