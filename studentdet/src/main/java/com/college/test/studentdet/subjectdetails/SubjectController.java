package com.college.test.studentdet.subjectdetails;


import com.college.test.studentdet.studentdetails.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService ss;

    @RequestMapping("/Student/{stuid}/Subject")
    public List<Subject> getAllSubject(@PathVariable String stuid)
    {
        //String sup="aaa";
        //System.out.println("Hello");
        return ss.dispSub(stuid);
        //return sup;
    }

    @RequestMapping("/Student/{stuId}/Subject/{id}}")
    public Optional<Subject> getSubject(@PathVariable String stuid)
    {
        return ss.searchSub(stuid);
    }

    @RequestMapping(value="/Student/{stuId}/Subject/{id}", method= RequestMethod.DELETE)
    public void delSubject(@PathVariable String id)
    {
        ss.delSub(id);
    }

    @RequestMapping(value="/Student/{stuId}/Subject",method =RequestMethod.POST)
    public void insSubject(@RequestBody Subject st, @PathVariable String stuId)
    {
        //System.out.println("Hello"+st.getSid()+st.getSname());
        st.setS(new Student(stuId,""));
        //System.out.println("Hello1"+ st.getSid()+st.getSname()+st.getS());
        ss.addSub(st);
      //  System.out.println("Hello2");
    }

    @RequestMapping(value="/Student/{stuId}/Subject",method =RequestMethod.PUT)
    public void upSubject(@RequestBody Subject st ,@PathVariable String stuId)
    {
        st.setS(new Student(stuId,""));
        ss.updSub(st);
    }
}
