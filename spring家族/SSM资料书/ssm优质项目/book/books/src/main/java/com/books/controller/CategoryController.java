package com.books.controller;

import com.books.entity.Category;
import com.books.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
//注入对象
@Controller
@RequestMapping("/category")
public class CategoryController {
//注入属性
    @Autowired
    private CategoryService categoryService;
//请求处理
    @RequestMapping("/category_list")
    public String openCategory(HttpServletRequest request, Model model){
        String categoryname = request.getParameter("context");
        List<Category> category = categoryService.findAll(categoryname);
        model.addAttribute("category",category);
        model.addAttribute("context",categoryname);
        return "category/category_list";
    }

    @RequestMapping("/category_add")
    public String openAdd(){
        return "category/category_add";
    }

    @RequestMapping("/addCategory")
    public String add(Category record){
        categoryService.addCategory(record);
        return "redirect:/category/category_list";
    }

    @RequestMapping("/deleteCategory/")
    public String delete(Integer categoryid){
        categoryService.deleteById(categoryid);
        return "redirect:/category/category_list";
    }

    @RequestMapping("/category_edit/")
    public String openUpdate(Integer categoryid,Model model){
        Category category = categoryService.getOne(categoryid);
        model.addAttribute("category",category);
        return "category/category_edit";
    }

    @RequestMapping("/updateCategory")
    public String update(Category record){
        categoryService.updateCategory(record);
        return "redirect:/category/category_list";
    }
}
