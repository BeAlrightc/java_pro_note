package com.lcc.mapper;

import com.lcc.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
   Admin test(int id);
    Admin selectAdminAllById(int id);
}
