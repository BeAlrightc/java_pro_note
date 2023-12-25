package com.lcc.service.impl;

import com.lcc.mapper.AdminMapper;
import com.lcc.pojo.Admin;
import com.lcc.pojo.RespBean;
import com.lcc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public RespBean login() {
        Admin admin = adminMapper.test(1);
        return RespBean.success(admin,"登录成功");
    }
}
