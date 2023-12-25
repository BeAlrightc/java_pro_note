package com.liuChengChuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    private Integer id;
    private String bookName;
    private double price;
    private String author;
}
