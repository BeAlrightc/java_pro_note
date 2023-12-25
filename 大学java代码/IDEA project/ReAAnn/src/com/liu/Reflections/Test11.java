package com.liu.Reflections;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class Test11 {
    public void test01(Map<String,User>map, List<User> list){
        System.out.println("test01");
    }
    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
       Method method= Test11.class.getMethod("test01",Map.class,List.class);
        Type[] genericTypes  = method.getGenericParameterTypes();
        for(Type genericType : genericTypes){
            System.out.println("#"+genericType);
            if(genericType instanceof ParameterizedType){
               Type[] actualTypes = ((ParameterizedType) genericType).getActualTypeArguments();
              for(Type actualType : actualTypes){
                  System.out.println(actualType);
              }
            }
        }

        method= Test11.class.getMethod("test02",null);
        Type genericReturnType=method.getGenericReturnType();

        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments =((ParameterizedType)genericReturnType).getActualTypeArguments();
            for(Type actualTypeArgument : actualTypeArguments){
                System.out.println(actualTypeArgument);
            }
        }
    }
}
