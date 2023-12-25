package com.wrx.mapper;

import com.wrx.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    Admin test(int id);
}
