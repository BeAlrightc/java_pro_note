package CV.COM;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MWER
 */
@WebServlet("/MWER")
public class MWER extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init(ServletConfig config) throws ServletException {
		String englishGreeting = config.getInitParameter("English");
		String chineseGreeting = config.getInitParameter("Chinese");
		System.out.println(englishGreeting + "\t"+chineseGreeting);
		
	}
	


	
       
    @Override
	public void destroy() {
		System.out.println("destroy()");
	}





	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}





	/**
     * @see HttpServlet#HttpServlet()
     */
    public MWER() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("tex/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>HelloWorld</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<p>Hello World!</p>");
		out.println("</body></html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
