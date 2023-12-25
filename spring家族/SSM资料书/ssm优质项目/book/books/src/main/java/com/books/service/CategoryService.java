package com.books.service;


import com.books.dao.CategoryMapper;
import com.books.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//注入service对象
@Service
public class CategoryService {
//注入属性
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findAll(String categoryname){
        return categoryMapper.findAll(categoryname);
    }

    public void addCategory(Category record){
        categoryMapper.insert(record);
    }

    public void deleteById(Integer categoryid){
        categoryMapper.deleteByPrimaryKey(categoryid);
    }

    public Category getOne(Integer categoryid){
        return categoryMapper.selectByPrimaryKey(categoryid);
    }

//    public List<Category> selectCategory(){
//        return categoryMapper.selectCategory();
//    }

    public void updateCategory(Category record){
        categoryMapper.updateByPrimaryKey(record);
    }
}
