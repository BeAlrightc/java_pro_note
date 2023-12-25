package com.liu.Reflections;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类的加载器
     ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("1s= "+systemClassLoader);

        //获取系统类加载器的父类加载器--》拓展类
       ClassLoader parent= systemClassLoader.getParent();
       System.out.println(parent);
       //获取拓展类加载器的父类加载器--》根加载器(c/c++)
        ClassLoader parent1=parent.getParent();
        System.out.println(parent1);//打印祖宗(null)

        //测试当前类是哪个类加载器加载的
       ClassLoader classLoader= Class.forName("com.liu.Reflections.Test07").getClassLoader();
       System.out.println(classLoader);
//测试jdk内置地类是谁加载的
        classLoader= Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获取系统类加载器可以加载地路径
        System.out.println(System.getProperty("java.class.path"));

        //双亲委派机制
          //java.lang.string
        /*
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\charsets.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\deploy.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\access-bridge-64.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\cldrdata.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\dnsns.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jaccess.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\jfxrt.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\localedata.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\nashorn.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunec.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunjce_provider.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunmscapi.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\sunpkcs11.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\ext\zipfs.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\javaws.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\jce.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfr.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\jfxswt.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\jsse.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\management-agent.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\plugin.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\resources.jar;
       C:\Program Files\Java\jdk1.8.0_102\jre\lib\rt.jar;
       D:\IDEA project\ReAAnn\out\production\ReAAnn;
       D:\IntelliJIDEA\IntelliJ IDEA 2020.2.3\lib\idea_rt.jar
        */
    }
}

