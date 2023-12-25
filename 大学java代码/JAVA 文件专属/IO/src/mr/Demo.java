package mr;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 项目下的路径（默认路径）:word.txt
		 * 包中的文件路径：src/mr/word.txt
		 * 注意，/表示文件夹
		 *       \\表示文件夹
		 *       
		 * 绝对路径      
		 */
		//File f1 = new File("src/mr/word.txt");
		File f1 = new File("C:\\test\\word.txt");//绝对路径第一种构造方法
		
		System.out.println("文件是否存在："+f1.exists());
		System.out.println("文件名："+f1.getName());//输出文件名
		System.out.println("文件的绝对路径："+f1.getAbsolutePath());
		System.out.println("是否为影藏文件："+f1.isHidden());
		System.out.println("文件字节数："+f1.length());
		Date date = new Date(f1.lastModified());//修改时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("文件最后的修改时间："+sdf.format(date));
		
		//boolean del =f1.delete();
		//System.out.println("删除文件是否成功"+del);
		
		try {
			//已存在的文件，不能重新创建，不能覆盖已有文件
			
			boolean create = f1.createNewFile();
			System.out.println("创建文件是否成功："+create);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建一个空文件

	}

}
