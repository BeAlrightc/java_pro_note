package com.service;

import com.dao.UserLoginDao;
import com.po.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userLoginService")
@Transactional
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserLoginDao userLoginDao;
    @Override
    public UserLogin findUser(UserLogin userLogin) {
        UserLogin user = userLoginDao.findUser(userLogin);
        return user;
    }
}
