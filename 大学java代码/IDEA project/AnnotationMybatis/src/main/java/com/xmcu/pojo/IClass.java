package com.xmcu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IClass {
    private Integer id;
    private String classname;
    private List<IStudent> studentList;
}
