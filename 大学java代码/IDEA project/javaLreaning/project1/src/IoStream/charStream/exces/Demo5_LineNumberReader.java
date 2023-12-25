package IoStream.charStream.exces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo5_LineNumberReader {
    public static void main(String[] args) throws IOException {
        //为读出的文本加上行号
        LineNumberReader Inr = new LineNumberReader(new FileReader("ssd.txt"));
        String line;
        Inr.setLineNumber(100);//设置行号，以101开始
        while ((line = Inr.readLine()) != null) {//每rendline一次，成员变量就++一次
            System.out.println(Inr.getLineNumber()+":"+line);
        }
        Inr.close();
    }
}
