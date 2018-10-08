package com.college.test.studentdet.studentdetails;


import com.college.test.studentdet.repo.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepositoryImpl sr;

   /* private List<student> l1 =new ArrayList<>(Arrays.asList(
            new student("1","A"),
            new student ("2","B")
    ));
*/
    public List<Student> dispStu() {

       List<Student> ls=new ArrayList<>();
        sr.findAll()
                .forEach(ls::add);
        return ls;
    }

    public Optional<Student> serchStu(String id) {

        return sr.findById(id);


    }

    public void delStu(String id) {

        sr.deleteById(id);
    }

    public void addStu(Student st) {
        sr.save(st);

    }

    public void updStu(Student st , String id) {
        sr.save(st);

    }
}
