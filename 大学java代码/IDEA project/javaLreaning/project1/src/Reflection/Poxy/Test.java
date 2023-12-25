package Reflection.Poxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UserImpl ui =new UserImpl();
        ui.add();
        ui.delete();
        System.out.println("=========");

        MyInvocationHadler m=new MyInvocationHadler(ui);
        User u=(User) Proxy.newProxyInstance(ui.getClass().getClassLoader(),ui.getClass().getInterfaces(),m);
        u.add();
        u.delete();
    }


}
