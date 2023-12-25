package com.xmcu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IStudent {
    private Integer id;
    private String name;
    private Integer age;
    private Integer cid;
}
