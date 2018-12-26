package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @Autowired
    StudentMapper studentMapper;
//    @RequestMapping("/getUser")
//    public Student getStudent(){
//        Student student = new Student();
//        student.setSname("WangEr");
//        return student;
 //   }
    @RequestMapping("/1")
    public Student get1(HttpServletRequest request){
        String id = request.getParameter("id");
//        Student student = new Student();
//        student.setSname(id);
//        student.setSage("88");
//        studentMapper.insert(student);
        int sid = Integer.parseInt(id);
        Student student = studentMapper.selectByPrimaryKey(sid);
        return student;
    }
    @RequestMapping("/2")
    public Student get2(){
        Student student = new Student();
        student.setSname("lalal");
        student.setSage("77");
        int insert = studentMapper.insert(student);
        System.out.println(insert);
        return student;
    }
    @RequestMapping("/3")
    public Student get3(){
        Student student = studentMapper.selectByPrimaryKey(12);
        student.setSage("47");
        int i = studentMapper.updateByPrimaryKey(student);
        System.out.println(i);
        return student;
    }
    @RequestMapping("/4")
    public String get4(){
        int i = studentMapper.deleteByPrimaryKey(11);
        System.out.println(i);
        return "ddd";
    }
    @RequestMapping("/5")
    public List<Student> get5(){
        List<Student> students = studentMapper.listStudent();
        return students;
    }
}
