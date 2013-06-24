package com.mycompany.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class managerFilter implements Filter{

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest)request;
		String current=req.getRequestURI();
		System.out.println(current);
		HttpServletResponse res = (HttpServletResponse) response;
		  if(req.getSession().getAttribute("managername")==null){
			  System.out.println("每次都执行的ManagerFilter");
		      res.sendRedirect("/Estoressh/login/login.jsp");
		      return;
		   } else {
		      chain.doFilter(request, response);
		   }
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
