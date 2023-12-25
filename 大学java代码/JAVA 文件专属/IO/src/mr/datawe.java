package mr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class datawe {

	public static void main(String[] args) {
		File f = new File("word1.txt");
		FileOutputStream out =null;
		DataOutputStream dos = null;
		try {
			out = new FileOutputStream(f);
			dos  = new DataOutputStream(out);
			
			dos.writeUTF("这是写入字符串数据");
			dos.writeInt(123);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(dos !=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out !=null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		DataInputStream di = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
			di = new DataInputStream(in);
			System.out.println("readUTF()读取数据："+di.readUTF());
			System.out.println("readInt()读取数据："+di.readInt ());
			System.out.println("readDouble()读取数据："+di.readDouble());
			System.out.println("readBoolean()读取数据："+di.readBoolean());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(di != null) {
				try {
					di.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 if(in != null) {
			 try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			
		}

	}

}
