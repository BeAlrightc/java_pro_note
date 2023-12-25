package com.liuChengChuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;
}
