package IoStream.study;

import java.io.*;

public class Test3 {
    //加密图片文件
    public static void main(String[] args) throws IOException {
        demos("jsop4.jpg","jsop5.jpg");
    }
    public static void demos(String a,String b) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(a));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(b));
        int s;
        while((s=in.read()) != -1){
            out.write(s ^ 1234);
        }
       in.close();
        out.close();
    }
}
