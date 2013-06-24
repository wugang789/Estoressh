package com.mycompany.manager.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.mycompany.service.memberManagerDaoService;
/**
 * 会员操作action
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class memberManagerAction extends BaseAction {
	private memberManagerDaoService memberManagerDaoService;
	private static final String FINDALLMEMBER="findallmember";
	private static final String SEEKMEMBER="seekmember";
	private String username;
	/**
	 * 查看所有的会员
	 * @param managerDaoService
	 */
	@SuppressWarnings("unchecked")
	public String findAllMember(){
	 List list=	memberManagerDaoService.findAllMember();
	 System.out.println(list);
	 getSession().setAttribute("mymember", list);
		return FINDALLMEMBER;
	}
    /**
     * 删除会员
     * @param memberManagerDaoService
     * @throws UnsupportedEncodingException 
     */
	public String deleteMember() throws UnsupportedEncodingException{
		String name = new String(username.getBytes("ISO8859-1"), "UTF-8");
		System.out.println(name);
		memberManagerDaoService.deleteMember(name);
		return SUCCESS;
	}
	
	/**
	 * 查询会员
	 * @param memberManagerDaoService
	 * @throws UnsupportedEncodingException 
	 */
	@SuppressWarnings("unchecked")
	public String findMember() throws UnsupportedEncodingException{
		String name = new String(username.getBytes("ISO8859-1"), "UTF-8");
		System.out.println(name);
		List list=memberManagerDaoService.findMember(name);
		System.out.println(list);
		if(list.size()!=0){
		getSession().setAttribute("mylist", list);
		return SEEKMEMBER;
		}else{
			return SUCCESS;
		}
			
	}
	public void setMemberManagerDaoService(memberManagerDaoService memberManagerDaoService) {
		this.memberManagerDaoService = memberManagerDaoService;
	}

	public memberManagerDaoService getMemberManagerDaoService() {
		return memberManagerDaoService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
