package com.xmcu.pojo;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/2/18 17:09
 */
public class Student {
    private Integer id;            // 主键id
    private String name;        // 学生姓名
    private Integer age;         // 学生年龄


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
