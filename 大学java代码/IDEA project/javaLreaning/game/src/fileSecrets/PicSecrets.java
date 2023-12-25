package fileSecrets;

import sun.nio.ch.Secrets;

import java.io.*;

public class PicSecrets {
    public static void main(String[] args) throws IOException {
        String so="PicSec\\mypic.jpg";
        String se="PicSec\\pics.jpg";
        Secrets(so,se);
        System.out.println("加密完成");

    }
    public static void Secrets(String source,String target) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
        int c=1234;//  c就是密码
        int b;
        while((b=bis.read()) != -1){
            bos.write(b^c);
        }
        bis.close();
        bos.close();

    }
}
