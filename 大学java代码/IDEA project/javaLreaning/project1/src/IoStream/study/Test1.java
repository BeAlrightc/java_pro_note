package IoStream.study;

import java.io.*;

public class Test1 {
    public static <bytes> void main(String[] args) throws IOException {
//        File file1 =new File("asd.txt");
//        file1.createNewFile();
        //System.out.println(file1.getName());


//        demo2();
//        demo3();
        BufferedInputStream ls =new BufferedInputStream(new FileInputStream("json1.jpg"));
        BufferedOutputStream os =new BufferedOutputStream(new FileOutputStream("jjs.jpg"));
        int b;
        while((b=ls.read()) != -1) {
            os.write(b);
        }
        ls.close();//一定不要忘了关闭资源操作
        os.close();
    }

    private static void demo3() throws IOException {
        //第一种拷贝哦
        FileInputStream li =new FileInputStream("json1.jpg");
        FileOutputStream so =new FileOutputStream("json2.jpg");
        byte[] arr =new byte[1024*2];
        int c;
        while((c=li.read(arr)) != -1){
            so.write(arr,0,c);
        }
        li.close();
        so.close();
    }

    private static void demo2() throws IOException {
        FileInputStream ls =new FileInputStream("asd.txt");
        FileOutputStream os =new FileOutputStream("copy.txt");
        byte [] byts=new byte[3];
        int b;
        while((b=ls.read(byts)) != -1) {
            System.out.print(new String(byts,0,b));
        }
        ls.close();
        os.close();
    }
}
