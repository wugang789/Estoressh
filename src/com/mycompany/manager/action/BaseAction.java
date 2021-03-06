package com.mycompany.manager.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6727274930255025606L;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	public HttpServletResponse getResponse() {
		return response;
	}
	
	public HttpSession getSession() {
		return request.getSession();
	}
	
}
