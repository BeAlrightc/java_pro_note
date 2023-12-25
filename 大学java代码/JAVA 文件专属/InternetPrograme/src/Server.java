import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
     public static void main(String[] args) {
	      try {
			ServerSocket server = new ServerSocket(1100);
			System.out.println("服务器启动成功，等待用户接入········");
			Socket client = server.accept();//等待用户接入
			System.out.println("有客户端接入，客户端IP"+client.getInetAddress());//获取客户端的地址
			
			InputStream in = client.getInputStream();
			byte[] bt = new byte[1024];
			int len = in.read(bt);
			String data = new String(bt,0,len);
			System.out.println("客户端发来消息："+data);
			
			OutputStream out = client.getOutputStream();
			String message = "这里是服务器，欢迎光临";
					
			out.write(message.getBytes());
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建服务器套接字
	      
     }
}
