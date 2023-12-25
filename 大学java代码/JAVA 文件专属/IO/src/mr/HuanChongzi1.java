package mr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HuanChongzi1 {

	public static void main(String[] args) {
		File f = new File("words.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			fw = new FileWriter(f);
//			bw = new BufferedWriter(fw);
//			
//			String str = "世界这么大";
//			String str2= "我想去看看";
//			bw.write(str);//第一行数据
//			bw.newLine();
//			bw.write(str2);//第二行数据
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {//注意流的关闭顺序，先关比后创建的！
//			if(bw != null) {
//				try {
//					bw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(fw != null) {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		}
    
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br  = new BufferedReader(fr);
			String tmp = null;
			int i = 1;//计数器  
			while((tmp = br.readLine()) !=null) {//循环读取文件中的内容
				System.out.println("第"+i+"行的内容:"+tmp);
				i++;
			}
			br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br !=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(br !=null) {
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
