package mr;

import java.io.File;
import java.io.FileInputStream;//输入流，把文件中的信息读取出来
import java.io.FileNotFoundException;
import java.io.FileOutputStream;//输出流，把东西写进文件
import java.io.IOException;

public class Fly {

	public static void main(String[] args) {
		File f = new File("word.txt");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(f,false);//文件字节输出流，在文件末尾追加内容
			//out = new FileOutputStream(f,false);//文件字节 输出流，会被替换
			
			String str = "你见过洛杉矶，凌晨四点的样子吗";
			byte b[] = str.getBytes();//字符串转化为字节数组
			out.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);//输入流文件
			byte b2[] = new byte[1024];//缓冲区
			int len=in.read(b2);//读入缓冲数组的字节数
			System.out.println("文件中的数据是："+new String(b2,0,len));//去掉空格
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in !=null) {
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
