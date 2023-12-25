package digui;

import java.io.File;

public class demo4 {
    /*
    需求：从键盘接收一个文件夹路径，把文件夹中所有文件以及文件夹的名字按层级打印，例如
     把文件夹中的所有文件以及该文件夹的名字按层级打印
     分析：
     1.获取所有的文件和文件夹，返回的是File数组
     2.遍历数组
     3.无论是文件还是文件夹，都需要直接打印
     4.如果是文件夹，递归调用
     打印效果如下：
     D:\Andriod
	D:\Andriod\avd
		D:\Andriod\avd\.android
			D:\Andriod\avd\.android\adbkey
			D:\Andriod\avd\.android\adbkey.pub
			D:\Andriod\avd\.android\avd
     D:\Andriod\资料
		D:\Andriod\资料\智慧城市平台Open API_V.2.0 .pdf
		D:\Andriod\资料\第三方插件
			D:\Andriod\资料\第三方插件\achartengine-1.1.0.jar
			D:\Andriod\资料\第三方插件\achartengineDemo.rar
			D:\Andriod\资料\第三方插件\android-async-http-1.4.3.jar
			D:\Andriod\资料\第三方插件\android-code-generator
     */
    public static void main(String[] args) {
      File dir =demo1.getDir();//获取文件夹路径
        printLev(dir,0);
    }
    public static void printLev(File dir,int lev){
       // 1.获取所有的文件和文件夹，返回的是File数组
       File [] subFiles =dir.listFiles();
       //2。遍历数组
        for(File subFile : subFiles){
            for(int i=0;i<=lev;i++){
                System.out.print("\t");//lev是多少就打印多少个tab键
            }
       //3.将该文件夹下的东西无论是文件还是文件夹，都需要直接打印
            System.out.println(subFile);
            //4.如果是文件夹，递归调用
            if(subFile.isDirectory()){//给他设定层级，为tab键打印做准备
                printLev(subFile,lev+1);
            }
        }
    }
}
