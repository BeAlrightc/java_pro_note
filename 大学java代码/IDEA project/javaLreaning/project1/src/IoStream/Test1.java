package IoStream;

import java.io.*;

public class Test1 {
    //图片加密与解密：将写出的一个字节异或上一个数,那么这个数就是秘钥，解密的时候就在异或一下就可以了
    public static void main(String[] args) throws IOException {
        demo("copyy.jpg","copy3.jpg");//前面是加密后的图片，后面是解密后的图片
    }

    private static void demo(String start,String end) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream(start));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(end));

        int b;
        while((b=bis.read()) != -1){
            bos.write(b ^ 123);
        }
        bis.close();
        bos.close();
    }
}
