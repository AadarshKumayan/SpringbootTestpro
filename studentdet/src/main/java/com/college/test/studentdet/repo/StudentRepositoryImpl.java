package com.college.test.studentdet.repo;


import com.college.test.studentdet.studentdetails.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepositoryImpl extends CrudRepository<Student, String> {
}
