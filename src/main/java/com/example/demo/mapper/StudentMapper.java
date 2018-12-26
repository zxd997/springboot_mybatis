package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    List<Student> listStudent();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}