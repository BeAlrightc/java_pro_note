package IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {
    /*
    第三种拷贝
    定义小数组(最常用)
     */
    public static void main(String[] args) throws IOException {
//       demo1();
//        demo2();
        FileInputStream fis =new FileInputStream("Johnas.mp3");
        FileOutputStream fos =new FileOutputStream("typu.mp3");
        byte[] arr =new byte[1024*8];
        int len;
        while((len=fis.read(arr)) !=-1){//如果忘记加arr那么返回的就不是有效的字节个数，而是字节的码表值
            fos.write(arr,0,len);//将指定的byte数组中从偏移量（数组中的索引）off开始的len个字节写入此文件输出流
        }
        fis.close();
        fos.close();

    }

    private static void demo2() throws IOException {
        FileInputStream fis =new FileInputStream("yyy.txt");
        FileOutputStream fos =new FileOutputStream("www.txt");
        byte[] arr =new byte[2];
        int len;
        //使用这种方法就是输入流对象中一次读取2个字节
        while((len=fis.read(arr)) !=-1){//如果忘记加arr那么返回的就不是有效的字节个数，而是字节的码表值
            fos.write(arr,0,len);//将指定的byte数组中从偏移量（数组中的索引）off开始的len个字节写入此文件输出流
        }
        fis.close();
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("yyy.txt");
        byte[] arr=new byte[2];
        int a=fis.read(arr); //将文件上的字节读取到字节数组上。

        System.out.println(a);//读到的有效字节个数
        for (int v:arr
             ) {
            System.out.println(":"+v);
        }

        System.out.println("=============");

        for(byte b:arr){//第一次获取到文件上的a和b
            System.out.println(b);
        }
        System.out.println("========");

        int c=fis.read(arr);
        System.out.println(c);
        for(byte b : arr){
            System.out.println(b);
        }
        fis.close();
    }
}
