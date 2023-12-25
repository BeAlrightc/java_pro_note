package bean;

import java.io.Serializable;

public class Person implements Serializable {//继承该接口支持实现序列化
    private static final long serialVersionUID =2L;
    private String name;
    private int age;
    private String gender;
    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//按照姓名长度来排序
//    @Override
//    public int compareTo(Person o) {
//        int lenght=this.name.length()-o.name.length();//比较长度为主要条件
//        int num =lenght==0 ? this.name.compareTo(o.name):lenght;//比较内容为次要条件
//        return num==0 ? this.age-o.age:num;
//    }
//按照姓名排序
//    @Override
//    public int compareTo(Person o) {
//        int num=this.name.compareTo(o.name);//按照姓名排序
//        return num==0 ? this.age-o.age: num;//年龄为次要条件
//    }
    //按照奈年龄排序
//    @Override
//    public int compareTo(Person o) {
//       int num=this.age-o.age;//年龄是比较的主要条件
//        return num==0 ? this.name.compareTo(o.name) :num;//姓名是比较的次要条件
//    }


}
