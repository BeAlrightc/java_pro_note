package com.liu.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.demo.pojo.User;

//在对应的Mapper上面实现基本的接口 BaseMapper
public interface UserMapper extends BaseMapper<User> {
    //不需要像以前一样加上繁琐复杂的xml文件了
}
