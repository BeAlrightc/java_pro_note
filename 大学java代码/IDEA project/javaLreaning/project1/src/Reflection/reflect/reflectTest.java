package Reflection.reflect;

import Reflection.DemoClass;

import java.io.BufferedReader;
import java.io.FileReader;

public class reflectTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("xxxxconfig.properties"));
        Class clazz=Class.forName(br.readLine());//读取配置文件的类名获取字节码文件对象
        DemoClass be= (DemoClass) clazz.newInstance();//创造一个实例对象
        be.run();
    }
}
