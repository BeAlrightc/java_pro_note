package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok的一个注解，包括，构造器，getter和setter等方法
@AllArgsConstructor//有参构造
@NoArgsConstructor //无参构造
public class User {
    private int id;
    private String name;
    private String password;
}
