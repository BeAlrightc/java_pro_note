package com.wrx.service.impl;

import com.wrx.pojo.RespBean;
import com.wrx.service.AdminService;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public RespBean login() {
        return RespBean.success("登录成功");
    }
}
