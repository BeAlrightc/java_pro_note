package digui;

import java.io.File;
import java.util.Scanner;

public class demo1 {
    /*
    需求：1.从键盘接收一个文件夹路径，统计该文件夹大小
   1. 从键盘录入对象
   2.定义一个无限循环
   3.将键盘录入的结果存储，并封装成file对象
   4.对file对象判断
   5.将文件夹路径对象返回

   统计该文件夹大小
     1.定义一个求和变量
     2.获取该文件夹下所有的文件和文件夹listFiles();
     3.遍历数组
     4.判断是文件就计算大小就累加
     5.判断是文件夹就递归调用
     */
    public static void main(String[] args) {
            File dir =getDir();
        System.out.println("该文件夹的大小为："+getFileLength(dir)+"bytes");
    }
    /*
    方法1：从键盘接收一个文件夹路径
    1.返回值类型File
    2.参数列表
     */
    public static File getDir(){
        //1.创建键盘录入对象
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        //2.定义一个无限循环
        while(true){
            //  3.将键盘录入的结果存储，并封装成file对象
            String line =sc.nextLine();
            File dir =new File(line);
            //4.对file对象判断
            if(!dir.exists()){
                System.out.println("您录入的文件夹不存在，请输入一个文件夹路径");
            }else if(dir.isFile()){
                System.out.println("您录入的是文件路径，请输入一个文件夹路径。");
            }else{
                // 5.将文件夹路径对象返回
                return dir;
            }
        }
    }
    //方法2.统计该文件夹大小
    /*
    1.返回值类型为long
    2,参数列表为File dir
     */

    public static long getFileLength(File dir){
     //  1.定义一个求和变量
        long len=0;
        //  2.获取该文件夹下所有的文件和文件夹listFiles();
        File [] subFiles =dir.listFiles();
        //3.遍历数组
        for(File subFile:subFiles){
         // 4.判断是文件就计算大小就累加
            if(subFile.isFile()){
                len=len+subFile.length();
                //  5.判断是文件夹就递归调用
            }else{
                len=len+getFileLength(subFile);//进行递归调用又获取一个长度
            }
        }
    return len;
    }
}
