package mr;

import java.io.File;
import java.io.IOException;

public class Fie {

	public static void main(String[] args) {
		File f1 =new File("C:\\test\\feile1.txt");
//		try {
//			boolean fe = f1.createNewFile();
//			System.out.println("文件是否创建成功："+fe);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("文件名:"+f1.getName());
		System.out.println("文件名:"+f1.getAbsolutePath());
		System.out.println("文件名:"+f1.getParent());
		System.out.println("文件名:"+f1.length());

	}

}
