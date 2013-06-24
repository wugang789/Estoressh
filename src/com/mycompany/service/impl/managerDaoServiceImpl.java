package com.mycompany.service.impl;

import com.mycompany.dao.addManagerDao;
import com.mycompany.entity.UserEntity;
import com.mycompany.service.managerDaoService;

/**
 * 管理员添加
 * @author Administrator
 *
 */
public class managerDaoServiceImpl implements managerDaoService {
private  addManagerDao addManagerDao;

  /**
   * 管理员添加
   */
	public void addManager(UserEntity userEntity) {
     addManagerDao.addManager(userEntity);
		
		
	}
	
	
	
	public void setAddManagerDao(addManagerDao addManagerDao) {
		this.addManagerDao = addManagerDao;
	}

}
