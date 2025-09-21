package com.manoj.studentrecordmanager.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.manoj.studentrecordmanager.model.Student;

@Repository
public class StudentRepository {

    Map<Long, Student> students = new HashMap<>();
    private Long currentId = 1L;

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student save(Student student) {
        if (student.getId() == null) {
            student.setId(currentId++);
        }
        students.put(student.getId(), student);
        return student;
    }

    public void deleteById(Long id) {
        students.remove(id);
    }
}
