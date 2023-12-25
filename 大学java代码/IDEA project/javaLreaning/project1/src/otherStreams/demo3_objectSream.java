package otherStreams;

import bean.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class demo3_objectSream {
    /*
    什么是对象操作流？
      该流可以将一个对象写出，或者读取一个对象到程序中，也就执行了序列化和反序列化的操作
      使用方式：
      对象输出流
      写出：new objectoutputstream(outputstream),writeobject()
      序列化（将对象写到文件上）反序列化（游戏读档）
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        Person p1=new Person("张三",23);
        Person p2=new Person("李四",24);
        Person p3=new Person("王五",25);
        Person p4=new Person("赵六",26);

        ArrayList<Person> list =new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("e.txt"));
oos.writeObject(list);//把整个集合对象一次写出到文件当中
oos.close();
    }

    private static void demo1() throws IOException {
        Person p1=new Person("张三",23);
        Person p2=new Person("李四",24);

        //将对象转换为字节数组存进去，会出现乱码
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("f.txt"));
        oos.writeObject(p1);//将对象写入
        oos.writeObject(p2);
        oos.close();
    }
}
