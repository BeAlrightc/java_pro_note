package cn.xmcu.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.xmcu.bean.Student;


@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Redirect() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> data = Student.getData();
		//将Java对象序列化转换为json格式字符串
		String jsonData=JSON.toJSONString(data);
		System.out.println(jsonData);
		//对{,[,中文字符转码，每个字符被转码成%xxx的形式
		jsonData = URLEncoder.encode(jsonData,"UTF-8");
		System.out.println(jsonData);
		//response.sendRedirect(request.getContextPath()+"/url2.html");
		response.sendRedirect(request.getContextPath()+"/ShowData?student="+jsonData);
	   //response.sendRedirect("ShowData?"+Student.STUDENT+"="+jsonData);
	}

	
	

}
