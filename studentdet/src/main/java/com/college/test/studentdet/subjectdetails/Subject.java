package com.college.test.studentdet.subjectdetails;

import com.college.test.studentdet.studentdetails.Student;

import javax.persistence.*;

@Entity
@Table(name="Subject")
public class Subject {

    @Id
    String sid;
//    @Column(nullable = false)
    String sname;

    @ManyToOne
    private Student stu;
  //  @JoinColumn(name="student_Id",nullable=false)



    public Subject() {

    }

    public Subject(String sid, String sname, String stuId) {
        this.sid = sid;
        this.sname = sname;
        this.stu=new Student(stuId,"");

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student getS() {
        return stu;
    }

    public void setS(Student stu) {
        this.stu = stu;
    }


}
