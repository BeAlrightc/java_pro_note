package otherStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo11_lastProperties {
    /*
    Properties的load和store()功能的了解
    Properties的load和store()功能
    案例演示
     */
    public static void main(String[] args) throws IOException {
        //框架中用的最多
        Properties prop =new Properties();
        System.out.println("读取前："+prop);
       prop.load(new FileInputStream("config.properties"));
       prop.setProperty("tel","12345678901123");//修改配置文件的属性值，
//将修改信息同步到config.properties当中，第二个参数xxx用来描述文件列表，如果不描述可以传入null没什么卵用
        prop.store(new FileOutputStream("config.properties"),"xxx");
        System.out.println("读取后："+prop);//读取配置文件当中的值
    }
}
