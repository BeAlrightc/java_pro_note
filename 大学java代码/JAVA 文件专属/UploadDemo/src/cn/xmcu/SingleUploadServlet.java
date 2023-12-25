package cn.xmcu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/SingleUpload.action")
public class SingleUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SingleUploadServlet() {
        super();
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		Part part = request.getPart("file");
		if(part !=null && part.getSize()>0) {
			String header = part.getHeader("Content-Disposition");
			String fileName = header.substring(header.indexOf("filename=")+10,
					header.lastIndexOf("\""));
			String uploadPath = request.getServletContext().getRealPath("/upload");
			System.out.println(uploadPath);
			String filePath = uploadPath+"/"+fileName;
			part.write(filePath);
		}
			
		
	}

}
