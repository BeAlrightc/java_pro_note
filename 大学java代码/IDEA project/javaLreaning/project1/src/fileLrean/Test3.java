package fileLrean;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {
    /*
    判断桌面是否为jpg的文件，如果有就输出该文件的名称
     */
    public static void main(String[] args) {
     File dir=new File("C:\\Users\\CHUAN GE PALY\\Desktop");
    /*
     String[] arr=dir.list();//获取所有的文件夹或文件名
        for(String str : arr){
            if(str.endsWith(".jpg")){
                System.out.println(str);
            }
          }

     File[] subFiles =dir.listFiles();//获取桌面所有的file文件对象
        for (File file:subFiles){
            if(file.isFile() && file.getName().endsWith(".jpg")){
                System.out.println(file.delete());//执行删除操作
                System.out.println(file);
            }
        }
     */
        String[] arr =dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
//                System.out.println(name);
                File file=new File(dir,name);//创建一个文件对象

                return file.isFile()&& file.getName().endsWith(".jpg");
            }
        });//
        for (String str : arr){
            System.out.println(str);
        }
    }
}
