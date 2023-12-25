package fileLrean;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {
    /*
     * * A:获取功能
     * public String getAbsolutePath()：获取绝对路径
     * public String getPath():获取路径
     * public String getName():获取名称
     * public long length():获取长度。字节数
     * public long lastModified():获取最后一次的修改时间，毫秒值
     * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
     * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
     */
    public static void main(String[] args) {
//        demo1();
        //定义一个文件夹对象
        File dir =new File("D:\\myfile\\java基础学习\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19(异常&IO(File类))\\day19(异常&IO(File类))\\day19_video");

        String[] arr=dir.list();//仅为了获取文件名
         //拿到该目录下的所有文件名（仅仅为了获取名字）
        for (String string:arr) {
            System.out.println(string);
        }

        //获取每一目录的文件对象(获取的是文件对象，是可以对文件进行操作的)
        File[] subFiles=dir.listFiles();
        for (File file:subFiles) {
            System.out.println(file);//打印出文件对象
        }

    }

    private static void demo1() {
        // File file1 = new File("werw.txt");
        File file3 = new File("D:\\IDEA project\\javaLreaning\\wer.txt");
        //获取绝对路径
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file2.getAbsolutePath());
        //获取构造方法的传入路径
//        System.out.println(file1.getPath());//输出:  ccc.txt
        System.out.println(file3.getName());
        System.out.println(file3.length());
        System.out.println(file3.lastModified());//文件最后修改时间的毫秒值

        Date d=new Date(file3.lastModified());
        System.out.println(d);//Thu Jul 21 12:59:01 CST 2022
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年M月dd日 HH:mm:ss");
        System.out.println(sdf.format(d));
    }

}
