package cn.xmcu.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/addProduct.do","/addProduct.html"})
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddProductServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     request.getRequestDispatcher("/WEB-INF/html/addProduct.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("商品名称"+request.getParameter("productName"));
		out.println("数量"+request.getParameter("count"));
		out.println("价格"+request.getParameter("price"));
		out.println("产地"+request.getParameter("address"));
	}

}
