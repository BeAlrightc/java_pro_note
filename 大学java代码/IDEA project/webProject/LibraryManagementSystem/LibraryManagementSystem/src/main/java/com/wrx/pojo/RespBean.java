package com.wrx.pojo;

/**
 * 公用返回对象
 */
public class RespBean {
    private Object object;
    private String message;
    private long code;


    public static RespBean success(String message){
        return new RespBean(null,message,200);
    }

    public static RespBean success(Object object){
        return new RespBean(object,"success",200);
    }

    public static RespBean success(Object object,String message){
        return new RespBean(object,message,200);
    }

    public static RespBean error(String message){
        return new RespBean(null,"success",500);
    }




    public RespBean(Object object, String message, long code) {
        this.object = object;
        this.message = message;
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
