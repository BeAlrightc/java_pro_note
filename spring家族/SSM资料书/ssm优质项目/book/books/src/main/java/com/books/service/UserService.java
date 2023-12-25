package com.books.service;

import com.books.dao.UserMapper;
import com.books.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//注入对象
@Service
@Transactional
public class UserService {
	//注入属性
	@Autowired
	private UserMapper userMapper;
//根据ID查找用户
	public User findUserByUserId(String userid) {
		return userMapper.findUserByUserId(userid);
	}

}
