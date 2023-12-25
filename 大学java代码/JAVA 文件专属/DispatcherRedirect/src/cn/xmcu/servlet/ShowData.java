package cn.xmcu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xmcu.bean.Student;
import com.alibaba.fastjson.JSON;

@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowData() {
        super();
    }

	
    @SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Student> data = (List<Student>)request.getAttribute(Student.STUDENT);
		if(data == null) {
			//getParameter 方法对查询串的处理；
			//先将%xxx字符对应的字节码转码，再用默认的字符集ISO-8859-1解码为字符
			String jsonData = request.getParameter(Student.STUDENT);
			//先用ISO-8859-1编码为字节码，再用UTF-8解码为字符
					
			jsonData =new String(jsonData.getBytes("UTF-8"),"UTF-8");
			
			//将json格式字符串反序列化转换为Java对象
			data = JSON.parseArray(jsonData,Student.class);
		
	}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		for(Student student: data) {
			out.println(student.getName()+"\t"+student.getAge()+"<br/>");
		}
		

	
	
	}

}
