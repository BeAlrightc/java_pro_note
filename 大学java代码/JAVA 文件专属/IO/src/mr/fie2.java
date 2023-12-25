package mr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;//字符输入流，读文件
import java.io.FileWriter;//字符输出流，写文件
import java.io.IOException;

public class fie2 {

	public static void main(String[] args) {
		File f = new File("C:\\test\\word.txt");
		
//		FileWriter fw = null;
//		
//		try {
//			
//			
//			//fw = new FileWriter(f,true);//在原文件追加新内容
//			fw = new FileWriter(f,false);//替换
//			String str= "天行健，自强不息，地势坤，厚德载物！";
//			fw.write(str);//将字符串写入文本文档
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(fw !=null) {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}

		
		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
			
			char ch[] = new char[1024];//缓冲区
			int count ;//已读出的字符数
			while((count = fr.read(ch))!=-1) {//循环读取文件中的数据，直到所有数据被读完
				System.out.println("文件中的内容为："+new String(ch,0,count));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr !=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
