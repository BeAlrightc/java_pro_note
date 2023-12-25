package com.xmcu.dao;

import com.xmcu.pojo.IStudent;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//200250217 黎小凤
public interface IStudentMapper {

  @Select("select * from s_student where id=#{id}")
  IStudent selectStudent(int id);
  @Update("update s_student set name=#{name},age=#{age} " +
          "where id=#{id}")
    int updateStudent(IStudent istudent);
    @Select("select * from s_student where cid=#{cid}")
    @Results({@Result(id=true,column = "id",property = "id"),
    @Result(column = "classname",property = "classname")})
    List<IStudent> selectStudentByCid(int cid);
}
