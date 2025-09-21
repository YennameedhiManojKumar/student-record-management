package com.manoj.studentrecordmanager.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoj.studentrecordmanager.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
