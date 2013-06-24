package com.mycompany.goods.action;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import com.mycompany.entity.UserEntity;
import com.mycompany.service.UserDaoService;
public class LoginAction extends BaseAction {
	private static final long serialVersionUID = 2977239595386256832L;
	private static final String LOGINSUCCESS = "loginsuccess";
	private static final String USERLOGINERROR = "userloginerror";
	private static final String LOGINOUT="loginout";
	private UserEntity userEntity;
	private UserDaoService userDaoService ;
	private ByteArrayInputStream inputStream;
	private String mynumber;
	private String name;
	/**
	 * 前台用户登录
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String UserLogin() {
		List list = userDaoService.UserLogin(userEntity.getName(),userEntity.getPassword());
		UserEntity myuserEntity = null;
		List<UserEntity> mylist=new ArrayList<UserEntity>();
		for (int i = 0; i < list.size(); i++) {
			myuserEntity = (UserEntity) list.get(i);
			mylist.add(myuserEntity);
		}
		if (list.size() == 0) {
			return USERLOGINERROR;
		} else {

			if (myuserEntity.getName().equals(userEntity.getName())
					&& myuserEntity.getPassword().equals(userEntity.getPassword())) {
				getSession().setAttribute("username", userEntity.getName());
				getSession().setAttribute("userid", myuserEntity.getId());
				  getSession().setAttribute("userlist", mylist);
				return LOGINSUCCESS;
			} else {
				return USERLOGINERROR;
			}

		}
	}
/**
 * 用户注销
 * @return
 */
	public String UserLoginOut(){
		
		getSession().removeAttribute("username");
		System.out.println("用户退出");
		return LOGINOUT;
	}
	/**
	 * 后台用户登录
	 * @return
	 */
	
	public String ManagerLogin()throws Exception{
		getSession().removeAttribute("myrand");
//      在内存中创建图象  
        int width=85, height=20;  
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
//       获取图形上下文  
        Graphics g = image.getGraphics();  
//      生成随机类  
        Random random = new Random();  
//       设定背景色  
        g.setColor(getRandColor(200,250));  
        g.fillRect(0, 0, width, height);  
//      设定字体  
        g.setFont(new Font("Times New Roman",Font.PLAIN,18));  
//       随机产生155条干扰线，使图象中的认证码不易被其它程序探测到  
        g.setColor(getRandColor(160,200));  
        for (int i=0;i<155;i++)  
        {  
         int x = random.nextInt(width);  
         int y = random.nextInt(height);  
                int xl = random.nextInt(12);  
                int yl = random.nextInt(12);  
         g.drawLine(x,y,x+xl,y+yl);  
        }  
//       取随机产生的认证码(6位数字)  
        String sRand="";  
        for (int i=0;i<6;i++){  
            String rand=String.valueOf(random.nextInt(10));  
            sRand+=rand;  
            // 将认证码显示到图象中  
            g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));  
//      调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成  
            g.drawString(rand,13*i+6,16);  
        }  
//       图象生效  
        g.dispose();  
        ByteArrayOutputStream output = new ByteArrayOutputStream();  
        ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);  
        ImageIO.write(image, "JPEG", imageOut);  
        imageOut.close();  
        ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());  
        this.setInputStream(input); 
//      将认证码存入SESSION  
        getSession().setAttribute("myrand", sRand);
        System.out.println("图片数字"+sRand);
        return SUCCESS;  
    }  
	
	
	
	
    /*  
     * 给定范围获得随机颜色  
     */  
    private Color getRandColor(int fc,int bc){  
        Random random = new Random();  
        if(fc>255) fc=255;  
        if(bc>255) bc=255;  
        int r=fc+random.nextInt(bc-fc);  
        int g=fc+random.nextInt(bc-fc);  
        int b=fc+random.nextInt(bc-fc);  
        return new Color(r,g,b);  
   } 
    
    /**
     * 用户后台登陆2
     * @param inputStream
     * @throws IOException 
     */
    public String ManagerLoginBehind() throws IOException{
    	PrintWriter out=getResponse().getWriter();
    	System.out.println(mynumber);
    	System.out.println(getSession().getAttribute("myrand"));
    	String number=(String) getSession().getAttribute("myrand");
    	if(mynumber.equals(number)){
    		
    	}else{
    		out.write("输入验证码错误 !");
    	}
    	
    	return null;
    }
    
    /**
     * 后台用户登录3
     * @param inputStream
     * @throws IOException 
     */
    @SuppressWarnings("unchecked")
	public String loginManager() throws IOException{
    	String number=(String) getSession().getAttribute("myrand");
    	System.out.println(mynumber+">>"+number);
    	System.out.println(userEntity.getName());
    	//System.out.println(userEntity.getName()+">>>."+userEntity.getPassword());
    List list=userDaoService.loginManager(userEntity.getName(),userEntity.getPassword());
    	System.out.println(list.size());
       if(mynumber.equals(number)){
    	   System.out.println("???????????/");
    	   if(list.size()>0){
    		   System.out.println("<<<<<<,,,,");
    		   
    		   String jsw = "{\"a\":\"超级管理员\"}";
    		   System.out.println(userEntity.getName());
    		   if(userEntity.getName().equals("admin")){
    			   System.out.println("///");
    			   getResponse().getWriter().write(jsw);
    			   getSession().setAttribute("managername",userEntity.getName());
    		   }else{
    		   getSession().setAttribute("managername",userEntity.getName());
   			getResponse().getWriter().write(jsw);
    		   System.out.println("......");}
   			//getResponse().sendRedirect("/Estoressh/managerjsp/admin.jsp");
       	}else{
       		String js = "{\"a\":\"用户名或密码错误 !\"}";
			getResponse().getWriter().write(js);
       	}
    		
    	}else{
    		String js = "{\"a\":\"输入验证码错误 !\"}";
			getResponse().getWriter().write(js);
    		
    	}
       return null;
    }
    
    
    
    
    
    
    public void setInputStream(ByteArrayInputStream inputStream) {  
        this.inputStream = inputStream;  
    }  
    public ByteArrayInputStream getInputStream() {  
        return inputStream;  
    }
	
	public UserDaoService getUserDaoService() {
		return userDaoService;
	}
	public void setUserDaoService(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	public void setMynumber(String mynumber) {
		this.mynumber = mynumber;
	}
	public String getMynumber() {
		return mynumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
}
