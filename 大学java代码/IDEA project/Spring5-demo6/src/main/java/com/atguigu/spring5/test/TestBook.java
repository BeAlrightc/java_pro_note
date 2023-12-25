package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        //新建一个Book类对象
//        Book book = new Book();
//        //进行字段属性插入操作
//        book.setUserId("3");
//        book.setUsername("pythonerer");
//        book.setUstatus("casd");
//        //调用方法进行插入操作
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserid("2");
//        book.setUsername("pythone3");
//        book.setUstatus("atguigie");
//        bookService.updateBook(book);

        //删除
      // bookService.delete("2");

        //查询返回某个值
//        int count =bookService.findCount();
//        System.out.println(count);

        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);
        //查询返回集合
//    List<Book> all =bookService.findAll();
//        System.out.println(all);
    //批量添加
//        List<Object[]> batchArgs = new ArrayList<Object[]>();
//        Object[] o1 = {"5","GO","E"};
//        Object[] o2 = {"6","C","F"};
//        Object[] o3 = {"7","JS","G"};
//        //把数组添加到集合当中
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);
        //批量修改操作
//        List<Object[]> batchArgs = new ArrayList<Object[]>();
//        Object[] o1 = {"java0909","a3","5"};
//        Object[] o2 = {"C10101","b4","6"};
//        Object[] o3 = {"Mysqlrt","c5","7"};
//
//        //把数组添加到集合当中
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量修改
//        bookService.batchAdd(batchArgs);
        //批量删除操作
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        Object[] o1 = {"5"};
        Object[] o2 = {"6"};
        Object[] o3 = {"7"};


        //把数组添加到集合当中
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用批量删除
        bookService.batchDelete(batchArgs);
    }

}
