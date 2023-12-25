package com.xiaoqinyan.pojo;

import java.util.List;

public class Category {
    private Integer id;
    private String typename;
    private List<Product> productList;

    public Category() {
    }

    public Category(Integer id, String typename, List<Product> productList) {
        this.id = id;
        this.typename = typename;
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", productList=" + productList +
                '}';
    }
}
