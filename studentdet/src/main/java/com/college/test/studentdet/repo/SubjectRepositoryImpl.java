package com.college.test.studentdet.repo;

import com.college.test.studentdet.subjectdetails.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepositoryImpl extends CrudRepository <Subject,String >{

    public List<Subject> findByStuId (String StudentId);
}
