package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository//创建一个对象
public class BookDaImpl implements BookDao{

    //注入JdabcTemplate类对象属性
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法1
    public void add(Book book) {
        //1.创建SQL语句
        String sql = "insert into book values(?,?,?)";
        //调用方法实现
      //int update = jdbcTemplate.update(sql,book.getUserId(),book.getUsername(),book.getUstatus());
        //改进
        Object[]args ={book.getUserid(),book.getUsername(),book.getUstatus()};
        //第一个参数用于编写数据库语句，第二个参数获得数据库字段
      int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

//修改的方法
    public void updateBook(Book book) {
        String sql = "update book set username=?,ustatus=? where userid=?";
        Object[] args = {book.getUsername(),book.getUstatus(),book.getUserid()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);//影响的行数
    }
//删除的方法
    public void delete(String id) {
        String sql = "delete from book where userId=?";
        int update =jdbcTemplate.update(sql,id);
        System.out.println(update);
    }
//查询表记录数
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count =jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }
//查询返回对象
    public Book findBookInfo(String id) {
        String sql ="select * from book where userid=?";
        //调用方法
       Book book =jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }
//查询返回集合
    public List<Book> findAllBook() {

        String sql = "select * from book";
        //调用方法
        List<Book> bookList = (List<Book>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
//批量添加
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql ="insert into book values(?,?,?)";
      int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
//批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update book set username=?,ustatus=? where userid=?";
        int[] ints = jdbcTemplate.batchUpdate();
        System.out.println(Arrays.toString(ints));
    }
//批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from book where userid=?";
       int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
