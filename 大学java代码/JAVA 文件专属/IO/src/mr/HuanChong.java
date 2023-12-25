package mr;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HuanChong {
	/*
	 * 缓冲字节流的输入字节流效果展示及效率
	 */

	public static void main(String[] args) {
		File f = new File("C:\\Users\\CHUAN GE PALY\\Desktop\\跟阿铭学Linux（第二版）.chm"); 
        BufferedInputStream bi = null;//大大提高效率
		FileInputStream in = null;
		long start = System.currentTimeMillis();//获取程序流开始毫秒值
		try {
			in = new FileInputStream(f);
			bi = new BufferedInputStream(in); //将文件字节流包装成缓冲字节流
			byte b[] = new byte[1024];//缓冲区字节数组(这个缓冲区与buffered不同)
			while(bi.read(b) !=-1){//使用缓冲流读取数据
				
			}
			long end = System.currentTimeMillis();//获取程序流结束毫秒值
			System.out.println("运行经历的毫秒数："+(end-start));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(f !=null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bi != null) {
				try {
					bi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
