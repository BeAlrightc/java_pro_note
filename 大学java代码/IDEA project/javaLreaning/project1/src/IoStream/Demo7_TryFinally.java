package IoStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {
    public static void main(String[] args) throws IOException {
//        demo1();
        //jdk7的处理异常的方法，
        try(
                //他俩具备自动关闭的功能
        FileInputStream fis =new FileInputStream("xxx.txt");
        FileOutputStream fos =new FileOutputStream("yyy.txt");
        MyClose myc=new MyClose();
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            fos.close();
        }
    }

    private static void demo1() throws IOException {
        //复制文件操作代码
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("xxx.txt");
            fos = new FileOutputStream("yyy.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {//try fianlly嵌套的目的是：尽量能够关闭这些流，能关一个是一个
            try {
                if (fis != null)
                    fis.close();
            }finally {
                if (fos != null)
                    fos.close();
            }
        }
    }
}

class MyClose implements AutoCloseable{
    public void close(){
        System.out.println("我关了");
    }
}
