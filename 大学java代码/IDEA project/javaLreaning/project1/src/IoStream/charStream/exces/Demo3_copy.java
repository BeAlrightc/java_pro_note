package IoStream.charStream.exces;

import java.io.*;
/*
注意事项：
1.字符流也可以拷贝文件，但不推荐使用，同时读取时会把字节转换为字符，写出时还要把字符转回字节。
程序需要读取一段文本，或者写出一段文本的时候可以使用字符流
读取的时候是按照字符大小读取的，不会出现半个中文的情况
写出的时候可以直接将字符串写出，不用转换为字节数组

2.不可以拷贝非纯文本的文件
因为在读取的时候回见字节转换为字符，在转换的过程中，可能找不到对应的字符，就用？代替，写出的时候会将字符转换为字节写出去
如果是？，直接写出，这样写出之后文件就乱了，看不了
 */

public class Demo3_copy {
    //使用字符流进行拷贝操作
    public static void main(String[] args) throws IOException {
        //demo1();
        //demo2();
//        demo3();
        //缓冲区的大小为8192
      BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
      BufferedWriter bw =new BufferedWriter(new FileWriter("yyy.txt"));
      int c;
      while((c=br.read())!=-1){
          bw.write(c);
      }
        br.close();
        bw.close();
    }

    private static void demo3() throws IOException {
        //自定义字符数组的方式进行拷贝文本文件操作！！
        FileReader fr =new FileReader("xxx.txt");
        FileWriter fw =new FileWriter("yyy.txt");

        char[]arr =new char[1024];
        int len;
        while((len=fr.read(arr))!=-1){//将文件上的字符数据读取到字符数组中
            fw.write(arr,0,len);//将字符数组中的数据写到文件上
        }
        fr.close();
        fw.close();
    }

    private static void demo2() throws IOException {
        //字符流不能拷贝非纯文本的文件
        FileReader fr =new FileReader("json1.jpg");
        FileWriter fw =new FileWriter("jsons1.jpg");
        int c;
        while((c= fr.read())!=-1){
            fw.write(c);
        }
        fr.close();
        fw.close();
        //结果copy不成功，导致图片打不开
    }

    private static void demo1() throws IOException {
        //copy纯文本的文件
        FileReader fr =new FileReader("xxx.txt");
        FileWriter fw =new FileWriter("zzz.txt");
        int c;
        while((c=fr.read())!=-1){
            fw.write(c);
        }
        fr.close();
        fw.close();//一定要进行关流操作，否则内容留在缓冲区没有写进去文件，关流的话将会触发刷新操作
    }
}
