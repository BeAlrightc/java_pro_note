package IoStream.charStream.exces;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_fileWriter {
    //将字符写入到文件
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yyy.txt");
        fw.write("大家好，这里是你把在复习java基础知识！！！");
        fw.write(97);
        fw.close();
    }
}
