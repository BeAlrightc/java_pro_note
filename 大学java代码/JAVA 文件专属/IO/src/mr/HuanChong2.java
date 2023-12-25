package mr;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HuanChong2 {

	public static void main(String[] args) {
		File f = new File("word.txt");
		FileOutputStream out = null;
		BufferedOutputStream bo = null;
		
		try {
			out = new FileOutputStream(f);
			bo = new BufferedOutputStream(out);//文件输出流包装
			String str = "天生我才必有用，千金散尽还复来";
			byte b[] = str.getBytes();
			bo.write(b);
			//使用缓冲字节流时，要多使用刷新操作否则缓冲区会等待
			bo.flush();//刷新。强制将缓冲区数据写入文件中即使缓冲区没有写满
			
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
			if(bo !=null) {
				try {
					bo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
