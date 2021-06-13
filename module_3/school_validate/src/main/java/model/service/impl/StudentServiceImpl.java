package model.service.impl;

import model.bean.Student;
import model.repository.StudentRepository;
import model.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public boolean save(Student student) {
        return studentRepository.insert(student);
    }

    @Override
    public boolean update(int id, Student student) {
        return studentRepository.update(id,student);
    }

    @Override
    public boolean remove(int id) {
        return studentRepository.delete(id);
    }
}
