package com.service;

import com.dao.UserDao;
import com.po.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<MyUser> selectUserByUname(MyUser user) {

        return userDao.selectUserByUname(user);
    }
}
