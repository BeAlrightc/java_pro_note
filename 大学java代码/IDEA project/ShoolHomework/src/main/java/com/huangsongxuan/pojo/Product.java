package com.huangsongxuan.pojo;

public class Product {
    private Integer id;
    private String goodsname;
    private double price;

    public Product() {
    }

    public Product(Integer id, String goodsname, double price) {
        this.id = id;
        this.goodsname = goodsname;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                '}';
    }
}
