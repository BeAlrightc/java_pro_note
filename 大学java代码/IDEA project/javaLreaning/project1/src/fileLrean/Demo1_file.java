package fileLrean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1_file {
    /*
     * File(String pathname)：根据一个路径得到File对象
     * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
     * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
     */
    public static void main(String[] args)   {
//        demo1();
//        demo2();
     File parent=new File( "D:\\IDEA project\\javaLreaning");
        String child="wer.txt";
        File file =new File(parent,child);
        System.out.println(file.exists());
        System.out.println(parent.exists());
    }

    private static void demo2() {
        String parent = "D:\\IDEA project\\javaLreaning";
        String child="wer.txt";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }

    private static void demo1() {
        File file =new File("D:\\IDEA project\\javaLreaning\\wer.txt");
        System.out.println(file.exists());

        File file2=new File("xxx.txt");
        System.out.println(file2.exists());


        File file3=new File("yyyy.txt");
        System.out.println(file3.exists());
    }
}
