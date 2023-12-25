package digui;

import java.io.File;
import java.util.Scanner;

public class demo2 {
    /*
    需求：从键盘接收一个文件夹路径，删除该文件
     */
    public static void main(String[] args) {
//        File dir =new File("D:\\a");
//        dir.delete();
        //经过递归删除之后
     File dir =getDir();
     deleteFile(dir);
    }
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
    /*
    删除该文件夹
      分析：
      1.获取该文件夹下的所欲文件和文件夹
      2.遍历数组
      3.判断是文件直接删除
      4.如果是文件夹就递归调用
      5.循环结束后就把空文件夹删除
     */


    //删除目录里的文件(自己写的)
    public static void deleteFile(File dir){
        //1.获取该文件夹下的所欲文件和文件夹
        File [] subFiles =dir.listFiles();//获取该文件下的文件
        //2.遍历数组
       for(File subFile : subFiles){
           //3.判断是文件直接删除
           if(subFile.isFile()){
               subFile.delete();
             //  4.如果是文件夹就递归调用
           }else{
               deleteFile(subFile);
           }
       }
       //6.将该空文件夹进行删除(该文件下的空文件夹)
        dir.delete();
    }
}
