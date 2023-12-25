package com.lcc.pojo;

public class Movie {
    private int id;
    private String mname;
    private String type;
    private int price;
    private int number;
    private String TypeD;
    private String time;

    public Movie() {
    }

    public Movie(int id, String mname, String type, int price, int number, String typeD, String time) {
        this.id = id;
        this.mname = mname;
        this.type = type;
        this.price = price;
        this.number = number;
        TypeD = typeD;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeD() {
        return TypeD;
    }

    public void setTypeD(String typeD) {
        TypeD = typeD;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", TypeD='" + TypeD + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
