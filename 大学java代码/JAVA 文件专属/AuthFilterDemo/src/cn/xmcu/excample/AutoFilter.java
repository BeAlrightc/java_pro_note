package cn.xmcu.excample;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("*.html")//拦截所有后缀为html的资源请求
public class AutoFilter implements Filter {

    
    public AutoFilter() {
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String servletPath =req.getServletPath();
		System.out.println("In filter : servletPath="+servletPath);
		/**
		 * 判断是否为获取问卷及提交问卷的方式
		 */
		if(servletPath.equals("/question.html")&&!isLogined(req)) {
			//如果没有登录，重定向到登录界面
			res.sendRedirect(req.getContextPath()+"/login.html");
			return;//如果判断错误的话就返回了不能继续放行
		}
		chain.doFilter(request, response);
	}
	
	/**
	 * 判断是否登录
	 * @param request
	 * @return
	 */
	private boolean isLogined(HttpServletRequest request) {
		HttpSession session =request.getSession(false);
		return session ==null?false:true;		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
