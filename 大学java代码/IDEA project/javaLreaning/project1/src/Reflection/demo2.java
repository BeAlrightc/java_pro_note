package Reflection;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Class clazz =Class.forName("Reflection.DemoClass");
        DemoClass demoClass = (DemoClass) clazz.newInstance();
        demoClass.run();


    }

}
