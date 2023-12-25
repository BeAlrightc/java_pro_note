package cn.xmcu;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldMySerlet
 */
@WebService("/HelloWorldMySerlet")
public class HelloWorldMySerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		String englishGreeting = config.getInitParameter("english");
		String chineseGreeting = config.getInitParameter("chinese");
		System.out.println(englishGreeting + "\t" +chineseGreeting);
	}    
    


	


	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}





	@Override
	public void destroy() {
		System.out.println("destory()");
	}




	/**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldMySerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("HelloWorld ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
