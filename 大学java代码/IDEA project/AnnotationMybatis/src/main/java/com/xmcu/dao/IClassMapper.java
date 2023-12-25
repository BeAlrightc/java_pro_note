package com.xmcu.dao;

import com.xmcu.pojo.IClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface IClassMapper {
    @Select("select * from c_class where id=#{id}")
    @Results({@Result(id=true,column = "id",property = "id"),
    @Result(column = "classname",property = "classname"),
    @Result(column = "id",property = "studentList",
    many=@Many(select="com.xmcu.dao.IStudentMapper.selectStudentByCid"))})
    IClass selectClassById(int id);
}
