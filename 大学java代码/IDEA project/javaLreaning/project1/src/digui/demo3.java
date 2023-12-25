package digui;

import java.io.*;

public class demo3 {
    /*
    从键盘接收两个文件夹路径，把其中一个文件夹中（包含内容）拷贝到另一个文件夹中
    分析：
    1.在目标文件夹中，创建源文件夹
    2.在获取源文件夹中所有的文件和文件夹，存储在file数组中
    3.遍历数组
    4.如果是文件就用io流读写，
    5.如果是文件夹就递归调用
     */
    public static void main(String[] args) throws IOException {
        File src= demo1.getDir();
        File dest =demo1.getDir();
        if(src.equals(dest)){//不允许自己烤自己
            System.out.println("目标文件夹是源文件的子文件夹");
        }else{
            copy(src,dest);
        }


    }
//此方法用于将文件夹拷贝到另一个文件当中
    /*
    1.返回值类型为void
    2.参数列表File src,File dest
     */
    public static void copy(File src, File dest) throws IOException {
        //1.在目标文件夹中，创建源文件夹
        File newDir =new File(dest,src.getName());//父集路径为dest,子集路径为src
        newDir.mkdir();
        // 2.在获取源文件夹中所有的文件和文件夹，存储在file数组中
        File [] subFiles =src.listFiles();
        //2.遍历数组
        for(File subFile : subFiles){
            if(subFile.isFile()){//如果是文件就直接IO流读写操作
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
                int b;
                while((b= bis.read())!=-1){
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else{//如果是文件就进行递归调用
                copy(subFile,newDir);//newDir作为目标路径使用
            }
        }
    }
}
