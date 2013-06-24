package com.mycompany.service.impl;

import java.util.List;

import com.mycompany.dao.memberManager;
import com.mycompany.service.memberManagerDaoService;

/**
 *会员操作service
 * 
 * @author Administrator
 * 
 */
public class memberManagerDaoServiceImpl implements memberManagerDaoService {
	private memberManager membermanager;

	/**
	 *查询所有的会员
	 */
	@SuppressWarnings("unchecked")
	public List findAllMember() {
		List list = membermanager.findAllMember();
		return list;
	}
    /**
     * 删除会员
     */
	public void deleteMember(String username) {
		System.out.println(username);
		membermanager.deleteMember(username);
	}
	
	
	public void setMembermanager(memberManager membermanager) {
		this.membermanager = membermanager;
	}

	public memberManager getMembermanager() {
		return membermanager;
	}
	/**
	 * 查询会员
	 */
	@SuppressWarnings("unchecked")
	public List findMember(String name) {
		List list=membermanager.findMember(name);
		return list;
	}


}
