package cn.xmcu;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URLDecoder;
import java.sql.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}
	
	private void getDataFromInputStream(HttpServletRequest request) throws IOException{
		Reader reader = new InputStreamReader(request.getInputStream());
		StringBuffer stringBuffer = new StringBuffer();
		int data;
		while((data = reader.read()) != -1){
		stringBuffer.append( (char)data);
		}
		reader.close();
		String result = stringBuffer.toString();
		System.out.println("没有处理编码的结果："+result);
	
		System.out.println("处理编码的结果："+URLDecoder.decode(result,"UTF-8"));
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getDataFromInputStream(request);
		//ISO-8859-1
		request.setCharacterEncoding("utf-8");
		/*Map<String, String[]> formData = request.getParameterMap();
		String username = formData.get("username")[0];
		String password = formData.get("password")[0]; */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex").trim();
		int age = Integer.parseInt(request.getParameter("age"));
		Date birthday = Date.valueOf(request.getParameter("birthday"));
		String strActive = request.getParameter("active");
		boolean isActive = strActive==null?false:true;
		String[] fruits=request.getParameterValues("Fruit");
		System.out.println("username="+username);
		System.out.println("password="+password);
		System.out.println("sex="+sex);
		System.out.println("age="+age);
		System.out.println("birthday="+birthday);
		String fruit = "";
		for(String item : fruits){
		fruit += item + "\t";
		}
		System.out.println("fruit="+fruit);
		System.out.println("isActive="+isActive);
		}
		
}


