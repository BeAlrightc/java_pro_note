package cn.xmcu.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;


//@WebFilter(
//		filterName="EncodeFilter",
//		description="This is a Encode Filter",
//		initParams= {@WebInitParam(name="encode",value="utf-8")},
//		value= {"*.do","/error"},
//		dispatcherTypes= {DispatcherType.REQUEST,DispatcherType.ERROR})
//		
//		
public class EncodeFilter implements Filter {
	private String encode = "GB2312";

    
    public EncodeFilter() {
    	
    }

	
	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/**
		 * 从url中获取信息
		 *
		HttpServletRequest req =(HttpServletRequest)request;
		PrintWriter out = response.getWriter();
		
		out.println("ServletPath="+req.getServletPath());
		out.println("ContextPath="+req.getContextPath());
		out.println("RequestURL="+req.getRequestURL());
		out.println("RequestURI="+req.getRequestURI());
		out.println("QueryString:"+req.getQueryString());
		*/
		request.setCharacterEncoding(encode);
		response.setContentType("text/html;charset="+encode);
		
		
		/**
		 * 做这个的目的是将servlet中涉及到中文的字符进行过滤转码
		 */
//		String code = "utf-8";
//		request.setCharacterEncoding(code);
//		response.setContentType("text/html;charset="+code);
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init");//容器启动时被调用
		String encode = fConfig.getInitParameter("encode");
		if(encode !=null) {
			this.encode =encode;		
		}
		System.out.println("encode="+encode);
	}
	
	public void destroy() {
		System.out.println("destroy");//被销毁时调用
	}

}
