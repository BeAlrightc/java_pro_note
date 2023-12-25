package com.books.service;


import com.books.dao.BookMapper;
import com.books.dao.CategoryMapper;
import com.books.entity.Book;
import com.books.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
//注入属性
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAll(String bookname){
        return bookMapper.findAll(bookname);
    }

    public void addBook(Book record){
        bookMapper.insert(record);
    }

    public void deleteById(Integer bookid){
        bookMapper.deleteByPrimaryKey(bookid);
    }

    public Book getOne(Integer bookid){
        return bookMapper.selectByPrimaryKey(bookid);
    }

    public void updateBook(Book record){
        bookMapper.updateByPrimaryKey(record);
    }
}
