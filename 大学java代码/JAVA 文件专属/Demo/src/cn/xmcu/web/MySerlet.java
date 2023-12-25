package cn.xmcu.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySerlet
 */
//@WebServlet("/MySerlet")
public class MySerlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
     
	@Override
	public void init(ServletConfig config) throws ServletException {
		String englishGreeting = config.getInitParameter("english");
		String chineseGreeting = config.getInitParameter("chinese");
		System.out.println( englishGreeting+ "\t" +chineseGreeting );
		
	}
	
	
    @Override
	public void destroy() {
		System.out.println("destroy()");
	}


	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
		super.service(arg0, arg1);
	}

	

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MySerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>HelloWorld</title></head>");
	    out.println("<body bgcolor=\"#ffffff\">");
	    out.println("<h4>Hello World!</h4>");
	    out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
