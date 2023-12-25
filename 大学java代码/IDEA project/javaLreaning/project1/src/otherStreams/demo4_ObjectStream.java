package otherStreams;

import bean.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/*
对象输入流 ObjectInputStream ,将文件里的对象读出来，他是反序列化
 */

public class demo4_ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        demo1();
        //优化过后。将对象存到集合当中，再通过遍历集合的方式读取对象
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
        ArrayList<Person> list =(ArrayList<Person>)ois.readObject();//将集合对象一次读取
     for (Person p : list) {
         System.out.println(p);
     }
     ois.close();

    }

    private static void demo1() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
        Person p1= (Person)ois.readObject();//把对象读出来
        Person p2= (Person)ois.readObject();
        //Person p3 =(Person)ois.readObject();//当文件读取到了末尾时出现EOFException
        System.out.println(p1);
        System.out.println(p2);
    }
}
