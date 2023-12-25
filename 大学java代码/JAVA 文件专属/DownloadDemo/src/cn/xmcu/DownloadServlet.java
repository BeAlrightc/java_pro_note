package cn.xmcu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DownloadServ")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DownloadServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/force-download");//设置文件类型，强迫其下载
		String fileName = "我最帅.docx";//设置文件变量（文件名必须和自己准备的文件名一致）
		String filePath = request.getServletContext().getRealPath("/Download")+"/"+fileName;//设置服务器自身准备文件的路径
		System.out.println("filePath="+filePath);//输出文件路径
		fileName = new String(fileName.getBytes("utf-8"),"iso-8859-1");//创建一个文件对象并设置其文件字符编码格式
		response.addHeader("Content-Disposition", "attachment;filename="+fileName);//给浏览器一个文件头域
		
		OutputStream os = null;//新建一个输出流（空的）
		InputStream is = null;//新建一个输入流（空的）
		
		try {
			os = response.getOutputStream();//建立一个输出流对象
			is = new FileInputStream(filePath);//建立一个输入流对象（将文件包装进去）
			byte[] buffer = new byte[1024];//建立一个缓冲流并指定其大小
			int len = 0;//建立一个计数器也可以叫做下标
			while ((len = is.read(buffer)) > 0) {//将文件写入输入流（循环写入）
				os.write(buffer, 0, len);//将缓冲写入输出流并进行输出操作
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(os != null) os.close();//关闭输出流
			if(is != null) is.close();//关闭输入流
		}
		
	}

	
	

}
