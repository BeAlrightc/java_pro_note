package Reflection.Poxy;

import java.lang.reflect.Proxy;

public class TestStu {
    public static void main(String[] args) {
        StudentImpl si =new StudentImpl();
        si.login();
        si.submit();

        System.out.println("=============");
        MyInvocationHadler mi =new MyInvocationHadler(si);//对si进行代理
        Student sii=(Student) Proxy.newProxyInstance(si.getClass().getClassLoader(),si.getClass().getInterfaces(),mi);
        sii.login();
        sii.submit();

    }
}
