package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生信息，以及对应的老师的信息
public List<Student> getStudent();
//使用按照结果嵌套处理查询
public List<Student> getStudent2();
public List<Student> getStudent3();

}
