package com.DI;
//员工类
public class Employee {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式进行表示
    private Dept dept;
    //为他们都添加相应的setter方法操作

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
public Dept getDept(){
        return dept;
}
    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

}
