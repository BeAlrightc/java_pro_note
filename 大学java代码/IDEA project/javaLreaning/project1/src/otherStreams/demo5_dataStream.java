package otherStreams;

import java.io.*;

public class demo5_dataStream {
    /*
    1.什么是数据输入输出流
     DataInputStream，DataOutputStream可以按照基本数据类型大小读写数据
     例如按照Long大小写一个数字，写出时该数据占8字节，读取的时候也可以按照Long类型读取，
     一次读取8个字节
     2.使用方式
       DataOutputStream(outputStream),writeInt(),writeLong();
       00000000 00000000 00000011 11100101 int类型的997
       11100101 前三个八位砍掉之后将这个数写进去
     */
    public static void main(String[] args) throws IOException {
       //demo1();
        //demo2();
//        demo3();
       DataInputStream dis =new DataInputStream(new FileInputStream("h.txt"));
       int x=dis.readInt();
       int y =dis.readInt();
       int z =dis.readInt();
        System.out.println(x);//997 原样打印
        System.out.println(y);//998
        System.out.println(z);//999
        dis.close();
    }

    private static void demo3() throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("h.txt"));
        dos.writeInt(997);
        dos.writeInt(998);
        dos.writeInt(999);
        dos.close();
    }

    private static void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("h.txt");
        int x=fis.read();
        int y=fis.read();
        int z=fis.read();
        System.out.println(x);//229  997砍掉前三个八位后11100101
        System.out.println(y);//230
        System.out.println(z);//231
    }

    private static void demo1() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("h.txt"));
        out.write(997);//会将前三个八位给砍掉
        out.write(998);
        out.write(999);
        out.close();
    }
}
