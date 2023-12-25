package IoStream.charStream.exces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//输入流，一个字符一个字符的读取
/*
字符流是什么？
   字符流是可以直接读写字符的IO流
   字符流读取字符，就要先读取到字节数据，然后转换为字符，如果要写出字符
   需要把字符转为字节再写出
 */
public class Demo1_FileReader {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileReader fr=new FileReader("xxx.txt");
        int c;
        while((c=fr.read())!=-1) {//通过项目默认的码表一次读取一个字符
            System.out.print((char)c);
        }
        fr.close();
    }

    private static void demo1() throws IOException {
        FileReader fr=new FileReader("xxx.txt");
        int x =fr.read();
        System.out.println(x);
        char c=(char)x;
        System.out.println(c);
        fr.close();
    }
}
