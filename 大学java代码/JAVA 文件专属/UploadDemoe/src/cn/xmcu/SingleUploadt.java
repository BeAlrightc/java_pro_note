package cn.xmcu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class SingleUploadt
 */
@MultipartConfig
@WebServlet("/SingleUploadt")
public class SingleUploadt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleUploadt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Part part = request.getPart("file");
		if(part !=null&&part.getSize() > 0) {
			//获取上传的header的Content-Disposition值：form-data;name="file";filename="xxxx.xxx"
			String header = part.getHeader("Content-Disposition");
			//获取上传的文件名
		String fileName = header.substring(header.indexOf("filename=")+10,header.lastIndexOf("\""));
			//保存至网站uploadt目录
			String uploadPath = request.getServletContext().getRealPath("/uploadt");
			System.out.println(uploadPath);
			String filePath = uploadPath +"/"+fileName;
			part.write(filePath);
//		request.setCharacterEncoding("utf-8"); 
//		Part part = request.getPart("file");
//		if(part !=null && part.getSize()>0) {
//			String header = part.getHeader("Content-Disposition");
//			String fileName = header.substring(header.indexOf("filename=")+10,
//					header.lastIndexOf("\""));
//			String uploadPath = request.getServletContext().getRealPath("/uploadt");
//			System.out.println(uploadPath);
//			String filePath = uploadPath+"/"+fileName;
//			part.write(filePath);
		}
	}

}
