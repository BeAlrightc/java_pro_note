package com.books.controller;

import com.books.entity.Book;
import com.books.entity.Category;
import com.books.service.BookService;
import com.books.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
//注入对象
@Controller
@RequestMapping("/book")
public class BookController {
//注入属性
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
//请求分发
    @RequestMapping("/book_list")
    public String openbook(HttpServletRequest request, Model model){
        String bookname = request.getParameter("context");
        List<Book> book = bookService.findAll(bookname);
        System.out.println(bookname);
        model.addAttribute("book",book);
        model.addAttribute("context",bookname);
        return "book/book_list";
    }

    @RequestMapping("/book_add")
    public String openAdd(Model model,String categoryname){
        List<Category> categorys = categoryService.findAll(categoryname);
        model.addAttribute("category",categorys);
        return "book/book_add";
    }

    @RequestMapping("/addBook")
    public String add(Book record){
        bookService.addBook(record);
        return "redirect:/book/book_list";
    }

    @RequestMapping("/deleteBook/")
    public String delete(Integer bookid){
        bookService.deleteById(bookid);
        return "redirect:/book/book_list";
    }

    @RequestMapping("/book_edit/")
    public String openUpdate(Integer bookid,Model model,String categoryname){
        List<Category> categorys = categoryService.findAll(categoryname);
        model.addAttribute("category",categorys);
        Book book = bookService.getOne(bookid);
        model.addAttribute("book",book);
        return "book/book_edit";
    }

    @RequestMapping("/updateBook")
    public String update(Book record){
        bookService.updateBook(record);
        return "redirect:/book/book_list";
    }
}
