package com.college.test.studentdet.subjectdetails;

import com.college.test.studentdet.repo.SubjectRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepositoryImpl sur;


    public List<Subject> dispSub(String Id) {

        List<Subject> ls=new ArrayList<>();
        sur.findByStuId(Id)
                .forEach(ls::add);
        return ls;

       //
      //  sur.findAll()
        //        .forEach(ls::add);
        //return ls;
    }

    public Optional<Subject> searchSub(String id) {

        return sur.findById(id);


    }

    public void delSub(String id) {

        sur.deleteById(id);
    }

    public void addSub(Subject st) {
        sur.save(st);

    }

    public void updSub(Subject st) {
        sur.save(st);

    }
}
