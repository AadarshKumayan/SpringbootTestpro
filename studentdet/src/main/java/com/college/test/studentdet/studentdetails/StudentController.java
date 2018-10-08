package com.college.test.studentdet.studentdetails;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    private StudentService s;

    @RequestMapping("/Student")
    public List<Student> getAllStudent()
    {
        //String sup="aaa";
        //System.out.println("Hello");
        return s.dispStu();
        //return sup;
    }

    @RequestMapping("/Student/{id}")
    public Optional<Student> getStudent(@PathVariable String id)
    {
        return s.serchStu(id);
    }

    @RequestMapping(value="/Student/{id}", method= RequestMethod.DELETE)
    public void delStudent(@PathVariable String id)
    {
        s.delStu(id);
    }

    @RequestMapping(value="/Student",method =RequestMethod.POST)
    public void insStudent(@RequestBody Student st)
    {
                s.addStu(st);
    }

    @RequestMapping(value="/Student/{id}",method =RequestMethod.PUT)
    public void upStudent(@RequestBody Student st ,@PathVariable String id)
    {
        s.updStu(st,id);
    }
}
