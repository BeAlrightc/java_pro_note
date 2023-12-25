package com.xmcu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private Integer id;
    private String number;
    private List<Product> productList;
}
