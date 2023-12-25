package XianCheng.Thread2;

import java.io.IOException;
//Runtime 类
//单例设计模式应用场景
public class Demo2_SingBack_RunTime {
    public static void main(String[] args) throws IOException {
        Runtime r=Runtime.getRuntime();//获取运行时对象（因为私有了构造方法所以不能直接进行new对象的操作）
   //r.exec("shutdown -s -t 300");//执行windowsCmd中的命令
    r.exec("shutdown -a");
    }

}
