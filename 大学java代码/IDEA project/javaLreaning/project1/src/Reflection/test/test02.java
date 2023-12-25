package Reflection.test;
/**
 * * A:案例演示
 * public void setProperty(Object obj, String propertyName, Object value){}，
 * 此方法可将obj对象中名为propertyName的属性的值设置为value。
 * @throws Exception
 */

public class test02 {

    public static void main(String[] args) throws Exception{
            Student s=new Student("张三",23);
        System.out.println(s);
//创建一个Tool类对象
        Tool t =new Tool();
        t.setProperty(s,"name","李四");//对属性进行修改值操作
        System.out.println(s);//发现修改成功
    }
}
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
