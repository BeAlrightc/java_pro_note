package com.lcc.mapper;

import com.lcc.pojo.Movie;

public interface MovieMapper {
    //查询表
    Movie selectAll();
    //通过id查询表
    Movie selectmovieAllById(int id);
    //删除
    Movie delete();
    //更新
    Movie update();
}
