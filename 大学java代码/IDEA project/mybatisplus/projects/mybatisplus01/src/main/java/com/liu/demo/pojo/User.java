package com.liu.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private Integer age;
    private String email;

    public User() {

    }
}
