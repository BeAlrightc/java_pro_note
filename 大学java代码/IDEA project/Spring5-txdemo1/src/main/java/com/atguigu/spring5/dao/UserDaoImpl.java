package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//创建对象
@Repository
public class  UserDaoImpl implements UserDao{
     //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //lucy转账100给mary
    //少钱
    public void reduceMoney() {
        String sql = "update tb_account set money=money-? where  username = ?";
        jdbcTemplate.update(sql,100,"lucy");

    }

    //多钱
    public void addMoney() {
        String sql ="update tb_account set money=money+? where username = ?";
        jdbcTemplate.update(sql,100,"mary");

    }

}
