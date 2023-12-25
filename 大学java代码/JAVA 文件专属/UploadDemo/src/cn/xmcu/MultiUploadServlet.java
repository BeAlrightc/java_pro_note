package cn.xmcu;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/MultiUpload.action")
public class MultiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MultiUploadServlet() {
        super();
        
    }

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Collection<Part>parts=request.getParts();
		for(Part part : parts) {
			if(part !=null && part.getSize()>0) {
				String filePath = getFilePath(request,getFileName(part));
				part.write(filePath);
			}
		}
	
	}
	
	private String getFileName(Part part) {
		String header = part.getHeader("Content-Disposition");
		return header.substring(header.indexOf("filename=")+10,header.lastIndexOf("\""));
	}
	
	private String getFilePath(HttpServletRequest request,String fileName) {
		String uploadPath = request.getServletContext().getRealPath("/upload");
		return uploadPath+"/"+fileName;
	}

}
