package IPA;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {

	public static void main(String[] args) {
		try {
//			InetAddress local =InetAddress.getLocalHost();
//			
//			InetAddress local =InetAddress .getByName("www.baidu.com");
//			System.out.println(local);
//			System.out.println("计算机名："+local.getHostName());
//			System.out.println("ip地址："+local.getHostAddress());
		InetAddress baidu[] = InetAddress.getAllByName("www.baidu.com");
			for(InetAddress ad:baidu) {
				System.out.println("IP:"+ad.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//获取本地主机地址对象

	}

}
