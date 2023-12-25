package cn.xmcu;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListener implements HttpSessionListener {
      private volatile static int counter;
   
    public SessionListener() {
       
    }

	
    public void sessionCreated(HttpSessionEvent se)  { 
    	
         synchronized(this){
        	 SessionListener.counter++;
         };
         System.out.println("session建立，当前counter数为："+counter);
    }

	
    

	public void sessionDestroyed(HttpSessionEvent se)  { 
		synchronized(this){
       	 SessionListener.counter--;      	 
        };
        System.out.println("session销毁，当前counter数为:"+counter);
    }
	
	public static int getCounter() {
		return counter;
	}
	
	
}
