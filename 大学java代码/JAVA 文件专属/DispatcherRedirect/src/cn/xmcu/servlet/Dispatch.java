package cn.xmcu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xmcu.bean.Student;


@WebServlet("/Dispatch")
public class Dispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Dispatch() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  List<Student> data = Student.getData();
	  request.setAttribute(Student.STUDENT, data);
	  RequestDispatcher rd =request.getRequestDispatcher("ShowData");	  
	  rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
