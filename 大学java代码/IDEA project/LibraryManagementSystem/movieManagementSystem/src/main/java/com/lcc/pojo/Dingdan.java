package com.lcc.pojo;

public class Dingdan {
    private int id;
    private String Dname;
    private String CTime;
    private String price;
    private int count;
    private String ChangCi;
    private String name;
    private String MovieN;

    public Dingdan() {
    }

    public Dingdan(int id, String dname, String CTime, String price, int count, String changCi, String name, String movieN) {
        this.id = id;
        Dname = dname;
        this.CTime = CTime;
        this.price = price;
        this.count = count;
        ChangCi = changCi;
        this.name = name;
        MovieN = movieN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getCTime() {
        return CTime;
    }

    public void setCTime(String CTime) {
        this.CTime = CTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChangCi() {
        return ChangCi;
    }

    public void setChangCi(String changCi) {
        ChangCi = changCi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieN() {
        return MovieN;
    }

    public void setMovieN(String movieN) {
        MovieN = movieN;
    }

    @Override
    public String toString() {
        return "Dingdan{" +
                "id=" + id +
                ", Dname='" + Dname + '\'' +
                ", CTime='" + CTime + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                ", ChangCi='" + ChangCi + '\'' +
                ", name='" + name + '\'' +
                ", MovieN='" + MovieN + '\'' +
                '}';
    }
}
