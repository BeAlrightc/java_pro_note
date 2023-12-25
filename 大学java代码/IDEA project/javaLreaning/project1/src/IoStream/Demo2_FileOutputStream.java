package IoStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {
    /*
  fileOutputStream在创建对象的时候如果没有就会帮我创建出来
  如果有的话就会先将文件清空
     */
    public static void main(String[] args) throws IOException {
//        demo1();
        //如果想追加就在第二个参数传入true就可以进行续写追加
        FileOutputStream fos = new FileOutputStream("yyy.txt",true);
        fos.write(97);
        fos.write(98);
        fos.close();
    }

    private static void demo1() throws IOException {
        //创建字节输出流对象，如果没有这个文件就会自动创建一个
        FileOutputStream fos = new FileOutputStream("yyy.txt");
//       fos.write(97);//虽然写出的是int数，但是在文件上是一个字节，会自动去除3个8位
//       fos.write(98);
//       fos.write(99);
        fos.write(100);
        fos.close();
    }
}
