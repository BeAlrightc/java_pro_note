package fileLrean;

import java.io.File;
import java.io.IOException;

public class Demo4_FileMethod {
    /*
     * * A:判断功能
     * public boolean isDirectory():判断是否是目录
     * public boolean isFile():判断是否是文件
     * public boolean exists():判断是否存在
     * public boolean canRead():判断是否可读
     * public boolean canWrite():判断是否可写
     * public boolean isHidden():判断是否隐藏
     * B:案例演示
     * File类的判断功能
     */
    public static void main(String[] args) throws IOException {
//        demo1();
       File file =new File("zzz");
       file.setReadable(false);//设置文件不可读
        System.out.println(file.canRead());//windows系统认为一切文件都是可读的
       file.setWritable(false);
        System.out.println(file.canWrite());//windows系统可以设置为不可写

        File file2=new File("aaa.txt");
        System.out.println(file2.isHidden());

        System.out.println(file.isHidden());
    }

    private static void demo1() throws IOException {
        File dir1 =new File("ccc");
        System.out.println(dir1.isDirectory());
        File dir2=new File("zzz");
        dir2.createNewFile();
        System.out.println(dir2.isDirectory());
        System.out.println(dir2.isFile());
    }
}
