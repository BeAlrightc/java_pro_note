package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sender extends Thread{
     int port = 9898;//端口
     InetAddress group;//广播组地址
     MulticastSocket socket;//多播组数据包套接字
     
     public Sender() {
    	 //广播组地址范围：224.0.0.0~239.255.255.255
    	 try {
			group = InetAddress.getByName("224.255.10.0");//指定广播组地址
			try {
				socket = new MulticastSocket(9898);//实例化多播数据包套接字
				socket.joinGroup(group);//加入广播组
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     
	@Override
	public void run() {
		while(true) {
		DatagramPacket packet;
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
		String message = "["+sf.format(date)+"]天气预报当前天气，晴。";
		byte data[] = message.getBytes();
		packet = new DatagramPacket(data, data.length,group,port);//创建数据包
		System.out.println(message);
		try {
			socket.send(packet);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
	public static void main(String[] args) {
		Sender send = new Sender();
		send.start();

	}

}
