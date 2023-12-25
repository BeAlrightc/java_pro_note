package com.books.dao;

import com.books.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    //通过ID删除图书操作
    int deleteByPrimaryKey(Integer bookid);
 //插入图书操作
    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    //更新操作
    int updateByPrimaryKey(Book record);



    List<Book> findAll(@Param("bookname") String bookname);


}