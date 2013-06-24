package com.mycompany.manager.action;

import com.mycompany.entity.UserEntity;
import com.mycompany.service.managerDaoService;

/**
 *  管理员添加
 * @author Administrator
 *
 */
public class addManagerAction {
	private static final String SUCCESS="success";
	/**
	 * 用户实体引用
	 */
	private UserEntity userEntity;
	private Integer ismanager;
	/**
	 * 引用addmanagerService
	 */
	private managerDaoService managerDaoService;
	
	public String addManager(){
		userEntity.setIsmanager(ismanager);
		System.out.println(ismanager);
		managerDaoService.addManager(userEntity);
		return SUCCESS;
	}
	


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


	public UserEntity getUserEntity() {
		return userEntity;
	}


	public void setManagerDaoService(managerDaoService managerDaoService) {
		this.managerDaoService = managerDaoService;
	}



	public void setIsmanager(Integer ismanager) {
		this.ismanager = ismanager;
	}



	public Integer getIsmanager() {
		return ismanager;
	}
	
	
	
	

}
