package bean;

import java.util.Objects;

public class Students implements Comparable<Students>{
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        int num=this.age-o.age;//以年龄为主要条件
        return num==0 ? this.name.compareTo(o.name) : num;//以姓名为此药条件
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Students students = (Students) o;
//        return age == students.age &&
//                Objects.equals(name, students.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
