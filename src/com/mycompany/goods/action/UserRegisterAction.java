package com.mycompany.goods.action;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.mycompany.entity.UserEntity;
import com.mycompany.service.UserDaoService;
import com.opensymphony.xwork2.Preparable;
/**
 * 用户注册action
 * @author Administrator
 *
 */
public class UserRegisterAction extends BaseAction implements Preparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5634645368215037331L;
	private static final String REGISTERSUCCESS="registersuccess";
	private UserEntity userEntity;
	private String username;
	private UserDaoService userDaoService;
	/**
	 * 用户注册
	 * @return
	 */
	public String registerUser(){
		userDaoService.RegisterUser(userEntity);
		getSession().setAttribute("userlist",userEntity);
	return REGISTERSUCCESS;	
	}
	
	
	/**
	 * 判断用户是否可以注册
	 * @param userEntity
	 * @throws IOException 
	 */
	@SuppressWarnings("unchecked")
	public String FindUserExist() throws IOException{
		 String name= new String(username.getBytes("ISO-8859-1"),"utf-8");
		List list=userDaoService.FindUserExist(name);
		PrintWriter out=getResponse().getWriter();
		 if(list.size()==0){
				out.print("可以注册");
		   }else {
			   out.print("此用户存在!");
		     }
		return null;
		
	}
	
	public UserDaoService getUserDaoService() {
		return userDaoService;
	}


	public void setUserDaoService(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public void prepare() throws Exception {
           System.out.println("sss");
           getSession().setAttribute("user", userEntity);
	}


}
