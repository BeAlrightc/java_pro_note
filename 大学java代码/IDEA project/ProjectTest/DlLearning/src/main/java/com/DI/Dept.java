package com.DI;
//部门类
public class Dept {
    private String dname;
//添加setter方法
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
