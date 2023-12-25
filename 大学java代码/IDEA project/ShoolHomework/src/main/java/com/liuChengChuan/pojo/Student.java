package com.liuChengChuan.pojo;

public class Student {
    private int id;
    private String name;
    private String major;
    private String sno;

    public Student() {
    }

    public Student(int id, String name, String major, String sno) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.sno = sno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }
}
